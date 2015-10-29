package com.godmonth.sfexpress.bsp.protocol.orderreverse;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.godmonth.sfexpress.bsp.protocol.Response;
import com.godmonth.sfexpress.bsp.protocol.ResponseError;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Response")
public class OrderReserveResponse extends Response {

	@XStreamAlias("Body")
	private OrderReserveResponseBody body;

	public OrderReserveResponse() {
	}

	public OrderReserveResponse(String serviceName, String head,
			OrderReserveResponseBody body) {
		setService(serviceName);
		setHead(head);
		this.body = body;
	}

	public OrderReserveResponse(String serviceName, String head, ResponseError error) {
		super(serviceName, head, error);
	}

	public OrderReserveResponseBody getBody() {
		return body;
	}

	public void setBody(OrderReserveResponseBody body) {
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
