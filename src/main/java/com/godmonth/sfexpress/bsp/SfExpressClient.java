package com.godmonth.sfexpress.bsp;

import com.godmonth.sfexpress.bsp.protocol.Request;
import com.godmonth.sfexpress.bsp.protocol.Response;

public interface SfExpressClient {
	public <REQ extends Request, RES extends Response> RES post(REQ request, Class<RES> responseClass);
}
