package com.godmonth.sfexpress.bsp.protocol.deliverytm;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * @author shenyue
 *
 */
public class Address {
	/**
	 * 所在省份
	 */
	@XStreamAsAttribute
	private String province;

	/**
	 * 所在城市
	 */
	@XStreamAsAttribute
	private String city;

	/**
	 * 所在县/区
	 */
	@XStreamAsAttribute
	private String district;

	/**
	 * 详细地址
	 */
	@XStreamAsAttribute
	private String address;

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("address", this.address)
				.append("province", this.province).append("city", this.city)
				.append("district", this.district).toString();
	}

}
