package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.utility.BaseClass;

public class HomeTest extends BaseClass {

	@Test(priority = 1)
	public void productLogo() {
		homePage.verifyProductLogoDisplayed();
	}

	@Test(priority = 2)
	public void htcLolipopImgNamePrice() {
		homePage.sendValueInSearchBar();
		homePage.clickOnSearch();
		homePage.verifyHTClolipopDisplayed();
		homePage.verifyHTClolipopNameDisplayed();
		homePage.verifyHTClolipopPriceDisplayed();
	}

	@Test(priority = 3)
	public void htcMiniblueImgNamePrice() {
		homePage.sendValueInSearchBar();
		homePage.clickOnSearch();
		homePage.verifyHTCMiniblueIMGDisplayed();
		homePage.verifyHTCMiniblueNameDisplayed();
		homePage.verifyHTCMinibluePriceDisplayed();
	}

	@Test(enabled = false)
	public void totalElementOnWebPage() {
		homePage.sendValueInSearchBar();
		homePage.clickOnSearch();
		// homePage.countAllElements();
	}

	@Test(priority = 4, enabled = false)
	public void SearchProductNotAvailable() {

		homePage.sendValueInSearchBar();
		homePage.clickOnSearch();
		homePage.verifyNoProductErrorMsg();

	}

	@Test(priority = 5)
	public void verifyProductRedirection() {
		homePage.sendValueInSearchBar();
		homePage.clickOnSearch();
		homePage.verifyHTClolipopNameDisplayed();
		homePage.clickOnHTClolipop();
		if (driver.getPageSource().contains("HTC One M8 Android L 5.0 Lollipop")) {
			Assert.assertTrue(true, "user is not redirect to product detail page");
		} else {
			Assert.assertTrue(false, "user is redirect to product detail page");
		}
	}
}
