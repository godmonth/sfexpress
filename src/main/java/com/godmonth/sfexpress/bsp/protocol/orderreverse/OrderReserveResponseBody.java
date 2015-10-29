package com.godmonth.sfexpress.bsp.protocol.orderreverse;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class OrderReserveResponseBody {

	@XStreamAlias("OrderReverseResponse")
	private OrderReserveResponseContent orderResponse;

	public OrderReserveResponseBody() {
	}

	public OrderReserveResponseBody(OrderReserveResponseContent orderResponse) {
		this.orderResponse = orderResponse;
	}

	public OrderReserveResponseContent getOrderResponse() {
		return orderResponse;
	}

	public void setOrderResponse(OrderReserveResponseContent orderResponse) {
		this.orderResponse = orderResponse;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("orderResponse", this.orderResponse)
				.toString();
	}

}
