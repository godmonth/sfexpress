package com.godmonth.sfexpress.bsp.protocol.deliverytm;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DeliverTmRequest")
public class DeliverTmRequestContent {
	/**
	 * 快件产品
	 */
	@XStreamAlias("business_type")
	@XStreamAsAttribute
	private String businessType;

	/**
	 * 货物总重量
	 */
	@XStreamAsAttribute
	private BigDecimal weight;

	/**
	 * 快件产品
	 */
	@XStreamAsAttribute
	private String volumn;

	/**
	 * 快件产品
	 */
	@XStreamAlias("consigned_time")
	@XStreamAsAttribute
	private Date consignedTime;

	@XStreamAlias("SrcAddress")
	private Address srcAddress;

	@XStreamAlias("DestAddress")
	private Address destAddress;

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public String getVolumn() {
		return volumn;
	}

	public void setVolumn(String volumn) {
		this.volumn = volumn;
	}

	public Date getConsignedTime() {
		return consignedTime;
	}

	public void setConsignedTime(Date consignedTime) {
		this.consignedTime = consignedTime;
	}

	public Address getSrcAddress() {
		return srcAddress;
	}

	public void setSrcAddress(Address srcAddress) {
		this.srcAddress = srcAddress;
	}

	public Address getDestAddress() {
		return destAddress;
	}

	public void setDestAddress(Address destAddress) {
		this.destAddress = destAddress;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("consignedTime", this.consignedTime)
				.append("destAddress", this.destAddress)
				.append("weight", this.weight).append("volumn", this.volumn)
				.append("srcAddress", this.srcAddress)
				.append("businessType", this.businessType).toString();
	}

}
