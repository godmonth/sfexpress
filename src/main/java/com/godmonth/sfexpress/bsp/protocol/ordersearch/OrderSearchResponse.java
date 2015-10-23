package com.godmonth.sfexpress.bsp.protocol.ordersearch;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.godmonth.sfexpress.bsp.protocol.Response;
import com.godmonth.sfexpress.bsp.protocol.order.OrderResponseBody;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Response")
public class OrderSearchResponse extends Response {

	@XStreamAlias("Body")
	private OrderResponseBody body;

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
