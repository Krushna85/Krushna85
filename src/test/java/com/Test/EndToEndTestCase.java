package com.Test;

import org.testng.annotations.Test;

import com.utility.BaseClass;
import com.utility.TestUtils;

public class EndToEndTestCase extends BaseClass {

	@Test
	public void buyProduct() throws InterruptedException {
		TestUtils.Custom_ThreadSleep(2000);
		loginPage.clickOnLoginModule();
		TestUtils.Custom_ThreadSleep(2000);
		loginPage.sendEmail(Username);
		loginPage.sendPassword(Password);
		loginPage.clickOnLoginCTA();
		homePage.sendValueInSearchBar();
		homePage.clickOnSearch();
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
		billingAddressPage.clickOnContinue();
		shippingAddressPage.selectShippingAddress();
		shippingAddressPage.clickOnContinue();
		shippingAddressPage.selectPaymentMethod();
		shippingAddressPage.clickOnContinue2();
		shippingAddressPage.selectCreditCardType();
		shippingAddressPage.enterCardHolderName(userRegistration.Custom_Random_String() + "holderName");
		shippingAddressPage.enterCardNumber("5413330089010640");
		shippingAddressPage.selectMonth("08");
		shippingAddressPage.selectYear("2027");
		shippingAddressPage.enterCardCode("002");
		shippingAddressPage.clickOnContinue3();
		shippingAddressPage.clickOnConfirm();
		if (driver.getPageSource().contains("Your order has been successfully processed!")) {
			// Assert.assertTrue(true);
			log.info("user order placed successfully ");
		} else {
			// Assert.assertTrue(false);
			log.info("unable to place  a user order");
		}

		log.info("the order no is");
		shippingAddressPage.getOrderNo();
		orderInformationPage.clickOnCheckOrderDetails();
		orderInformationPage.GetOrderDetails();

	}
}
