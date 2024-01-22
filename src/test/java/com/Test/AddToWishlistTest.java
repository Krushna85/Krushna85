package com.Test;

import org.testng.annotations.Test;

import com.utility.BaseClass;

public class AddToWishlistTest extends BaseClass {

	@Test
	public void wishlist() {
		wish.enterSearchValue("phone");
		wish.clickOnSearch();
		wish.selectPosition("Price: Low to High");
		wish.selectDisplaySize("9");
		wish.clickOnLollipop();
		ts.Custom_ThreadSleep(2000);
		wish.enterQuantity("1");
		wish.clickOnAddToWishlist();
		ts.Custom_ThreadSleep(2000);
		ts.Custom_Refresh();
		wish.clickOnWishlistModule();
		ts.Custom_ThreadSleep(2000);

		if (driver.getPageSource().contains("HTC One M8 Android L 5.0 Lollipop")) {
			System.out.println("product added in wishlist");
		}
	}

}
