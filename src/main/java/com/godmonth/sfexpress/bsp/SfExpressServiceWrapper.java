package com.godmonth.sfexpress.bsp;

public interface SfExpressServiceWrapper {
	public <T> T post(Object request, Class<T> responseClass);
}
