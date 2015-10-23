package com.godmonth.sfexpress.bsp;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.testng.annotations.BeforeClass;

import com.godmonth.sfexpress.bsp.impl.DummySslContext;
import com.godmonth.sfexpress.bsp.impl.SfExpressServiceWrapperImpl;

public class BaseHttpWrapperTest {
	protected SfExpressServiceWrapperImpl baseHttpWrapper;

	@BeforeClass
	public void prepare() throws Exception {
		SSLConnectionSocketFactory ssf = new SSLConnectionSocketFactory(
				DummySslContext.INSTANCE, NoopHostnameVerifier.INSTANCE);
		HttpClientBuilder httpClientBuilder = HttpClients.custom();
		httpClientBuilder.setSSLSocketFactory(ssf);
		CloseableHttpClient httpClient = httpClientBuilder.build();
		baseHttpWrapper = new SfExpressServiceWrapperImpl();
		baseHttpWrapper.setSecretKey("j8DzkIFgmlomPt0aLuwU");
		baseHttpWrapper.setHttpClient(httpClient);
		baseHttpWrapper.setUrl(
				"https://bsp-oisp.test.sf-express.com/bsp-oisp/sfexpressService");
		baseHttpWrapper.afterPropertiesSet();
	}

}
