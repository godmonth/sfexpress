package com.godmonth.sfexpress.bsp.impl;

import java.util.TimeZone;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

public class SimpleXstreamFactory {
	private SimpleXstreamFactory() {

	}

	public static XStream create() {
		XStream xStream = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
		xStream.autodetectAnnotations(true);
		xStream.ignoreUnknownElements();
		xStream.registerConverter(new DateConverter("yyyy-MM-dd HH:mm:ss", new String[0], TimeZone.getDefault()));
		return xStream;
	}
}
