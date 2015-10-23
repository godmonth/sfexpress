package com.godmonth.sfexpress.bsp.protocol.route;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.godmonth.sfexpress.bsp.protocol.Response;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Response")
public class RouteResponse extends Response {

	private RouteRequestBody body;

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
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.appendSuper(super.toString()).append("body", this.body)
				.toString();
	}

}
