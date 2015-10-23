package com.godmonth.sfexpress.bsp.protocol.order;

import java.math.BigDecimal;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 货物
 * 
 * @author shenyue
 *
 */
@XStreamAlias("Cargo")
public class Cargo {
	/**
	 * 货物名称
	 */
	@XStreamAsAttribute
	private String name;

	/**
	 * 货物数量
	 */
	@XStreamAsAttribute
	private Integer count;

	/**
	 * 货物单位
	 */
	@XStreamAsAttribute
	private Integer unit;

	/**
	 * 订单货物单位重量
	 */
	@XStreamAsAttribute
	private BigDecimal weight;

	/**
	 * 货物单价
	 */
	@XStreamAsAttribute
	private BigDecimal amount;

	/**
	 * 货物单价的币别
	 */
	@XStreamAsAttribute
	private String currency;

	/**
	 * 原产地国别
	 */
	@XStreamAlias("source_area")
	@XStreamAsAttribute
	private String sourceArea;

	/**
	 * 货物产品国检备案编号
	 */
	@XStreamAlias("product_record_no")
	@XStreamAsAttribute
	private String productRecordNo;

	/**
	 * 商品海关备案号
	 */
	@XStreamAlias("good_prepard_no")
	@XStreamAsAttribute
	private String goodPrepardNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getUnit() {
		return unit;
	}

	public void setUnit(Integer unit) {
		this.unit = unit;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getSourceArea() {
		return sourceArea;
	}

	public void setSourceArea(String sourceArea) {
		this.sourceArea = sourceArea;
	}

	public String getProductRecordNo() {
		return productRecordNo;
	}

	public void setProductRecordNo(String productRecordNo) {
		this.productRecordNo = productRecordNo;
	}

	public String getGoodPrepardNo() {
		return goodPrepardNo;
	}

	public void setGoodPrepardNo(String goodPrepardNo) {
		this.goodPrepardNo = goodPrepardNo;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("sourceArea", this.sourceArea).append("unit", this.unit)
				.append("amount", this.amount).append("name", this.name)
				.append("count", this.count).append("weight", this.weight)
				.append("currency", this.currency)
				.append("goodPrepardNo", this.goodPrepardNo)
				.append("productRecordNo", this.productRecordNo).toString();
	}

}
