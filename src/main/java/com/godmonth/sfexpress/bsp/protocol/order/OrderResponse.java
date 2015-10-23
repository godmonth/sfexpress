package com.godmonth.sfexpress.bsp.protocol.order;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.godmonth.sfexpress.bsp.protocol.Response;
import com.godmonth.sfexpress.bsp.protocol.ResponseError;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Response")
public class OrderResponse extends Response {

	@XStreamAlias("Body")
	private OrderResponseBody body;

	public OrderResponse() {
	}

	public OrderResponse(String serviceName, String head,
			OrderResponseBody body) {
		setService(serviceName);
		setHead(head);
		this.body = body;
	}

	public OrderResponse(String serviceName, String head, ResponseError error) {
		super(serviceName, head, error);
	}

	public OrderResponseBody getBody() {
		return body;
	}

	public void setBody(OrderResponseBody body) {
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
