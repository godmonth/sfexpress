package com.godmonth.sfexpress.bsp.protocol;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 请求父类
 * 
 * @author shenyue
 *
 */
@XStreamAlias("Request")
public class Request2<T> {

	/**
	 * 服务名
	 */
	@XStreamAsAttribute
	private String service;

	/**
	 * 定义响应报文的语言
	 */
	@XStreamAsAttribute
	private String lang;

	@XStreamAlias("Head")
	private String head;

	@XStreamAlias("Body")
	private T body;

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("head", this.head).append("service", this.service)
				.append("lang", this.lang).append("body", this.body).toString();
	}

}
