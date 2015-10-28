package com.godmonth.sfexpress.bsp.impl;

import java.util.TimeZone;

import org.apache.http.client.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.godmonth.sfexpress.bsp.SfExpressServiceWrapper;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

public class SfExpressServiceWrapperFactory implements InitializingBean {
	private static final Logger logger = LoggerFactory.getLogger(SfExpressServiceWrapperFactory.class);

	private String secretKey;

	private HttpClient httpClient;

	private RestTemplate restTemplate;

	private String url;

	private XStream xStream;

	@Override
	public void afterPropertiesSet() throws Exception {
		xStream = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
		xStream.autodetectAnnotations(true);
		xStream.ignoreUnknownElements();
		xStream.registerConverter(new DateConverter("yyyy-MM-dd HH:mm:ss", new String[0], TimeZone.getDefault()));

		if (restTemplate == null) {
			HttpComponentsClientHttpRequestFactory requestFactory = null;
			if (httpClient != null) {
				requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
			} else {
				requestFactory = new HttpComponentsClientHttpRequestFactory();
			}
			restTemplate = new RestTemplate(requestFactory);
		}

	}

	public SfExpressServiceWrapper build() {
		SfExpressServiceWrapperImpl expressServiceWrapper = new SfExpressServiceWrapperImpl();
		expressServiceWrapper.setRestTemplate(restTemplate);
		expressServiceWrapper.setSecretKey(secretKey);
		expressServiceWrapper.setxStream(xStream);
		expressServiceWrapper.setUrl(url);
		return expressServiceWrapper;
	}

	@Required
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public void setHttpClient(HttpClient httpClient) {
		this.httpClient = httpClient;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Required
	public void setUrl(String url) {
		this.url = url;
	}

	@Required
	public void setxStream(XStream xStream) {
		this.xStream = xStream;
	}

}
