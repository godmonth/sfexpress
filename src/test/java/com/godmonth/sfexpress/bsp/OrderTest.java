package com.godmonth.sfexpress.bsp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.godmonth.sfexpress.bsp.protocol.constants.BspBusinessType;
import com.godmonth.sfexpress.bsp.protocol.order.Cargo;
import com.godmonth.sfexpress.bsp.protocol.order.OrderRequest;
import com.godmonth.sfexpress.bsp.protocol.order.OrderRequestBody;
import com.godmonth.sfexpress.bsp.protocol.order.OrderRequestContent;
import com.godmonth.sfexpress.bsp.protocol.order.OrderResponse;

public class OrderTest extends SfExpressClientTest {

	private static final Logger logger = LoggerFactory.getLogger(OrderTest.class);

	@Test
	public void order() throws IOException {
		OrderResponse orderResponse = sfExpressClient.post(createOrderRequest(), OrderResponse.class);
		System.out.println(orderResponse);
		logger.trace("orderid:{}", orderResponse.getBody().getOrderResponse().getOrderid());
		logger.trace("mailno:{}", orderResponse.getBody().getOrderResponse().getMailno());
		FileUtils.write(new File("target/orderid.txt"), orderResponse.getBody().getOrderResponse().getOrderid());
		FileUtils.write(new File("target/mailno.txt"), orderResponse.getBody().getOrderResponse().getMailno());
	}

	private OrderRequest createOrderRequest() {
		OrderRequestContent order = new OrderRequestContent();
		order.setOrderid(UUID.randomUUID().toString());
		// order.setOrderid("cbf70f0c-f177-4c80-9d72-e469258ae036");
		order.setIsGenBillNo(1);
		order.setCustid("SHBW");
		order.setExpressType(BspBusinessType.STANDARD.getCode());
		order.setjContact("王先生");
		order.setjMobile("13812341234");

		order.setjAddress("共和新路1234号45678室");
		order.setdAddress("东方路6766号");
		order.setdContact("王先生");
		order.setdMobile("13812341234");

		Cargo cargo = new Cargo();
		cargo.setName("你好");
		List<Cargo> l = new ArrayList<Cargo>();
		l.add(cargo);
		order.setCargo(Arrays.asList(cargo));

		// List<AddedService> addedServices = new ArrayList<>();
		// {
		// AddedService addedService = new AddedService();
		// addedService.setName("dfff");
		// addedServices.add(addedService);
		// }
		// {
		// AddedService addedService = new AddedService();
		// addedService.setName("dfff123");
		// addedServices.add(addedService);
		// }

		// order.setAddedService(addedServices);

		OrderRequest request = new OrderRequest(new OrderRequestBody(order));

		return request;
	}
}
