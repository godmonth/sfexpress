package com.godmonth.sfexpress.bsp.protocol.route;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class RoutePushRequestBody {

	@XStreamAlias("WaybillRoute")
	private WaybillRoute[] waybillRoute;

	public RoutePushRequestBody() {
	}

	public RoutePushRequestBody(WaybillRoute[] waybillRoute) {
		super();
		this.waybillRoute = waybillRoute;
	}

	public WaybillRoute[] getWaybillRoute() {
		return waybillRoute;
	}

	public void setWaybillRoute(WaybillRoute[] waybillRoute) {
		this.waybillRoute = waybillRoute;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("waybillRoute", this.waybillRoute).toString();
	}

}
