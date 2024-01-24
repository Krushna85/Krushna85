package com.Test;

import org.testng.annotations.Test;

import com.utility.BaseClass;
import com.utility.TestUtils;

public class AddToWishlistTest extends BaseClass {

	@Test
	public void wishlist() {
		addToWishlist.enterSearchValue("phone");
		addToWishlist.clickOnSearch();
		addToWishlist.selectPosition("Price: Low to High");
		addToWishlist.selectDisplaySize("9");
		addToWishlist.clickOnLollipop();
		TestUtils.Custom_ThreadSleep(2000);
		addToWishlist.enterQuantity("1");
		addToWishlist.clickOnAddToWishlist();
		TestUtils.Custom_ThreadSleep(2000);
		TestUtils.Custom_Refresh();
		addToWishlist.clickOnWishlistModule();
		TestUtils.Custom_ThreadSleep(2000);

		if (driver.getPageSource().contains("HTC One M8 Android L 5.0 Lollipop")) {
			System.out.println("product added in wishlist");
		}
	}

}
