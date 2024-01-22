package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCart extends BasePage {
	public AddCart() {
		super();
	}

//============================ADD TO CART ELEMENT======================================
	@FindBy(xpath = "//img[@title='Show details for Build your own computer']")
	private WebElement PRODUCT;

	@FindBy(id = "product_attribute_2")
	private WebElement RAM;

	@FindBy(id = "product_attribute_3_6")
	private WebElement HDD;

	@FindBy(id = "product_attribute_5_11")
	private WebElement SOFTWARE_CKECKBOX;

	@FindBy(id = "add-to-cart-button-1")
	private WebElement ADD_CART_BUTTON;

	// ========================ADD TO CART GET METHOD========================

	public void clickOnProduct() {
		ts.Custom_Click(PRODUCT);
	}

	public void selectRAM(String ram) {
		ts.Custom_Handle_Dropdown(RAM, ram);
	}

	public void selectHDD() {
		ts.Custom_Click(HDD);
	}

	public void selectSoftware() {
		ts.Custom_Click(SOFTWARE_CKECKBOX);
	}

	public void clickOnAddCart() {
		ts.Custom_Click(ADD_CART_BUTTON);
	}

	// ========================SHIPPING ELEMENT===================================

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement SHOPPING_CART;

	@FindBy(xpath = "//button[text()='Go to cart']")
	private WebElement GO_TO_CART;

	@FindBy(id = "termsofservice")
	private WebElement TERM_CONDITION;

	@FindBy(id = "checkout")
	private WebElement CHECKOUT_BUTTON;

	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement COUNTRY;

	@FindBy(id = "BillingNewAddress_StateProvinceId")
	private WebElement STATE;

	@FindBy(id = "BillingNewAddress_City")
	private WebElement CITY;

	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement ADDRESS1;

	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement POSTAL_CODE;

	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement PHONE_NO;

	@FindBy(name = "save")
	private WebElement CONTINUE_BUTTON;

	// ===================SHIPPING GET METHOD===================================

	public void clickOnShippingCart() {
		ts.Custon_Handle_Dropdown2(SHOPPING_CART);
	}

	public void clickOnGoToCart() {
		ts.Custon_Action_Click(GO_TO_CART);
	}

	public void clickOnTermCondition() {
		ts.Custom_Click(TERM_CONDITION);
	}

	public void clickOnCheckout() {
		ts.Custom_Click(CHECKOUT_BUTTON);
	}

	public void selectCountry(String country) {
		ts.Custom_Handle_Dropdown(COUNTRY, country);
	}

	public void sendCity(String city) {
		ts.Custom_SendKeys(CITY, city);
	}

	public void sendAddress1(String address1) {
		ts.Custom_SendKeys(ADDRESS1, address1);
	}

	public void sendPostalCode(String postalcode) {
		ts.Custom_SendKeys(POSTAL_CODE, postalcode);
	}

	public void sendPhoneNo(String phoneno) {
		ts.Custom_SendKeys(PHONE_NO, phoneno);
	}

	public void clickOnContinue() {
		ts.Custom_Click(CONTINUE_BUTTON);
	}

}