package com.Test;

import org.testng.annotations.Test;

import com.utility.BaseClass;
import com.utility.TestUtils;

public class ShippingCartTest extends BaseClass {

	@Test
	public void addShippingCart() {
		addCart.clickOnProduct();
		addCart.selectRAM("2 GB");
		addCart.selectHDD();
		addCart.selectSoftware();
		addCart.clickOnAddCart();
		TestUtils.Custom_ThreadSleep(2000);
		TestUtils.Custom_Refresh();
		addCart.clickOnShippingCart();
		addCart.clickOnGoToCart();
		addCart.clickOnTermCondition();
		addCart.clickOnCheckout();
		TestUtils.Custom_ThreadSleep(2000);
		addCart.selectCountry("India");
		addCart.sendCity("Noida");
		addCart.sendAddress1("laxmi pg");
		addCart.sendPostalCode("122001");
		addCart.sendPhoneNo("4492484929");
		addCart.clickOnContinue();
	}

}
