package com.godmonth.sfexpress.bsp.protocol.orderreverse;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.godmonth.sfexpress.bsp.protocol.order.AddedService;
import com.godmonth.sfexpress.bsp.protocol.order.Cargo;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 下订单（含筛选）
 * 
 * @author shenyue
 *
 */
@XStreamAlias("Order")
public class OrderReserveRequestContent {
	/**
	 * 客户订单号
	 */
	@XStreamAsAttribute
	private String orderid;

	/**
	 * 原订单号
	 */
	@XStreamAlias("orig_orderid")
	@XStreamAsAttribute
	private String origOrderid;

	/**
	 * 原运单号
	 */
	@XStreamAlias("orig_mailno")
	@XStreamAsAttribute
	private String origMailno;

	/**
	 * 快件产品类别
	 */
	@XStreamAlias("express_type")
	@XStreamAsAttribute
	private String expressType;

	/**
	 * 退货 方公司名称
	 */
	@XStreamAlias("j_company")
	@XStreamAsAttribute
	private String jCompany;

	/**
	 * 原订单号
	 */
	@XStreamAlias("j_contact")
	@XStreamAsAttribute
	private String jContact;

	/**
	 * 寄件方联系电话
	 */
	@XStreamAlias("j_tel")
	@XStreamAsAttribute
	private String jTel;

	/**
	 * 寄件方手机
	 */
	@XStreamAlias("j_mobile")
	@XStreamAsAttribute
	private String jMobile;

	/**
	 * 寄件方详细地址
	 */
	@XStreamAlias("j_address")
	@XStreamAsAttribute
	private String jAddress;

	/**
	 * 退货方邮编
	 */
	@XStreamAlias("j_postal_code")
	@XStreamAsAttribute
	private String jPostalCode;

	/**
	 * 到件方公司名称
	 */
	@XStreamAlias("d_company")
	@XStreamAsAttribute
	private String dCompany;

	/**
	 * 到件方联系人
	 */
	@XStreamAlias("d_contact")
	@XStreamAsAttribute
	private String dContact;

	/**
	 * 到件方联系电话
	 */
	@XStreamAlias("d_tel")
	@XStreamAsAttribute
	private String dTel;

	/**
	 * 到件方手机
	 */
	@XStreamAlias("d_mobile")
	@XStreamAsAttribute
	private String dMobile;

	/**
	 * 到件方详细地址
	 */
	@XStreamAlias("d_address")
	@XStreamAsAttribute
	private String dAddress;

	/**
	 * 收货方邮编
	 */
	@XStreamAlias("d_postal_code")
	@XStreamAsAttribute
	private String dPostalCode;

	/**
	 * 商家店铺名称
	 */
	@XStreamAlias("shopName")
	@XStreamAsAttribute
	private String shopName;

	/**
	 * 付款方式:1:寄方付,2:收方付,3:第三方付
	 */
	@XStreamAlias("pay_method")
	@XStreamAsAttribute
	private Integer payMethod;

	/**
	 * 顺丰月结卡号
	 */
	@XStreamAsAttribute
	private String custid;

	/**
	 * 寄件方所在省份
	 */
	@XStreamAlias("j_province")
	@XStreamAsAttribute
	private String jProvince;

	/**
	 * 寄件方所在城市名称
	 */
	@XStreamAlias("j_city")
	@XStreamAsAttribute
	private String jCity;

	/**
	 * 寄件人所在县/区
	 */
	@XStreamAlias("j_county")
	@XStreamAsAttribute
	private String jCounty;

	/**
	 * 寄件方国家/城市代码
	 */
	@XStreamAlias("j_shippercode")
	@XStreamAsAttribute
	private String jShippercode;

	/**
	 * 到件方所在省份
	 */
	@XStreamAlias("d_province")
	@XStreamAsAttribute
	private String dProvince;

	/**
	 * 到件方所在城市名称
	 */
	@XStreamAlias("d_city")
	@XStreamAsAttribute
	private String dCity;

	/**
	 * 到件方所在县/区
	 */
	@XStreamAlias("d_county")
	@XStreamAsAttribute
	private String dCounty;

	/**
	 * 到件方代码
	 */
	@XStreamAlias("d_deliverycode")
	@XStreamAsAttribute
	private String dDeliverycode;

	/**
	 * 顺丰运单号
	 */
	@XStreamAsAttribute
	private String mailno;

	/**
	 * 备注
	 */
	@XStreamAsAttribute
	private String remark;

	/**
	 * 业务模板编码
	 */
	@XStreamAsAttribute
	private String template;

	/**
	 * 要求上门取件开始时间
	 */
	@XStreamAsAttribute
	private Date sendstarttime;

	/**
	 * 货物
	 */
	@XStreamAlias("Cargo")
	private List<Cargo> cargo;

	/**
	 * 货物
	 */
	@XStreamAlias("AddedService")
	private List<AddedService> addedService;

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getOrigOrderid() {
		return origOrderid;
	}

	public void setOrigOrderid(String origOrderid) {
		this.origOrderid = origOrderid;
	}

	public String getOrigMailno() {
		return origMailno;
	}

	public void setOrigMailno(String origMailno) {
		this.origMailno = origMailno;
	}

	public String getExpressType() {
		return expressType;
	}

	public void setExpressType(String expressType) {
		this.expressType = expressType;
	}

	public String getjCompany() {
		return jCompany;
	}

	public void setjCompany(String jCompany) {
		this.jCompany = jCompany;
	}

	public String getjContact() {
		return jContact;
	}

	public void setjContact(String jContact) {
		this.jContact = jContact;
	}

	public String getjTel() {
		return jTel;
	}

	public void setjTel(String jTel) {
		this.jTel = jTel;
	}

	public String getjMobile() {
		return jMobile;
	}

	public void setjMobile(String jMobile) {
		this.jMobile = jMobile;
	}

	public String getjAddress() {
		return jAddress;
	}

	public void setjAddress(String jAddress) {
		this.jAddress = jAddress;
	}

	public String getjPostalCode() {
		return jPostalCode;
	}

	public void setjPostalCode(String jPostalCode) {
		this.jPostalCode = jPostalCode;
	}

	public String getdCompany() {
		return dCompany;
	}

	public void setdCompany(String dCompany) {
		this.dCompany = dCompany;
	}

	public String getdContact() {
		return dContact;
	}

	public void setdContact(String dContact) {
		this.dContact = dContact;
	}

	public String getdTel() {
		return dTel;
	}

	public void setdTel(String dTel) {
		this.dTel = dTel;
	}

	public String getdMobile() {
		return dMobile;
	}

	public void setdMobile(String dMobile) {
		this.dMobile = dMobile;
	}

	public String getdAddress() {
		return dAddress;
	}

	public void setdAddress(String dAddress) {
		this.dAddress = dAddress;
	}

	public String getdPostalCode() {
		return dPostalCode;
	}

	public void setdPostalCode(String dPostalCode) {
		this.dPostalCode = dPostalCode;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Integer getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(Integer payMethod) {
		this.payMethod = payMethod;
	}

	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getjProvince() {
		return jProvince;
	}

	public void setjProvince(String jProvince) {
		this.jProvince = jProvince;
	}

	public String getjCity() {
		return jCity;
	}

	public void setjCity(String jCity) {
		this.jCity = jCity;
	}

	public String getjCounty() {
		return jCounty;
	}

	public void setjCounty(String jCounty) {
		this.jCounty = jCounty;
	}

	public String getjShippercode() {
		return jShippercode;
	}

	public void setjShippercode(String jShippercode) {
		this.jShippercode = jShippercode;
	}

	public String getdProvince() {
		return dProvince;
	}

	public void setdProvince(String dProvince) {
		this.dProvince = dProvince;
	}

	public String getdCity() {
		return dCity;
	}

	public void setdCity(String dCity) {
		this.dCity = dCity;
	}

	public String getdCounty() {
		return dCounty;
	}

	public void setdCounty(String dCounty) {
		this.dCounty = dCounty;
	}

	public String getdDeliverycode() {
		return dDeliverycode;
	}

	public void setdDeliverycode(String dDeliverycode) {
		this.dDeliverycode = dDeliverycode;
	}

	public String getMailno() {
		return mailno;
	}

	public void setMailno(String mailno) {
		this.mailno = mailno;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public Date getSendstarttime() {
		return sendstarttime;
	}

	public void setSendstarttime(Date sendstarttime) {
		this.sendstarttime = sendstarttime;
	}

	public List<Cargo> getCargo() {
		return cargo;
	}

	public void setCargo(List<Cargo> cargo) {
		this.cargo = cargo;
	}

	public List<AddedService> getAddedService() {
		return addedService;
	}

	public void setAddedService(List<AddedService> addedService) {
		this.addedService = addedService;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("jContact", this.jContact)
				.append("dAddress", this.dAddress).append("custid", this.custid).append("jCity", this.jCity)
				.append("jAddress", this.jAddress).append("jMobile", this.jMobile).append("dCounty", this.dCounty)
				.append("jCompany", this.jCompany).append("shopName", this.shopName)
				.append("jShippercode", this.jShippercode).append("origOrderid", this.origOrderid)
				.append("expressType", this.expressType).append("dContact", this.dContact).append("remark", this.remark)
				.append("dCity", this.dCity).append("dCompany", this.dCompany)
				.append("sendstarttime", this.sendstarttime).append("jPostalCode", this.jPostalCode)
				.append("payMethod", this.payMethod).append("dTel", this.dTel).append("dMobile", this.dMobile)
				.append("template", this.template).append("jTel", this.jTel).append("dDeliverycode", this.dDeliverycode)
				.append("orderid", this.orderid).append("jProvince", this.jProvince).append("dProvince", this.dProvince)
				.append("jCounty", this.jCounty).append("mailno", this.mailno).append("dPostalCode", this.dPostalCode)
				.append("addedService", this.addedService).append("origMailno", this.origMailno)
				.append("cargo", this.cargo).toString();
	}

}
