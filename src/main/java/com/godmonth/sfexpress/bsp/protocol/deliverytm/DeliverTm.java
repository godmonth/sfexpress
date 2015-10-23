package com.godmonth.sfexpress.bsp.protocol.deliverytm;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class DeliverTm {
	
	/**
	 * 快件产品
	 */
	@XStreamAlias("business_type")
	@XStreamAsAttribute
	private String businessType;

	/**
	 * 业务类型描述
	 */
	@XStreamAlias("business_type_desc")
	@XStreamAsAttribute
	private String businessTypeDesc;

	/**
	 * 预计派送时间段
	 */
	@XStreamAlias("deliver_time")
	@XStreamAsAttribute
	private String deliverTime;

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getBusinessTypeDesc() {
		return businessTypeDesc;
	}

	public void setBusinessTypeDesc(String businessTypeDesc) {
		this.businessTypeDesc = businessTypeDesc;
	}

	public String getDeliverTime() {
		return deliverTime;
	}

	public void setDeliverTime(String deliverTime) {
		this.deliverTime = deliverTime;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("deliverTime", this.deliverTime)
				.append("businessTypeDesc", this.businessTypeDesc)
				.append("businessType", this.businessType).toString();
	}

}
