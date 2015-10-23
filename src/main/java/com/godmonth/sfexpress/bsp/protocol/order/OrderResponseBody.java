package com.godmonth.sfexpress.bsp.protocol.order;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class OrderResponseBody {

	@XStreamAlias("OrderResponse")
	private OrderResponseContent orderResponse;

	public OrderResponseBody() {
	}

	public OrderResponseBody(OrderResponseContent orderResponse) {
		this.orderResponse = orderResponse;
	}

	public OrderResponseContent getOrderResponse() {
		return orderResponse;
	}

	public void setOrderResponse(OrderResponseContent orderResponse) {
		this.orderResponse = orderResponse;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("orderResponse", this.orderResponse).toString();
	}

}
