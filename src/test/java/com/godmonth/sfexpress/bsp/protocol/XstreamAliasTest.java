package com.godmonth.sfexpress.bsp.protocol;

import org.testng.annotations.Test;

import com.godmonth.sfexpress.bsp.impl.SimpleXstreamFactory;
import com.godmonth.sfexpress.bsp.protocol.order.OrderRequest;
import com.godmonth.sfexpress.bsp.protocol.route.RouteRequest;
import com.thoughtworks.xstream.XStream;

public class XstreamAliasTest {
	@Test
	public void f() {
		XStream xStream = SimpleXstreamFactory.create();
		OrderRequest orderRequest = new OrderRequest();
		String xml = xStream.toXML(orderRequest);
		System.out.println(xml);
		System.out.println(xStream.toXML(new RouteRequest()));
	}
}
