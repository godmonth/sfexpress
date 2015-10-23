package com.godmonth.sfexpress.bsp.protocol.order;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 增值服务
 * 
 * @author shenyue
 *
 */
@XStreamAlias("AddedService")
public class AddedService {
	/**
	 * 增值服务名
	 */
	@XStreamAsAttribute
	private String name;
	/**
	 * 增值服务扩展属性
	 */
	@XStreamAsAttribute
	private String value;
	/**
	 * 增值服务扩展属性
	 */
	@XStreamAsAttribute
	private String value1;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("value1", this.value1).append("name", this.name)
				.append("value", this.value).toString();
	}

}
