package com.Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.utility.BaseClass;

@Listeners(com.utility.Listener.class)
public class AddCartTest extends BaseClass {

	@Test
	public void AddToCart() {
		ac.clickOnProduct();
		ac.selectRAM("2 GB");
		ac.selectHDD();
		ac.selectSoftware();
		ac.clickOnAddCart();
		// Assert.assertTrue(false);

	}

}
