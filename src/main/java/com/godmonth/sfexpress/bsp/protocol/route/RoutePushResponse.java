package com.godmonth.sfexpress.bsp.protocol.route;

import com.godmonth.sfexpress.bsp.protocol.Response;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Response")
public class RoutePushResponse extends Response {
	{
		setService("RoutePushService");
	}
}
