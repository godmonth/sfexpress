package com.godmonth.sfexpress.bsp.protocol.deliverytm;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.godmonth.sfexpress.bsp.protocol.Response;
import com.godmonth.sfexpress.bsp.protocol.ResponseError;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Response")
public class DeliverTmResponse extends Response {

	@XStreamAlias("Body")
	private DeliverTmResponseBody body;

	public DeliverTmResponse() {
	}

	public DeliverTmResponse(String serviceName, String head, DeliverTmResponseBody body) {
		setService(serviceName);
		setHead(head);
		this.body = body;
	}

	public DeliverTmResponse(String serviceName, String head, ResponseError error) {
		super(serviceName, head, error);
	}

	public DeliverTmResponseBody getBody() {
		return body;
	}

	public void setBody(DeliverTmResponseBody body) {
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
