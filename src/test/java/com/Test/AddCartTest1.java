package com.Test;

import org.testng.annotations.Test;

import com.utility.BaseClass;
import com.utility.TestUtils;

public class AddCartTest1 extends BaseClass {

	@Test
	public void addProductToCart() {
		loginPage.clickOnLoginModule();
		TestUtils.Custom_ThreadSleep(2000);
		loginPage.sendEmail(Username);
		loginPage.sendPassword(Password);
		loginPage.clickOnLoginCTA();
		homePage.sendProductInsearch("computer");
		homePage.clickOnComputer();
		addCartPage.selectProcessor("2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");
		addCartPage.selectRam("4GB [+$20.00]");
		addCartPage.selectHDD();
		addCartPage.selectOS();
		addCartPage.selectSoftware();
		addCartPage.clickAddCart();
		addCartPage.moveOnWishlistCart();
//	    addCartPage.removeProductFromCart();
		addCartPage.clickOnGoToCart();
		shoppingCartPage.getProductDetailsOnWishlist();
		shoppingCartPage.verifyDetails();
		shoppingCartPage.getUnitPrice();
		shoppingCartPage.getTotalPrice();
		shoppingCartPage.getProductTotalDetails();
		shoppingCartPage.clickOnTermAndCondition();
		shoppingCartPage.clickOnCheckout();
		billingAddressPage.selectCountry("India");
		billingAddressPage.selectState("0");
		billingAddressPage.sendCity("Gurgaon");
		billingAddressPage.sendAddress1("laxmi pg");
		billingAddressPage.sendPostalCode("122001");
		billingAddressPage.sendPhoneNo("8334822943");

	}
}
