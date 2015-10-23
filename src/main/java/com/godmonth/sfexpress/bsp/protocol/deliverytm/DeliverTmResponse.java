package com.godmonth.sfexpress.bsp.protocol.deliverytm;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.godmonth.sfexpress.bsp.protocol.Response;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Response")
public class DeliverTmResponse extends Response {

	@XStreamAlias("Body")
	private DeliverTmResponseBody body;

	public DeliverTmResponse() {
	}

	public DeliverTmResponse(DeliverTmResponseBody body) {
		this.body = body;
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
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.appendSuper(super.toString()).append("body", this.body)
				.toString();
	}

}
