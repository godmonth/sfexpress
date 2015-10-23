package com.godmonth.sfexpress.bsp.protocol.route;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("RouteRequest")
public class RouteRequestContent {

	/**
	 * 查询号类别.1：根据顺丰运单号查询,2：根据客户订单号查询
	 */
	@XStreamAlias("tracking_type")
	@XStreamAsAttribute
	private Integer trackingType;

	/**
	 * 查询号
	 * 
	 */
	@XStreamAlias("tracking_number")
	@XStreamAsAttribute
	private String trackingNumber;

	/**
	 * 路由查询类别
	 * 
	 */
	@XStreamAlias("method_type")
	@XStreamAsAttribute
	private Integer methodType;

	public Integer getTrackingType() {
		return trackingType;
	}

	public void setTrackingType(Integer trackingType) {
		this.trackingType = trackingType;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public Integer getMethodType() {
		return methodType;
	}

	public void setMethodType(Integer methodType) {
		this.methodType = methodType;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("methodType", this.methodType)
				.append("trackingType", this.trackingType)
				.append("trackingNumber", this.trackingNumber).toString();
	}

}
