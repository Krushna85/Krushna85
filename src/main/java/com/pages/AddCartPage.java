package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utility.TestUtils;

public class AddCartPage extends BasePage {

	public AddCartPage() {
		super();
	}

	@FindBy(id = "product_attribute_1")
	private WebElement PROCESSOR;

	@FindBy(id = "product_attribute_2")
	private WebElement RAM;

	@FindBy(xpath = "//label[text()='320 GB']")
	private WebElement HDD;

	@FindBy(xpath = "//label[text()='Vista Home [+$50.00]']")
	private WebElement OS;

	@FindBy(xpath = "//label[text()='Microsoft Office [+$50.00]']")
	private WebElement SOFTWARE;

	@FindBy(xpath = "//span[@id='price-value-1']")
	private WebElement PRODUCT_PRICE;

	@FindBy(id = "add-to-cart-button-1")
	private WebElement ADD_CART_BUTTON;

	@FindBy(xpath = "//div[@id='bar-notification']")
	private WebElement ADD_CART_CONFIRMATION_MSG;

	@FindBy(xpath = "//span[@class='cart-label']")
	private WebElement SHOPPING_CART;

	@FindBy(xpath = "//button[text()='Go to cart']")
	private WebElement GO_TO_CART;

//  ========================Add Cart Method=============================

	public void selectProcessor(String processor) {
		TestUtils.Custom_Handle_Dropdown(PROCESSOR, processor);
	}

	public void selectRam(String ram) {
		TestUtils.Custom_Handle_Dropdown(RAM, ram);
	}

	public void selectHDD() {
		TestUtils.Custom_Click(HDD, "selectHDD");
	}

	public void selectOS() {
		TestUtils.Custom_Click(OS, "selectOS");
	}

	public void selectSoftware() {
		TestUtils.Custom_Click(SOFTWARE, "selectSoftware");
	}

	public void clickAddCart() {
		TestUtils.Custom_Click(ADD_CART_BUTTON, "clickAddCart");
	}

//	public void verifyAddCartConfirmationMsg() {
//		TestUtils.Custom_is_Displayed(ADD_CART_CONFIRMATION_MSG, "verifyAddCartConfirmationMsg");
//		TestUtils.getText(ADD_CART_CONFIRMATION_MSG);
//	}

	public void moveOnWishlistCart() {
		TestUtils.Custom_ThreadSleep(3000);
		TestUtils.Custom_Refresh();
		TestUtils.Custon_Handle_Dropdown2(SHOPPING_CART);
		TestUtils.Custom_ThreadSleep(3000);
	}

	public void clickOnGoToCart() {
		TestUtils.Custon_Action_Click(GO_TO_CART);
	}

}
