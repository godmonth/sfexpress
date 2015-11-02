package com.godmonth.sfexpress.bsp.protocol.ordersearch;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.godmonth.sfexpress.bsp.protocol.Request;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Request")
public class OrderSearchRequest extends Request {

	@XStreamAlias("Body")
	private OrderSearchBody body;

	{
		setService("OrderSearchService");
	}

	public OrderSearchRequest() {
	}

	public OrderSearchRequest(OrderSearchBody body) {
		this.body = body;
	}

	public OrderSearchBody getBody() {
		return body;
	}

	public void setBody(OrderSearchBody body) {
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
