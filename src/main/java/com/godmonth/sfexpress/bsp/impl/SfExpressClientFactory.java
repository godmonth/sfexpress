package com.godmonth.sfexpress.bsp.impl;

import org.apache.http.client.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.godmonth.sfexpress.bsp.SfExpressClient;
import com.thoughtworks.xstream.XStream;

public class SfExpressClientFactory implements InitializingBean {
	private static final Logger logger = LoggerFactory.getLogger(SfExpressClientFactory.class);

	private String head;

	private String secretKey;

	private HttpClient httpClient;

	private RestTemplate restTemplate;

	private String url;

	private XStream xStream;

	@Override
	public void afterPropertiesSet() throws Exception {
		if (xStream == null) {
			xStream = SimpleXstreamFactory.create();
		}
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

	public SfExpressClient build() {
		SfExpressClientImpl expressServiceWrapper = new SfExpressClientImpl();
		expressServiceWrapper.setRestTemplate(restTemplate);
		expressServiceWrapper.setSecretKey(secretKey);
		expressServiceWrapper.setHead(head);
		expressServiceWrapper.setxStream(xStream);
		expressServiceWrapper.setUrl(url);
		return expressServiceWrapper;
	}

	@Required
	public void setHead(String head) {
		this.head = head;
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

	public void setxStream(XStream xStream) {
		this.xStream = xStream;
	}

}
