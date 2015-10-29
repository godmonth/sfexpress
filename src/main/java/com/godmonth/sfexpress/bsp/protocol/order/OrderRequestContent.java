package com.godmonth.sfexpress.bsp.protocol.order;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 下订单（含筛选）
 * 
 * @author shenyue
 *
 */
@XStreamAlias("Order")
public class OrderRequestContent {
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
	 * 是否要求返回顺丰运单号：1: 要求,其它: 为不要求
	 */
	@XStreamAlias("is_gen_bill_no")
	@XStreamAsAttribute
	private Integer isGenBillNo;

	/**
	 * 寄件方公司名称
	 */
	@XStreamAlias("j_company")
	@XStreamAsAttribute
	private String jCompany;

	/**
	 * 寄件方联系人
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
	 * 寄件方国家/城市代码
	 */
	@XStreamAlias("j_shippercode")
	@XStreamAsAttribute
	private String jShippercode;

	/**
	 * 寄方国家
	 */
	@XStreamAlias("j_country")
	@XStreamAsAttribute
	private String jCountry;

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
	 * 寄件方详细地址
	 */
	@XStreamAlias("j_address")
	@XStreamAsAttribute
	private String jAddress;

	/**
	 * 寄方邮编
	 */
	@XStreamAlias("j_post_code")
	@XStreamAsAttribute
	private String jPostCode;

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
	 * 到件方代码
	 */
	@XStreamAlias("d_deliverycode")
	@XStreamAsAttribute
	private String dDeliverycode;

	/**
	 * 到方国家
	 */
	@XStreamAlias("d_country")
	@XStreamAsAttribute
	private String dCountry;

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
	 * 到件方详细地址
	 */
	@XStreamAlias("d_address")
	@XStreamAsAttribute
	private String dAddress;

	/**
	 * 到方邮编
	 */
	@XStreamAlias("d_post_code")
	@XStreamAsAttribute
	private String dPostCode;

	/**
	 * 顺丰月结卡号
	 */
	@XStreamAsAttribute
	private String custid;

	/**
	 * 付款方式:1:寄方付,2:收方付,3:第三方付
	 */
	@XStreamAlias("pay_method")
	@XStreamAsAttribute
	private Integer payMethod;

	/**
	 * 快件产品类别
	 */
	@XStreamAlias("express_type")
	@XStreamAsAttribute
	private String expressType;

	/**
	 * 包裹数
	 */
	@XStreamAlias("parcel_quantity")
	@XStreamAsAttribute
	private Integer parcelQuantity;

	/**
	 * 客户订单货物总长
	 */
	@XStreamAlias("cargo_length")
	@XStreamAsAttribute
	private BigDecimal cargoLength;

	/**
	 * 客户订单货物总宽
	 */
	@XStreamAlias("cargo_width")
	@XStreamAsAttribute
	private BigDecimal cargoWidth;

	/**
	 * 客户订单货物总高
	 */
	@XStreamAlias("cargo_height")
	@XStreamAsAttribute
	private BigDecimal cargoHeight;

	/**
	 * 订单货物总体积
	 */
	@XStreamAsAttribute
	private BigDecimal volume;

	/**
	 * 订单货物总重量
	 */
	@XStreamAlias("cargo_total_weight")
	@XStreamAsAttribute
	private BigDecimal cargoTotalWeight;

	/**
	 * 客户订单货物总声明价值
	 */
	@XStreamAlias("declared_value")
	@XStreamAsAttribute
	private BigDecimal declaredValue;

	/**
	 * 货物声明价值币别
	 */
	@XStreamAlias("declared_value_currency")
	@XStreamAsAttribute
	private String declaredValueCurrency;

	/**
	 * 报关批次
	 */
	@XStreamAlias("customs_batchs")
	@XStreamAsAttribute
	private String customsBatchs;

	/**
	 * 要求上门取件开始时间
	 */
	@XStreamAsAttribute
	private Date sendstarttime;

	/**
	 * 是否要求通过是否手持终端通知顺丰收派员收件.1：要求,其它:为不要求
	 */
	@XStreamAlias("is_docall")
	@XStreamAsAttribute
	private Integer isDocall;

	/**
	 * 是否要求签回单号
	 */
	@XStreamAlias("need_return_tracking_no")
	@XStreamAsAttribute
	private String needReturnTrackingNo;

	/**
	 * 顺丰签回单服务运单号
	 */
	@XStreamAlias("return_tracking")
	@XStreamAsAttribute
	private String returnTracking;

	/**
	 * 收件人税号
	 */
	@XStreamAlias("d_tax_no")
	@XStreamAsAttribute
	private String dTaxNo;

	/**
	 * 税金付款方式：
	 */
	@XStreamAlias("tax_pay_type")
	@XStreamAsAttribute
	private String taxPayType;

	/**
	 * 税金结算账号
	 */
	@XStreamAlias("tax_set_accounts")
	@XStreamAsAttribute
	private String taxSetAccounts;

	/**
	 * 电商原始订单号
	 */
	@XStreamAlias("original_number")
	@XStreamAsAttribute
	private String originalNumber;

	/**
	 * 支付工具
	 */
	@XStreamAlias("payment_tool")
	@XStreamAsAttribute
	private String paymentTool;

	/**
	 * 支付号码
	 */
	@XStreamAlias("payment_number")
	@XStreamAsAttribute
	private String paymentNumber;

	/**
	 * 商品编号
	 */
	@XStreamAlias("goods_code")
	@XStreamAsAttribute
	private String goodsCode;

	/**
	 * 头程运单号
	 */
	@XStreamAlias("in_process_waybill_no")
	@XStreamAsAttribute
	private String inProcessWaybillNo;

	/**
	 * 货物品牌
	 */
	@XStreamAsAttribute
	private String brand;

	/**
	 * 货物规格型号
	 */
	@XStreamAsAttribute
	private String specifications;

	/**
	 * 温度范围类型
	 */
	@XStreamAlias("temp_range")
	@XStreamAsAttribute
	private Integer tempRange;

	/**
	 * 客户订单下单人姓名
	 */
	@XStreamAlias("order_name")
	@XStreamAsAttribute
	private String orderName;

	/**
	 * 客户订单下单人证件类型
	 */
	@XStreamAlias("order_cert_type")
	@XStreamAsAttribute
	private String orderCertType;

	/**
	 * 客户订单下单人证件号
	 */
	@XStreamAlias("order_cert_no")
	@XStreamAsAttribute
	private String orderCertNo;

	/**
	 * 客户订单来源
	 */
	@XStreamAlias("order_source")
	@XStreamAsAttribute
	private String orderSource;

	/**
	 * 业务模板编码
	 */
	@XStreamAsAttribute
	private String template;

	/**
	 * 备注
	 */
	@XStreamAsAttribute
	private String remark;

	/**
	 * 快件自取；1 表示客户同意快件自取；非1 表示客户不同意快件自取
	 */
	@XStreamAlias("oneself_pickup_flg")
	@XStreamAsAttribute
	private Integer oneselfPickupFlg;

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

	public String getMailno() {
		return mailno;
	}

	public void setMailno(String mailno) {
		this.mailno = mailno;
	}

	public Integer getIsGenBillNo() {
		return isGenBillNo;
	}

	public void setIsGenBillNo(Integer isGenBillNo) {
		this.isGenBillNo = isGenBillNo;
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

	public String getjShippercode() {
		return jShippercode;
	}

	public void setjShippercode(String jShippercode) {
		this.jShippercode = jShippercode;
	}

	public String getjCountry() {
		return jCountry;
	}

	public void setjCountry(String jCountry) {
		this.jCountry = jCountry;
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

	public String getjAddress() {
		return jAddress;
	}

	public void setjAddress(String jAddress) {
		this.jAddress = jAddress;
	}

	public String getjPostCode() {
		return jPostCode;
	}

	public void setjPostCode(String jPostCode) {
		this.jPostCode = jPostCode;
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

	public String getdDeliverycode() {
		return dDeliverycode;
	}

	public void setdDeliverycode(String dDeliverycode) {
		this.dDeliverycode = dDeliverycode;
	}

	public String getdCountry() {
		return dCountry;
	}

	public void setdCountry(String dCountry) {
		this.dCountry = dCountry;
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

	public String getdAddress() {
		return dAddress;
	}

	public void setdAddress(String dAddress) {
		this.dAddress = dAddress;
	}

	public String getdPostCode() {
		return dPostCode;
	}

	public void setdPostCode(String dPostCode) {
		this.dPostCode = dPostCode;
	}

	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public Integer getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(Integer payMethod) {
		this.payMethod = payMethod;
	}

	public String getExpressType() {
		return expressType;
	}

	public void setExpressType(String expressType) {
		this.expressType = expressType;
	}

	public Integer getParcelQuantity() {
		return parcelQuantity;
	}

	public void setParcelQuantity(Integer parcelQuantity) {
		this.parcelQuantity = parcelQuantity;
	}

	public BigDecimal getCargoLength() {
		return cargoLength;
	}

	public void setCargoLength(BigDecimal cargoLength) {
		this.cargoLength = cargoLength;
	}

	public BigDecimal getCargoWidth() {
		return cargoWidth;
	}

	public void setCargoWidth(BigDecimal cargoWidth) {
		this.cargoWidth = cargoWidth;
	}

	public BigDecimal getCargoHeight() {
		return cargoHeight;
	}

	public void setCargoHeight(BigDecimal cargoHeight) {
		this.cargoHeight = cargoHeight;
	}

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	public BigDecimal getCargoTotalWeight() {
		return cargoTotalWeight;
	}

	public void setCargoTotalWeight(BigDecimal cargoTotalWeight) {
		this.cargoTotalWeight = cargoTotalWeight;
	}

	public BigDecimal getDeclaredValue() {
		return declaredValue;
	}

	public void setDeclaredValue(BigDecimal declaredValue) {
		this.declaredValue = declaredValue;
	}

	public String getDeclaredValueCurrency() {
		return declaredValueCurrency;
	}

	public void setDeclaredValueCurrency(String declaredValueCurrency) {
		this.declaredValueCurrency = declaredValueCurrency;
	}

	public String getCustomsBatchs() {
		return customsBatchs;
	}

	public void setCustomsBatchs(String customsBatchs) {
		this.customsBatchs = customsBatchs;
	}

	public Date getSendstarttime() {
		return sendstarttime;
	}

	public void setSendstarttime(Date sendstarttime) {
		this.sendstarttime = sendstarttime;
	}

	public Integer getIsDocall() {
		return isDocall;
	}

	public void setIsDocall(Integer isDocall) {
		this.isDocall = isDocall;
	}

	public String getNeedReturnTrackingNo() {
		return needReturnTrackingNo;
	}

	public void setNeedReturnTrackingNo(String needReturnTrackingNo) {
		this.needReturnTrackingNo = needReturnTrackingNo;
	}

	public String getReturnTracking() {
		return returnTracking;
	}

	public void setReturnTracking(String returnTracking) {
		this.returnTracking = returnTracking;
	}

	public String getdTaxNo() {
		return dTaxNo;
	}

	public void setdTaxNo(String dTaxNo) {
		this.dTaxNo = dTaxNo;
	}

	public String getTaxPayType() {
		return taxPayType;
	}

	public void setTaxPayType(String taxPayType) {
		this.taxPayType = taxPayType;
	}

	public String getTaxSetAccounts() {
		return taxSetAccounts;
	}

	public void setTaxSetAccounts(String taxSetAccounts) {
		this.taxSetAccounts = taxSetAccounts;
	}

	public String getOriginalNumber() {
		return originalNumber;
	}

	public void setOriginalNumber(String originalNumber) {
		this.originalNumber = originalNumber;
	}

	public String getPaymentTool() {
		return paymentTool;
	}

	public void setPaymentTool(String paymentTool) {
		this.paymentTool = paymentTool;
	}

	public String getPaymentNumber() {
		return paymentNumber;
	}

	public void setPaymentNumber(String paymentNumber) {
		this.paymentNumber = paymentNumber;
	}

	public String getGoodsCode() {
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getInProcessWaybillNo() {
		return inProcessWaybillNo;
	}

	public void setInProcessWaybillNo(String inProcessWaybillNo) {
		this.inProcessWaybillNo = inProcessWaybillNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	public Integer getTempRange() {
		return tempRange;
	}

	public void setTempRange(Integer tempRange) {
		this.tempRange = tempRange;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderCertType() {
		return orderCertType;
	}

	public void setOrderCertType(String orderCertType) {
		this.orderCertType = orderCertType;
	}

	public String getOrderCertNo() {
		return orderCertNo;
	}

	public void setOrderCertNo(String orderCertNo) {
		this.orderCertNo = orderCertNo;
	}

	public String getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getOneselfPickupFlg() {
		return oneselfPickupFlg;
	}

	public void setOneselfPickupFlg(Integer oneselfPickupFlg) {
		this.oneselfPickupFlg = oneselfPickupFlg;
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
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("jCity", this.jCity)
				.append("oneselfPickupFlg", this.oneselfPickupFlg)
				.append("dProvince", this.dProvince)
				.append("specifications", this.specifications)
				.append("paymentTool", this.paymentTool)
				.append("payMethod", this.payMethod)
				.append("dPostCode", this.dPostCode)
				.append("cargoTotalWeight", this.cargoTotalWeight)
				.append("declaredValueCurrency", this.declaredValueCurrency)
				.append("cargo", this.cargo).append("brand", this.brand)
				.append("declaredValue", this.declaredValue)
				.append("jAddress", this.jAddress)
				.append("expressType", this.expressType)
				.append("jMobile", this.jMobile).append("jCounty", this.jCounty)
				.append("isGenBillNo", this.isGenBillNo)
				.append("jShippercode", this.jShippercode)
				.append("dCompany", this.dCompany)
				.append("sendstarttime", this.sendstarttime)
				.append("returnTracking", this.returnTracking)
				.append("jCompany", this.jCompany)
				.append("isDocall", this.isDocall).append("mailno", this.mailno)
				.append("volume", this.volume)
				.append("inProcessWaybillNo", this.inProcessWaybillNo)
				.append("dAddress", this.dAddress)
				.append("dMobile", this.dMobile).append("custid", this.custid)
				.append("dTel", this.dTel)
				.append("taxSetAccounts", this.taxSetAccounts)
				.append("dTaxNo", this.dTaxNo)
				.append("customsBatchs", this.customsBatchs)
				.append("paymentNumber", this.paymentNumber)
				.append("jCountry", this.jCountry)
				.append("template", this.template)
				.append("dDeliverycode", this.dDeliverycode)
				.append("remark", this.remark)
				.append("cargoWidth", this.cargoWidth)
				.append("cargoHeight", this.cargoHeight)
				.append("dCity", this.dCity)
				.append("addedService", this.addedService)
				.append("dCountry", this.dCountry)
				.append("dCounty", this.dCounty)
				.append("taxPayType", this.taxPayType)
				.append("cargoLength", this.cargoLength)
				.append("orderName", this.orderName).append("jTel", this.jTel)
				.append("parcelQuantity", this.parcelQuantity)
				.append("originalNumber", this.originalNumber)
				.append("orderSource", this.orderSource)
				.append("orderid", this.orderid)
				.append("orderCertType", this.orderCertType)
				.append("needReturnTrackingNo", this.needReturnTrackingNo)
				.append("jProvince", this.jProvince)
				.append("jPostCode", this.jPostCode)
				.append("dContact", this.dContact)
				.append("tempRange", this.tempRange)
				.append("jContact", this.jContact)
				.append("goodsCode", this.goodsCode)
				.append("orderCertNo", this.orderCertNo).toString();
	}

}
