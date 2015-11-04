package com.godmonth.sfexpress.bsp.protocol.route;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class RoutePushRequestBody {

	@XStreamAlias("WaybillRoute")
	@XStreamImplicit
	private List<WaybillRoute> waybillRoute;

	public RoutePushRequestBody() {
	}

	public RoutePushRequestBody(List<WaybillRoute> waybillRoute) {
		this.waybillRoute = waybillRoute;
	}

	public List<WaybillRoute> getWaybillRoute() {
		return waybillRoute;
	}

	public void setWaybillRoute(List<WaybillRoute> waybillRoute) {
		this.waybillRoute = waybillRoute;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("waybillRoute", this.waybillRoute)
				.toString();
	}

}
