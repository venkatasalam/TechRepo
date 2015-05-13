package com.singpost.test;
import junit.framework.Assert;
import org.junit.Test;

import com.mkyong.common.controller.App;

public class AppTest {
	@Test
	public void testPrintHelloWorld() {

		Assert.assertEquals(App.getHelloWorld(), "Hello World");

	}
}