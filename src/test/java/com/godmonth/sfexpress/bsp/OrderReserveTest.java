package com.godmonth.sfexpress.bsp;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.godmonth.sfexpress.bsp.protocol.constants.BspBusinessType;
import com.godmonth.sfexpress.bsp.protocol.constants.PayMethod;
import com.godmonth.sfexpress.bsp.protocol.order.Cargo;
import com.godmonth.sfexpress.bsp.protocol.orderreverse.OrderReserveRequest;
import com.godmonth.sfexpress.bsp.protocol.orderreverse.OrderReserveRequestBody;
import com.godmonth.sfexpress.bsp.protocol.orderreverse.OrderReserveRequestContent;
import com.godmonth.sfexpress.bsp.protocol.orderreverse.OrderReserveResponse;

public class OrderReserveTest extends SfExpressClientTest {

	private static final Logger logger = LoggerFactory.getLogger(OrderReserveTest.class);

	@Test
	public void order() throws IOException {
		OrderReserveResponse orderResponse = sfExpressClient.post(createOrderRequest(), OrderReserveResponse.class);
		System.out.println(orderResponse);
		logger.trace("orderid:{}", orderResponse.getBody().getOrderResponse().getOrderid());
		logger.trace("mailno:{}", orderResponse.getBody().getOrderResponse().getMailno());
		FileUtils.write(new File("target/orderid.txt"), orderResponse.getBody().getOrderResponse().getOrderid());
		FileUtils.write(new File("target/mailno.txt"), orderResponse.getBody().getOrderResponse().getMailno());
	}

	private OrderReserveRequest createOrderRequest() {
		OrderReserveRequestContent order = new OrderReserveRequestContent();
		order.setOrderid(StringUtils.substring(UUID.randomUUID().toString(), 0, 25));

		order.setCustid("0217379256");
		order.setPayMethod(PayMethod.THIRD_PARY_PAYMENT.getCode());
		order.setParcelQuantity(1);

		order.setExpressType(BspBusinessType.STANDARD.getCode());

		// order.setOrderid("201510290002");
		order.setjContact("王先生");
		order.setjMobile("13812341234");
		order.setjAddress("东方路1234号5678室");
		order.setjCity("上海市");
		order.setjCounty("浦东新区");
		order.setjTel("021-12345678");
		order.setjProvince("上海");
		// order.setjPostCode("200062");

		order.setdContact("李先生");
		order.setdMobile("1394321431");
		order.setdAddress("浦电路1234号5678室");
		order.setdCity("上海市");
		order.setdCounty("浦东新区");
		order.setdTel("021-43218765");
		order.setdProvince("上海");
		// order.setdPostCode("200063");
		Cargo cargo = new Cargo();
		cargo.setName("你好");
		order.setCargo(Collections.singletonList(cargo));

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

		OrderReserveRequest request = new OrderReserveRequest(new OrderReserveRequestBody(order));

		return request;
	}
}
