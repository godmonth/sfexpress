package com.godmonth.sfexpress.bsp.impl;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.godmonth.sfexpress.bsp.SfExpressClient;
import com.godmonth.sfexpress.bsp.protocol.Request;
import com.godmonth.sfexpress.bsp.protocol.Response;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class SfExpressClientImpl implements SfExpressClient {
	private static final Logger logger = LoggerFactory.getLogger(SfExpressClientImpl.class);

	protected String secretKey;

	protected RestTemplate restTemplate;

	private String url;

	private XStream xStream;

	private String head;

	private static String md5hex(String xml, String secretKey) {
		String content = xml + secretKey;
		return Base64.encodeBase64String(DigestUtils.md5(content));
	}

	@SuppressWarnings("unchecked")
	public <REQ extends Request, RES extends Response> RES post(REQ request, Class<RES> responseClass) {
		request.setHead(head);
		String requestXml = xStream.toXML(request);
		String verifyCode = md5hex(requestXml, secretKey);
		logger.trace("verifyCode:{},requestXml:{}", verifyCode, requestXml);
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_FORM_URLENCODED));
		headers.setAcceptCharset(Arrays.asList(StandardCharsets.UTF_8));
		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.add("xml", requestXml);
		params.add("verifyCode", verifyCode);
		String response = restTemplate.postForObject(url, params, String.class);
		logger.trace("responseXml:{}", response);

		XStreamAlias annotation = responseClass.getAnnotation(XStreamAlias.class);
		Validate.notNull(annotation);
		String tag = annotation.value();
		XStream responseXstream = SimpleXstreamFactory.create();
		responseXstream.alias(tag, responseClass);
		return (RES) responseXstream.fromXML(response);
	}

	@Required
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	@Required
	public void setUrl(String url) {
		this.url = url;
	}

	@Required
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Required
	public void setxStream(XStream xStream) {
		this.xStream = xStream;
	}

	@Required
	public void setHead(String head) {
		this.head = head;
	}

}
