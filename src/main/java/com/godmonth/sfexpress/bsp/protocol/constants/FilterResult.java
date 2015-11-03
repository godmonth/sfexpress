package com.godmonth.sfexpress.bsp.protocol.constants;

/**
 * 筛单结果
 * 
 * @author shenyue
 *
 */
public enum FilterResult {
	/**
	 * 人工确认
	 */
	MANUAL_CONFIRM("1", "人工确认"),

	/**
	 * 可收派
	 */
	ALLOW("2", "可收派"),

	/**
	 * 不可以收派
	 */
	DENY("3", "不可以收派");

	private String code;

	private String description;

	private FilterResult(String code, String description) {
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
