package com.godmonth.sfexpress.bsp.protocol.deliverytm;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class DeliverTmResponseBody {

	@XStreamAlias("DeliverTmResponse")
	private DeliverTmResponseContent content;

	public DeliverTmResponseBody() {
	}

	public DeliverTmResponseBody(DeliverTmResponseContent content) {
		this.content = content;
	}

	public DeliverTmResponseContent getContent() {
		return content;
	}

	public void setContent(DeliverTmResponseContent content) {
		this.content = content;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("content", this.content).toString();
	}

}
