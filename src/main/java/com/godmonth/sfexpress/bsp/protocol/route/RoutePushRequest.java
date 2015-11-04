package com.godmonth.sfexpress.bsp.protocol.route;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.godmonth.sfexpress.bsp.protocol.Request;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Request")
public class RoutePushRequest extends Request {

	@XStreamAlias("Body")
	private RoutePushRequestBody body;

	{
		setService("RoutePushService");
	}

	public RoutePushRequest() {
	}

	public RoutePushRequest(RoutePushRequestBody body) {
		super();
		this.body = body;
	}

	public RoutePushRequestBody getBody() {
		return body;
	}

	public void setBody(RoutePushRequestBody body) {
		this.body = body;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("lang", this.getLang())
				.append("body", this.body).append("head", this.getHead()).append("service", this.getService())
				.toString();
	}

}
