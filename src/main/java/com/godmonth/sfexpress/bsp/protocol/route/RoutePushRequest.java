package com.godmonth.sfexpress.bsp.protocol.route;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.godmonth.sfexpress.bsp.protocol.Request;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Request")
public class RoutePushRequest extends Request {

	@XStreamAlias("Body")
	private WaybillRoute[] body;

	{
		setService("RoutePushService");
	}

	public RoutePushRequest() {
	}

	public RoutePushRequest(String head, WaybillRoute[] body) {
		setHead(head);
		this.body = body;
	}

	public WaybillRoute[] getBody() {
		return body;
	}

	public void setBody(WaybillRoute[] body) {
		this.body = body;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("body", this.body).toString();
	}

}
