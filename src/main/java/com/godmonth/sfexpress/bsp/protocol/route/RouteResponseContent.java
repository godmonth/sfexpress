package com.godmonth.sfexpress.bsp.protocol.route;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("RouteResponse")
public class RouteResponseContent {
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
	 * 路由节点
	 */
	@XStreamAlias("Route")
	@XStreamImplicit
	private List<Route> routeList;

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

	public List<Route> getRouteList() {
		return routeList;
	}

	public void setRouteList(List<Route> routeList) {
		this.routeList = routeList;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mailno", this.mailno)
				.append("orderid", this.orderid).append("routeList", this.routeList).toString();
	}

}
