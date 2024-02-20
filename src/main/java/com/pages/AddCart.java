package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utility.TestUtils;

public class AddCart extends BasePage {

	public AddCart() {
		super();
	}

//============================ADD TO CART ELEMENT======================================
	@FindBy(xpath = "//img[@title='Show details for Build your own computer']")
	private WebElement PRODUCT;

	@FindBy(xpath = "//div[@class='product-name']")
	private WebElement COMMON_PRODUCT_TEXT;

	@FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
	private WebElement PRODUCT_TEXT_COMPUTER;

	@FindBy(xpath = "(//select[@id='product_attribute_1'])//option[text()][2]")
	private WebElement PROCESSOR_O1;

	@FindBy(xpath = "(//select[@id='product_attribute_2'])//option[text()][2]")
	private WebElement RAM;

	@FindBy(xpath = "(//ul[@class='option-list']/li[1])/label[1]")
	private WebElement HDD;

	@FindBy(xpath = "(//ul[@class='option-list']/li[1])/label[2]")
	private WebElement OS;

	@FindBy(xpath = "(//ul[@class='option-list']/li[1])/label[3]")
	private WebElement SOFTWARE_CKECKBOX;

	@FindBy(xpath = "//div[@class='product-price']")
	private WebElement PRODUCT_PRICE;

//	@FindBy(id = "product_attribute_5_11")
//	private WebElement SOFTWARE_CKECKBOX;

	@FindBy(id = "add-to-cart-button-1")
	private WebElement ADD_CART_BUTTON;

//============================WISHLIST WEB ELEMENT======================================

	@FindBy(xpath = "//a[@class='product-name']")
	private WebElement COMMON_PRODUCT_TEXT_WISHLIST;

	@FindBy(xpath = "(//div[@class='attributes'])/text()[1]")
	private WebElement PROCESSOR_O1_WISHLIST;

	@FindBy(xpath = "(//div[@class='attributes'])/text()[2]")
	private WebElement RAM_WISHLIST;

	@FindBy(xpath = "(//div[@class='attributes'])/text()[3]")
	private WebElement HDD_WISHLIST;

	@FindBy(xpath = "(//div[@class='attributes'])/text()[4]")
	private WebElement OS_WISHLIST;

	@FindBy(xpath = "(//div[@class='attributes'])/text()[5]")
	private WebElement SOFTWARE_CHECKBOX_WISHLIST;

	@FindBy(xpath = "//span[@class='product-unit-price']")
	private WebElement PRODUCT_PRICE_WISHLIST;

	// ========================ADD TO CART GET METHOD========================
//	public WebElement validateProduct() {
//		return PRODUCT;
//	}

	public void clickOnProduct() {
		TestUtils.Custom_is_Displayed(PRODUCT, "click on product");
		TestUtils.Custom_Click(PRODUCT, "clickOnProduct");
	}

//	public void selectProcessor() {
//		TestUtils.Custom_Handle_Dropdown_By_Index(PROCESSOR_O1, 0);
//	}

	public void selectRAM() {
		TestUtils.Custom_Handle_Dropdown(RAM, "2 GB");
	}

	public void selectHDD() {
		TestUtils.Custom_Click(HDD, "selectHDD");
	}

	public void selectOS() {
		TestUtils.Custom_Click(OS, "selectOS");
	}

	public void selectSoftware() {
		TestUtils.Custom_Click(SOFTWARE_CKECKBOX, "selectSoftware ");
	}

	public void clickOnAddCart() {
		TestUtils.Custom_Click(ADD_CART_BUTTON, "clickOnAddCart");
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
		TestUtils.Custon_Handle_Dropdown2(SHOPPING_CART);
	}

	public void clickOnGoToCart() {
		TestUtils.Custon_Action_Click(GO_TO_CART);
	}

	public void clickOnTermCondition() {
		TestUtils.Custom_Click(TERM_CONDITION, "TermCondition");
	}

	public void clickOnCheckout() {
		TestUtils.Custom_Click(CHECKOUT_BUTTON, "Checkout");
	}

}