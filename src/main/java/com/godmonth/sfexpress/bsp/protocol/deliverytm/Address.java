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

	/**
	 * 区域代码
	 */
	@XStreamAsAttribute
	private String code;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("district", this.district)
				.append("province", this.province).append("address", this.address).append("code", this.code)
				.append("city", this.city).toString();
	}

}
