package com.godmonth.sfexpress.bsp.protocol.constants;

public enum PayMethod {
	/**
	 * 寄方付
	 */
	SENDER_PAYMENT(1, "寄方付"),
	
	/**
	 * 收方付
	 */
	RECEIVER_PAYMENT(2, "收方付"),
	

	/**
	 * 第三方付
	 */
	THIRD_PARY_PAYMENT(3, "第三方付");

	private Integer code;

	private String description;

	private PayMethod(Integer code, String description) {
		this.code = code;
		this.description = description;
	}

	public Integer getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
}
