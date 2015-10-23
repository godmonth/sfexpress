package com.godmonth.sfexpress.bsp.protocol.route;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@XStreamAlias("Body")
public class RouteRequestBody {
	
	@XStreamAlias("RouteRequest")
	private RouteRequestContent routeRequest;

	public RouteRequestBody() {
	}

	public RouteRequestBody(RouteRequestContent routeRequest) {
		this.routeRequest = routeRequest;
	}

	public RouteRequestContent getRouteRequest() {
		return routeRequest;
	}

	public void setRouteRequest(RouteRequestContent routeRequest) {
		this.routeRequest = routeRequest;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("routeRequest", this.routeRequest).toString();
	}

}
