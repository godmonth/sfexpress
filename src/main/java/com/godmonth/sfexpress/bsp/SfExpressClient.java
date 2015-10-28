package com.godmonth.sfexpress.bsp;

public interface SfExpressClient {
	public <T> T post(Object request, Class<T> responseClass);
}
