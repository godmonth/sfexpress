package com.godmonth.sfexpress.bsp.protocol.deliverytm;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.godmonth.sfexpress.bsp.protocol.Request;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Request")
public class DeliverTmRequest extends Request {

	@XStreamAlias("Body")
	private DeliverTmRequestBody body;

	{
		setService("DeliverTmService");
	}

	public DeliverTmRequest() {
	}

	public DeliverTmRequest(String head, DeliverTmRequestBody body) {
		setHead(head);
		this.body = body;
	}

	public DeliverTmRequestBody getBody() {
		return body;
	}

	public void setBody(DeliverTmRequestBody body) {
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
