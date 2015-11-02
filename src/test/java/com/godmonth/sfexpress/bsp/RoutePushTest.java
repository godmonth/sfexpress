package com.godmonth.sfexpress.bsp;

import java.io.IOException;
import java.util.Date;
import java.util.TimeZone;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.godmonth.sfexpress.bsp.protocol.route.RoutePushRequest;
import com.godmonth.sfexpress.bsp.protocol.route.WaybillRoute;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

public class RoutePushTest extends SfExpressClientTest {
	private XStream xStream;

	@BeforeClass
	public void prepare() {
		xStream = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
		xStream.autodetectAnnotations(true);
		xStream.ignoreUnknownElements();
		xStream.registerConverter(new DateConverter("yyyy-MM-dd HH:mm:ss", new String[0], TimeZone.getDefault()));
	}

	@Test
	public void route() throws IOException {
		RoutePushRequest pushRequest = new RoutePushRequest(
				new WaybillRoute[] { createWaybillRoute(), createWaybillRoute() });
		pushRequest.setService("cccaaa");
		pushRequest.setLang("dsaa");
		System.out.println(xStream.toXML(pushRequest));
	}

	private WaybillRoute createWaybillRoute() {
		WaybillRoute waybillRoute = new WaybillRoute();
		waybillRoute.setId(123l);
		waybillRoute.setMailno("123");
		waybillRoute.setOrderid("ooo123");
		waybillRoute.setAcceptTime(new Date());
		waybillRoute.setRemark("收件");
		waybillRoute.setOpcode("50");
		return waybillRoute;
	}
}
