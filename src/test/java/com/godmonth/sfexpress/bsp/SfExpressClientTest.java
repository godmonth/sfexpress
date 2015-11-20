package com.godmonth.sfexpress.bsp;

import org.apache.http.impl.client.CloseableHttpClient;
import org.testng.annotations.BeforeClass;

import com.godmonth.sfexpress.bsp.impl.CustomHttpClientBuilder;
import com.godmonth.sfexpress.bsp.impl.SfExpressClientFactory;

public class SfExpressClientTest {
	protected SfExpressClient sfExpressClient;

	@BeforeClass
	public void prepare() throws Exception {
		CloseableHttpClient closeableHttpClient = new CustomHttpClientBuilder().build();
		SfExpressClientFactory sfExpressServiceWrapperFactory = new SfExpressClientFactory();
		sfExpressServiceWrapperFactory.setHttpClient(closeableHttpClient);
//		 sfExpressServiceWrapperFactory.setHead("BSPdevelop");
//		 sfExpressServiceWrapperFactory.setSecretKey("j8DzkIFgmlomPt0aLuwU");
		sfExpressServiceWrapperFactory.setHead("SHBW");
		sfExpressServiceWrapperFactory.setSecretKey("4aCNKlVWePBeNR0K");

		// sfExpressServiceWrapperFactory.setUrl("https://bsp-oisp.test.sf-express.com/bsp-oisp/sfexpressService");
//		sfExpressServiceWrapperFactory.setUrl("http://218.17.248.244:11080/bsp-oisp/sfexpressService");
		sfExpressServiceWrapperFactory.setUrl("http://localhost/sfexpressService");
		// sfExpressServiceWrapperFactory.setUrl("http://218.17.248.244:11080/bsp-oisp/ws/sfexpressService");
		sfExpressServiceWrapperFactory.afterPropertiesSet();
		sfExpressClient = sfExpressServiceWrapperFactory.build();
	}

}
