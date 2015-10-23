package com.godmonth.sfexpress.bsp.protocol.order;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class OrderResponseContent {
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
	@XStreamAlias("return_tracking_no")
	@XStreamAsAttribute
	private String returnTrackingNo;

	/**
	 * 原寄地区域代码
	 */
	@XStreamAsAttribute
	private String origincode;

	/**
	 * 目的地区域代码
	 */
	@XStreamAsAttribute
	private String destcode;

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

	public String getReturnTrackingNo() {
		return returnTrackingNo;
	}

	public void setReturnTrackingNo(String returnTrackingNo) {
		this.returnTrackingNo = returnTrackingNo;
	}

	public String getOrigincode() {
		return origincode;
	}

	public void setOrigincode(String origincode) {
		this.origincode = origincode;
	}

	public String getDestcode() {
		return destcode;
	}

	public void setDestcode(String destcode) {
		this.destcode = destcode;
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
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("mailno", this.mailno).append("orderid", this.orderid)
				.append("destcode", this.destcode)
				.append("filterResult", this.filterResult)
				.append("remark", this.remark)
				.append("origincode", this.origincode)
				.append("returnTrackingNo", this.returnTrackingNo).toString();
	}

}
