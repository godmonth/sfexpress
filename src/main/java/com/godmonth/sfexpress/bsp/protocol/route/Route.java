package com.godmonth.sfexpress.bsp.protocol.route;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("Route")
public class Route {

	/**
	 * 路由节点发生的时间
	 */
	@XStreamAlias("accept_time")
	@XStreamAsAttribute
	private String acceptTime;

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
	private String opcode;

	public String getAcceptTime() {
		return acceptTime;
	}

	public void setAcceptTime(String acceptTime) {
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

	public String getOpcode() {
		return opcode;
	}

	public void setOpcode(String opcode) {
		this.opcode = opcode;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("acceptAddress", this.acceptAddress)
				.append("acceptTime", this.acceptTime)
				.append("remark", this.remark).append("opcode", this.opcode)
				.toString();
	}

}
