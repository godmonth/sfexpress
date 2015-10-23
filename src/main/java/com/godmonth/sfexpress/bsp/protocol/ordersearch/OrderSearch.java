package com.godmonth.sfexpress.bsp.protocol.ordersearch;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class OrderSearch {
	/**
	 * 客户订单号
	 */
	@XStreamAsAttribute
	private String orderid;

	public OrderSearch() {
	}

	public OrderSearch(String orderid) {
		this.orderid = orderid;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("orderid", this.orderid).toString();
	}

}
