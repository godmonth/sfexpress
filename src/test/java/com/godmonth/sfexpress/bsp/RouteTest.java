package com.godmonth.sfexpress.bsp;

import java.io.IOException;

import org.testng.annotations.Test;

import com.godmonth.sfexpress.bsp.protocol.route.RouteRequest;
import com.godmonth.sfexpress.bsp.protocol.route.RouteRequestBody;
import com.godmonth.sfexpress.bsp.protocol.route.RouteRequestContent;
import com.godmonth.sfexpress.bsp.protocol.route.RouteResponse;
import com.godmonth.sfexpress.bsp.protocol.route.TrackingType;

public class RouteTest extends BaseHttpWrapperTest {

	@Test
	public void route() throws IOException {
		RouteResponse routeResponse = baseHttpWrapper.post(createRouteRequest(), RouteResponse.class);
		System.out.println(routeResponse);
	}

	private RouteRequest createRouteRequest() {
		RouteRequestContent route = new RouteRequestContent();
		route.setTrackingType(TrackingType.ORDERID);
		route.setTrackingNumber("201508211846");
		route.setMethodType(1);
		return new RouteRequest("BSPdevelop", new RouteRequestBody(route));
	}
}
