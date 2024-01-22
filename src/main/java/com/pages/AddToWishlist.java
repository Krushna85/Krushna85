package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToWishlist extends BasePage {

	public AddToWishlist() {
		super();
	}

	@FindBy(id = "small-searchterms")
	private WebElement SEARCH_BAR;

	@FindBy(xpath = "//button[text()='Search']")
	private WebElement SEARCH_BUTTON;

	@FindBy(id = "products-orderby")
	private WebElement POSITION;

	@FindBy(id = "products-pagesize")
	private WebElement DISPLAY_SIZE;

	@FindBy(xpath = "(//a[text()='HTC One M8 Android L 5.0 Lollipop'])[2]")
	private WebElement LOLLIPOP;

	@FindBy(id = "product_enteredQuantity_18")
	private WebElement QUANTITY;

	@FindBy(id = "add-to-wishlist-button-18")
	private WebElement ADD_TO_WISHLIST;

	@FindBy(xpath = "(//a[text()='HTC One M8 Android L 5.0 Lollipop'])[2]")
	private WebElement LOLIPOP_EXPECTED;

	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement WISHLIST_MODULE;

	public void enterSearchValue(String searchvalue) {
		ts.Custom_SendKeys(SEARCH_BAR, searchvalue);
	}

	public void clickOnSearch() {
		ts.Custom_Click(SEARCH_BUTTON);
	}

	public void selectPosition(String productposition) {
		ts.Custom_Handle_Dropdown(POSITION, productposition);
	}

	public void selectDisplaySize(String displaysize) {
		ts.Custom_Handle_Dropdown(DISPLAY_SIZE, displaysize);
	}

	public void clickOnLollipop() {
		ts.Custom_Click(LOLLIPOP);
	}

	public void enterQuantity(String quantity) {
		ts.Custom_SendKeys(QUANTITY, quantity);
	}

	public void clickOnAddToWishlist() {
		ts.Custom_Click(ADD_TO_WISHLIST);
	}

	public void clickOnWishlistModule() {
		ts.Custom_Click(WISHLIST_MODULE);
	}

}