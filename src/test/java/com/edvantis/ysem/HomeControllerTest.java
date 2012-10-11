package com.edvantis.ysem;

import java.util.Locale;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.validation.support.BindingAwareModelMap;

public class HomeControllerTest {

	@Test
	public void test() {
		Assert.assertEquals("home", new HomeController().home(new Locale("UK_ua"), new BindingAwareModelMap()));
	}

}
