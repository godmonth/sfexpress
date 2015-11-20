package com.godmonth.sfexpress.bsp.protocol.route;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Body")
public class RouteResponseBody {

	@XStreamAlias("RouteResponse")
	private RouteResponseContent routeResponse;

	public RouteResponseBody() {
	}

	public RouteResponseBody(RouteResponseContent routeResponse) {
		this.routeResponse = routeResponse;
	}

	public RouteResponseContent getRouteResponse() {
		return routeResponse;
	}

	public void setRouteResponse(RouteResponseContent routeResponse) {
		this.routeResponse = routeResponse;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("routeResponse", this.routeResponse)
				.toString();
	}

}
