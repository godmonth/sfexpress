package com.godmonth.sfexpress.bsp.protocol;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Response {

	/**
	 * 服务名
	 */
	@XStreamAsAttribute
	private String service;

	@XStreamAlias("Head")
	private String head;

	@XStreamAlias("ERROR")
	private ResponseError error;

	public Response() {
	}

	public Response(String service, String head, ResponseError error) {
		this.service = service;
		this.head = head;
		this.error = error;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public ResponseError getError() {
		return error;
	}

	public void setError(ResponseError error) {
		this.error = error;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("head", this.head).append("service", this.service)
				.append("error", this.error).toString();
	}

}
