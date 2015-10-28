package com.godmonth.sfexpress.bsp;

import java.io.IOException;
import java.util.Date;

import org.testng.annotations.Test;

import com.godmonth.sfexpress.bsp.protocol.deliverytm.Address;
import com.godmonth.sfexpress.bsp.protocol.deliverytm.DeliverTmRequest;
import com.godmonth.sfexpress.bsp.protocol.deliverytm.DeliverTmRequestBody;
import com.godmonth.sfexpress.bsp.protocol.deliverytm.DeliverTmRequestContent;
import com.godmonth.sfexpress.bsp.protocol.deliverytm.DeliverTmResponse;

public class DeliverTmTest extends SfExpressClientTest {
	@Test
	public void deliverTm() throws IOException {
		DeliverTmResponse orderResponse = sfExpressClient.post(createRequest(),
				DeliverTmResponse.class);
		System.out.println(orderResponse);
	}

	private DeliverTmRequest createRequest() throws IOException {
		DeliverTmRequestContent requestContent = new DeliverTmRequestContent();
		requestContent.setBusinessType("1");
		requestContent.setConsignedTime(new Date());

		Address srcAddress = new Address();
		srcAddress.setProvince("上海");
		srcAddress.setCity("上海市");
		srcAddress.setDistrict("闸北区");
		srcAddress.setAddress("上海市共和新路3699号共和国际商务广场B座xxxx室");
		requestContent.setSrcAddress(srcAddress);

		Address destAddress = new Address();
		destAddress.setProvince("上海");
		destAddress.setCity("上海市");
		destAddress.setDistrict("浦东新区");
		destAddress.setAddress("上海市蓝村路xxx弄xx号xxx室");
		requestContent.setDestAddress(destAddress);

		DeliverTmRequest deliverTmRequest = new DeliverTmRequest("BSPdevelop",
				new DeliverTmRequestBody(requestContent));
		return deliverTmRequest;
	}
}
