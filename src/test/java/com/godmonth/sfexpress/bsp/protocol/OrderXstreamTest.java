package com.godmonth.sfexpress.bsp.protocol;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import org.testng.annotations.Test;

import com.godmonth.sfexpress.bsp.protocol.ResponseError;
import com.godmonth.sfexpress.bsp.protocol.order.AddedService;
import com.godmonth.sfexpress.bsp.protocol.order.Cargo;
import com.godmonth.sfexpress.bsp.protocol.order.OrderRequest;
import com.godmonth.sfexpress.bsp.protocol.order.OrderRequestBody;
import com.godmonth.sfexpress.bsp.protocol.order.OrderRequestContent;
import com.godmonth.sfexpress.bsp.protocol.order.OrderResponse;
import com.godmonth.sfexpress.bsp.protocol.order.OrderResponseBody;
import com.godmonth.sfexpress.bsp.protocol.order.OrderResponseContent;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

public class OrderXstreamTest {
	@Test
	public void request() {

		OrderRequestContent order = new OrderRequestContent();
		order.setOrderid("123");
		order.setIsGenBillNo(1);
		Cargo cargo = new Cargo();
		cargo.setName("ccc");
		order.setCargo(Collections.singletonList(cargo));

		List<AddedService> addedServices = new ArrayList<>();
		{
			AddedService addedService = new AddedService();
			addedService.setName("dfff");
			addedServices.add(addedService);
		}
		{
			AddedService addedService = new AddedService();
			addedService.setName("dfff123");
			addedServices.add(addedService);
		}

		order.setAddedService(addedServices);

		OrderRequest request = new OrderRequest("head",
				new OrderRequestBody(order));

		XStream requestXStream = new XStream(
				new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
		requestXStream.autodetectAnnotations(true);
		requestXStream.ignoreUnknownElements();
		// requestXStream.alias("xml", request.getClass());
		String xml = requestXStream.toXML(request);
		System.out.println(xml);

		Object fromXML = requestXStream.fromXML(xml);
		System.out.println(fromXML);
	}

	@Test
	public void responseSuccess() {
		OrderResponseContent content = new OrderResponseContent();
		content.setOrderid(UUID.randomUUID().toString());
		content.setOrigincode("wow");
		content.setMailno("mmmm");

		OrderResponse response = new OrderResponse("ssss", "hea",
				new OrderResponseBody(content));

		XStream requestXStream = new XStream(
				new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
		requestXStream.autodetectAnnotations(true);
		requestXStream.ignoreUnknownElements();
		// requestXStream.alias("xml", request.getClass());
		String xml = requestXStream.toXML(response);
		System.out.println(xml);
	}

	@Test
	public void responseError() {
		ResponseError error = new ResponseError();
		error.setCode("aaa");
		error.setValue("ddd");

		OrderResponse response = new OrderResponse("ssss", "hea", error);

		XStream requestXStream = new XStream(
				new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
		requestXStream.autodetectAnnotations(true);
		requestXStream.ignoreUnknownElements();
		// requestXStream.alias("xml", request.getClass());
		String xml = requestXStream.toXML(response);
		System.out.println(xml);
	}

	@Test
	public void deserialResponse() {

		XStream requestXStream = new XStream(
				new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
		requestXStream.autodetectAnnotations(true);
		requestXStream.ignoreUnknownElements();
		requestXStream.alias("Response", OrderResponse.class);
		OrderResponse fromXML = (OrderResponse) requestXStream
				.fromXML(new File("src/test/resources/aaa.xml"));
		System.out.println(fromXML);
	}

	@Test
	public void testAnnotation() {
		Class c = OrderResponse.class;
		XStreamAlias annotation = (XStreamAlias) c
				.getDeclaredAnnotation(XStreamAlias.class);
		System.out.println(annotation);
	}
}
