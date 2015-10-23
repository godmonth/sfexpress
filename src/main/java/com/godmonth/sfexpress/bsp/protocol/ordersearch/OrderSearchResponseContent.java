package com.godmonth.sfexpress.bsp.protocol.ordersearch;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class OrderSearchResponseContent {
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
}
