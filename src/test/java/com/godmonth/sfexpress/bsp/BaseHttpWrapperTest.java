package com.godmonth.sfexpress.bsp;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.testng.annotations.BeforeClass;

import com.godmonth.sfexpress.bsp.impl.DummySslContext;
import com.godmonth.sfexpress.bsp.impl.SfExpressServiceWrapperFactory;

public class BaseHttpWrapperTest {
	protected SfExpressServiceWrapper baseHttpWrapper;

	@BeforeClass
	public void prepare() throws Exception {
		SSLConnectionSocketFactory ssf = new SSLConnectionSocketFactory(DummySslContext.INSTANCE,
				NoopHostnameVerifier.INSTANCE);
		HttpClientBuilder httpClientBuilder = HttpClients.custom();
		httpClientBuilder.setSSLSocketFactory(ssf);

		SfExpressServiceWrapperFactory sfExpressServiceWrapperFactory = new SfExpressServiceWrapperFactory();
		sfExpressServiceWrapperFactory.setHttpClient(httpClientBuilder.build());
		sfExpressServiceWrapperFactory.setSecretKey("j8DzkIFgmlomPt0aLuwU");
//		sfExpressServiceWrapperFactory.setUrl("https://bsp-oisp.test.sf-express.com/bsp-oisp/sfexpressService");
		sfExpressServiceWrapperFactory.setUrl("http://218.17.248.244:11080/bsp-oisp/sfexpressService");
		sfExpressServiceWrapperFactory.afterPropertiesSet();
		baseHttpWrapper = sfExpressServiceWrapperFactory.build();
	}

}
