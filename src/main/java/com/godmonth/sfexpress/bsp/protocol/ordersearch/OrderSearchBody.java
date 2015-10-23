package com.godmonth.sfexpress.bsp.protocol.ordersearch;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class OrderSearchBody {
	
	@XStreamAlias("OrderSearch")
	private OrderSearch orderSearch;

	public OrderSearchBody() {
	}

	public OrderSearchBody(OrderSearch orderSearch) {
		this.orderSearch = orderSearch;
	}

	public OrderSearch getOrderSearch() {
		return orderSearch;
	}

	public void setOrderSearch(OrderSearch orderSearch) {
		this.orderSearch = orderSearch;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("orderSearch", this.orderSearch).toString();
	}

}
