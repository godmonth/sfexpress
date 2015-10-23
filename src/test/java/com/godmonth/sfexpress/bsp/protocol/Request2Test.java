package com.godmonth.sfexpress.bsp.protocol;

import java.util.Collections;

import org.testng.annotations.Test;

import com.godmonth.sfexpress.bsp.protocol.order.Cargo;
import com.godmonth.sfexpress.bsp.protocol.order.OrderRequestBody;
import com.godmonth.sfexpress.bsp.protocol.order.OrderRequestContent;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

public class Request2Test {
	@Test
	public void test() {

		OrderRequestContent order = new OrderRequestContent();
		order.setOrderid("123");
		order.setIsGenBillNo(1);
		Cargo cargo = new Cargo();
		cargo.setName("ccc");
		order.setCargo(Collections.singletonList(cargo));

		Request2<OrderRequestBody> request2 = new Request2<OrderRequestBody>();
		request2.setBody(new OrderRequestBody(order));
		XStream requestXStream = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
		requestXStream.aliasSystemAttribute(null, "class");
		requestXStream.autodetectAnnotations(true);
		requestXStream.ignoreUnknownElements();

		requestXStream.aliasType("Body", OrderRequestBody.class);
		// requestXStream.alias("xml", request.getClass());
		String xml = requestXStream.toXML(request2);
		System.out.println(xml);
		Request2<OrderRequestBody> fromXML = (Request2) requestXStream.fromXML(xml);
		System.out.println(fromXML);
	}
}
