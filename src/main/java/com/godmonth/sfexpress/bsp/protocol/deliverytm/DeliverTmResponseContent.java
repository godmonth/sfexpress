package com.godmonth.sfexpress.bsp.protocol.deliverytm;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class DeliverTmResponseContent {
	@XStreamAlias("DeliverTm")
	private DeliverTm deliverTm;

	public DeliverTm getDeliverTm() {
		return deliverTm;
	}

	public void setDeliverTm(DeliverTm deliverTm) {
		this.deliverTm = deliverTm;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("deliverTm", this.deliverTm).toString();
	}

}
