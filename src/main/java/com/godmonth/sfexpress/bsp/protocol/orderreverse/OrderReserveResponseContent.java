package com.godmonth.sfexpress.bsp.protocol.orderreverse;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class OrderReserveResponseContent {
	/**
	 * 客户订单号
	 */
	@XStreamAsAttribute
	private String orderid;

	/**
	 * 顺丰运单号
	 */
	@XStreamAsAttribute
	private String mailno;

	/**
	 * 顺丰签回单服务运单号
	 */
	@XStreamAlias("filter_result")
	@XStreamAsAttribute
	private String filterResult;

	/**
	 * 备注
	 */
	@XStreamAsAttribute
	private String remark;

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getMailno() {
		return mailno;
	}

	public void setMailno(String mailno) {
		this.mailno = mailno;
	}

	public String getFilterResult() {
		return filterResult;
	}

	public void setFilterResult(String filterResult) {
		this.filterResult = filterResult;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mailno", this.mailno)
				.append("remark", this.remark).append("orderid", this.orderid).append("filterResult", this.filterResult)
				.toString();
	}

}
