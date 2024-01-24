package com.Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.utility.BaseClass;

@Listeners(com.utility.Listener.class)
public class AddCartTest extends BaseClass {

	@Test
	public void AddToCart() {
		addCart.clickOnProduct();
		addCart.selectRAM("2 GB");
		addCart.selectHDD();
		addCart.selectSoftware();
		addCart.clickOnAddCart();
		// Assert.assertTrue(false);

	}

}
