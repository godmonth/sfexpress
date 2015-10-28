package com.godmonth.sfexpress.bsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import com.godmonth.sfexpress.bsp.protocol.ordersearch.OrderSearch;
import com.godmonth.sfexpress.bsp.protocol.ordersearch.OrderSearchBody;
import com.godmonth.sfexpress.bsp.protocol.ordersearch.OrderSearchRequest;
import com.godmonth.sfexpress.bsp.protocol.ordersearch.OrderSearchResponse;

public class OrderSearchTest extends SfExpressClientTest {

	@Test
	public void orderSearch() throws IOException {
		OrderSearchResponse orderResponse = sfExpressClient
				.post(createRequest(), OrderSearchResponse.class);
		System.out.println(orderResponse);
	}

	private OrderSearchRequest createRequest() throws IOException {
		String orderid = FileUtils
				.readFileToString(new File("target/orderid.txt"));
		OrderSearch order = new OrderSearch(orderid);
		OrderSearchRequest request = new OrderSearchRequest("BSPdevelop",
				new OrderSearchBody(order));
		return request;
	}
}
