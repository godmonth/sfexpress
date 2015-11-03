package com.godmonth.sfexpress.bsp.protocol.order;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@XStreamAlias("Body")
public class OrderRequestBody {

	@XStreamAlias("Order")
	private OrderRequestContent order;

	public OrderRequestBody() {
	}

	public OrderRequestBody(OrderRequestContent order) {
		this.order = order;
	}

	public OrderRequestContent getOrder() {
		return order;
	}

	public void setOrder(OrderRequestContent order) {
		this.order = order;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("order", this.order).toString();
	}

}
