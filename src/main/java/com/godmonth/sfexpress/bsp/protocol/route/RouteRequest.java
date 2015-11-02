package com.godmonth.sfexpress.bsp.protocol.route;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.godmonth.sfexpress.bsp.protocol.Request;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Request")
public class RouteRequest extends Request {

	@XStreamAlias("Body")
	private RouteRequestBody body;

	{
		setService("RouteService");
	}

	public RouteRequest() {
	}

	public RouteRequest(RouteRequestBody body) {
		this.body = body;
	}

	public RouteRequestBody getBody() {
		return body;
	}

	public void setBody(RouteRequestBody body) {
		this.body = body;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).appendSuper(super.toString())
				.append("body", this.body).toString();
	}

}
