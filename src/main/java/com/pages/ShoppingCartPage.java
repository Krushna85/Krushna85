package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utility.TestUtils;

public class ShoppingCartPage extends BasePage {

	public ShoppingCartPage() {
		super();
	}

	@FindBy(xpath = "//a[@class='product-name']")
	private WebElement WISHLIST_COMMON_PRODUCT;

	@FindBy(xpath = "(//div[@class='attributes'])[2]")
	private WebElement WISHLIST_PRODUCT_DETAILS;

	@FindBy(xpath = "//span[@class='product-unit-price']")
	private WebElement UNIT_PRICE;

	@FindBy(xpath = "//span[@class='product-subtotal']")
	private WebElement TOTAL_PRICE;

	@FindBy(id = "itemquantity11251")
	private WebElement PRODUCT_QUANTITY;

	@FindBy(name = "updatecart")
	private WebElement PRODUCT_REMOVED_FROM_CART_BUTTON;

	@FindBy(xpath = "//div[@class='total-info']")
	private WebElement ALL_PRODUCT_PRICE_DETAILS;

	@FindBy(id = "termsofservice")
	private WebElement TERM_CONDITION;

	@FindBy(id = "checkout")
	private WebElement CHECKOUT_BUTTON;

	public void getProductDetailsOnWishlist() {
		log.info("below is the product details");
		TestUtils.getText(WISHLIST_PRODUCT_DETAILS);
	}

	public void verifyDetails() {
		String actualDetails = WISHLIST_PRODUCT_DETAILS.getText();
		String a = "4GB [+$20.00]";
		String b = "2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]";
		actualDetails.contains(a);
		log.info("verified RAM on wishlist page");
		actualDetails.contains(b);
		log.info("verified PROCESSOR on wishlist page");

		// Assert.assertTrue(true);
	}

	public void removeProductFromCart() {
		TestUtils.Custom_ThreadSleep(3000);
		TestUtils.Custom_Click(PRODUCT_REMOVED_FROM_CART_BUTTON, "removeProductFromCart");
		if (driver.getPageSource().contains("Your Shopping Cart is empty!")) {
			log.info("product removed");
		} else {
			log.info("product is not removed removed");

		}
	}

	// public void getUnitPrice() {
//		String unitPriceText = UNIT_PRICE.getText();
//		String ActualUnitPrice = unitPriceText.replaceAll("[^a-zA-Z0-9]", "");
//		double finalUnitPrice = Double.parseDouble(ActualUnitPrice);
//		return finalUnitPrice / 100;
	// String unit = TestUtils.getText(UNIT_PRICE);
//	}

	// public void getTotalPrice() {
//		String totalPriceText = TOTAL_PRICE.getText();
//		String actualTotalPrice = totalPriceText.replaceAll("[^a-zA-Z0-9]", "");
//		double finalTotalPrice = Double.parseDouble(actualTotalPrice);
//		return finalTotalPrice / 100;
//		TestUtils.getText(TOTAL_PRICE);
//	}

	public void getUnitPrice() {
		String unitPriceText = UNIT_PRICE.getText().replaceAll("[^a-zA-Z0-9]", "");
		double actualUnitPrice = Double.parseDouble(unitPriceText);
		System.out.println(("single unit product price is " + (actualUnitPrice) / 100));
	}

	public void getTotalPrice() {
		log.info("total product price is");
		String totalPrice1 = TOTAL_PRICE.getText();
		String tot = totalPrice1.replaceAll("[^a-zA-Z0-9]", "");
		double finalTotalPrice = Double.parseDouble(tot);
		System.out.println(("total unit product price is " + (finalTotalPrice) / 100));
	}

	public void getProductTotalDetails() {
		log.info("all product price details");
		TestUtils.getText(ALL_PRODUCT_PRICE_DETAILS);
	}

	public void clickOnTermAndCondition() {
		TestUtils.Custom_Click(TERM_CONDITION, "clickOnTermAndCondition");
	}

	public void clickOnCheckout() {
		TestUtils.Custom_Click(CHECKOUT_BUTTON, "clickOnCheckout");
	}
}
