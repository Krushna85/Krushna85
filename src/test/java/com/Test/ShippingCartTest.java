package com.Test;

import org.testng.annotations.Test;

import com.utility.BaseClass;

public class ShippingCartTest extends BaseClass {

	@Test
	public void addShippingCart() {
		ac.clickOnProduct();
		ac.selectRAM("2 GB");
		ac.selectHDD();
		ac.selectSoftware();
		ac.clickOnAddCart();
		ts.Custom_ThreadSleep(2000);
		ts.Custom_Refresh();
		ac.clickOnShippingCart();
		ac.clickOnGoToCart();
		ac.clickOnTermCondition();
		ac.clickOnCheckout();
		ts.Custom_ThreadSleep(2000);
		ac.selectCountry("India");
		ac.sendCity("Noida");
		ac.sendAddress1("laxmi pg");
		ac.sendPostalCode("122001");
		ac.sendPhoneNo("4492484929");
		ac.clickOnContinue();
	}

}
