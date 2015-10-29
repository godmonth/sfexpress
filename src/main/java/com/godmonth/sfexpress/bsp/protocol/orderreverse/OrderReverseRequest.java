package com.godmonth.sfexpress.bsp.protocol.orderreverse;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.godmonth.sfexpress.bsp.protocol.Request;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Request")
public class OrderReverseRequest extends Request {

	@XStreamAlias("Body")
	private OrderReserveRequestBody body;

	{
		setService("OrderReverseService");
	}

	public OrderReverseRequest() {
	}

	public OrderReverseRequest(String head, OrderReserveRequestBody body) {
		setHead(head);
		this.body = body;
	}

	public OrderReserveRequestBody getBody() {
		return body;
	}

	public void setBody(OrderReserveRequestBody body) {
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
