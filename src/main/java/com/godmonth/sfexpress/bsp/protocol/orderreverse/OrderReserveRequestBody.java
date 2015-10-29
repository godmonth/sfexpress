package com.godmonth.sfexpress.bsp.protocol.orderreverse;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Body")
public class OrderReserveRequestBody {

	@XStreamAlias("Order")
	private OrderReserveRequestContent order;

	public OrderReserveRequestBody() {
	}

	public OrderReserveRequestBody(OrderReserveRequestContent order) {
		this.order = order;
	}

	public OrderReserveRequestContent getOrder() {
		return order;
	}

	public void setOrder(OrderReserveRequestContent order) {
		this.order = order;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("order", this.order).toString();
	}

}
