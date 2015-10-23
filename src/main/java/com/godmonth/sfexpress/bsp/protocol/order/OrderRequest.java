package com.godmonth.sfexpress.bsp.protocol.order;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.godmonth.sfexpress.bsp.protocol.Request;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Request")
public class OrderRequest extends Request {
	
	@XStreamAlias("Body")
	private OrderRequestBody body;

	{
		setService("OrderService");
	}

	public OrderRequest() {
	}

	public OrderRequest(String head, OrderRequestBody body) {
		setHead(head);
		this.body = body;
	}

	public OrderRequestBody getBody() {
		return body;
	}

	public void setBody(OrderRequestBody body) {
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
