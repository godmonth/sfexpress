package com.godmonth.sfexpress.bsp.impl;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.TimeZone;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.Validate;
import org.apache.http.client.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.godmonth.sfexpress.bsp.SfExpressServiceWrapper;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

public class SfExpressServiceWrapperImpl implements InitializingBean, SfExpressServiceWrapper {
	private static final Logger logger = LoggerFactory.getLogger(SfExpressServiceWrapperImpl.class);

	protected String secretKey;

	protected HttpClient httpClient;

	protected RestTemplate restTemplate;
	private String url;
	private XStream xStream;

	@Override
	public void afterPropertiesSet() throws Exception {
		xStream = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
		xStream.autodetectAnnotations(true);
		xStream.ignoreUnknownElements();
		xStream.registerConverter(new DateConverter("yyyy-MM-dd HH:mm:ss", new String[0], TimeZone.getDefault()));

		HttpComponentsClientHttpRequestFactory requestFactory = null;
		if (httpClient != null) {
			requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
		} else {
			requestFactory = new HttpComponentsClientHttpRequestFactory();
		}
		restTemplate = new RestTemplate(requestFactory);
	}

	private static String md5hex(String xml, String secretKey) {
		String content = xml + secretKey;
		return Base64.encodeBase64String(DigestUtils.md5(content));
	}

	@SuppressWarnings("unchecked")
	public <T> T post(Object request, Class<T> responseClass) {
		String requestXml = xStream.toXML(request);
		logger.trace("requestXml:{}", requestXml);
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_FORM_URLENCODED));
		headers.setAcceptCharset(Arrays.asList(StandardCharsets.UTF_8));
		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.add("xml", requestXml);
		params.add("verifyCode", md5hex(requestXml, secretKey));
		String response = restTemplate.postForObject(url, params, String.class);
		logger.trace("responseXml:{}", response);

		if (responseClass.equals(String.class)) {
			return (T) response;
		}
		XStreamAlias annotation = responseClass.getDeclaredAnnotation(XStreamAlias.class);
		Validate.notNull(annotation);
		String tag = annotation.value();
		xStream.alias(tag, responseClass);
		return (T) xStream.fromXML(response);
	}

	@Required
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	@Required
	public void setHttpClient(HttpClient httpClient) {
		this.httpClient = httpClient;
	}

	@Required
	public void setUrl(String url) {
		this.url = url;
	}

}
