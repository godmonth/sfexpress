package com.godmonth.sfexpress.bsp.protocol.route;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("WaybillRoute")
public class WaybillRoute {
	/**
	 * 路由节点信息编号
	 */
	@XStreamAsAttribute
	private Long id;
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
	 * 路由节点发生的时间
	 */
	@XStreamAlias("accept_time")
	@XStreamAsAttribute
	private Date acceptTime;

	/**
	 * 路由节点发生的地点
	 */
	@XStreamAlias("accept_address")
	@XStreamAsAttribute
	private String acceptAddress;

	/**
	 * 路由节点具体描述
	 */
	@XStreamAsAttribute
	private String remark;

	/**
	 * 路由节点操作码
	 */
	@XStreamAsAttribute
	private String opCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Date getAcceptTime() {
		return acceptTime;
	}

	public void setAcceptTime(Date acceptTime) {
		this.acceptTime = acceptTime;
	}

	public String getAcceptAddress() {
		return acceptAddress;
	}

	public void setAcceptAddress(String acceptAddress) {
		this.acceptAddress = acceptAddress;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOpCode() {
		return opCode;
	}

	public void setOpCode(String opCode) {
		this.opCode = opCode;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mailno", this.mailno)
				.append("acceptTime", this.acceptTime).append("remark", this.remark).append("orderid", this.orderid)
				.append("id", this.id).append("acceptAddress", this.acceptAddress).append("opCode", this.opCode)
				.toString();
	}

}
