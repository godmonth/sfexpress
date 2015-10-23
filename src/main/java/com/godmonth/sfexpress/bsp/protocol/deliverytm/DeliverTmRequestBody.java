package com.godmonth.sfexpress.bsp.protocol.deliverytm;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class DeliverTmRequestBody {
	@XStreamAlias("DeliverTmRequest")
	private DeliverTmRequestContent content;

	public DeliverTmRequestBody() {
		super();
	}

	public DeliverTmRequestBody(DeliverTmRequestContent content) {
		super();
		this.content = content;
	}

	public DeliverTmRequestContent getContent() {
		return content;
	}

	public void setContent(DeliverTmRequestContent content) {
		this.content = content;
	}

}
