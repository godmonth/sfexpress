package com.godmonth.sfexpress.bsp.protocol.constants;

/**
 * 顺丰快件产品
 * 
 * @author shenyue
 *
 */
public enum BspBusinessType {
	/**
	 * 标准快递
	 */
	STANDARD("1", "标准快递"),

	/**
	 * 顺丰特惠
	 */
	PRIVILEGE("2", "顺丰特惠"),

	/**
	 * 顺丰次晨
	 */
	TOMORROW_MORNING("3", "顺丰次晨"),

	/**
	 * 即日件
	 */
	TODAY("4", "即日件");

	private String code;

	private String description;

	private BspBusinessType(String code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
}
