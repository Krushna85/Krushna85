package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utility.TestUtils;

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

	@FindBy(xpath = "//a[text()='HTC One M8 Android L 5.0 Lollipop']")
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
		TestUtils.Custom_SendKeys(SEARCH_BAR, searchvalue, "enterSearchValue");
	}

	public void clickOnSearch() {
		TestUtils.Custom_Click(SEARCH_BUTTON, "clickOnSearch");
	}

	public void selectPosition(String productposition) {
		TestUtils.Custom_Handle_Dropdown(POSITION, productposition);
	}

	public void selectDisplaySize(String displaysize) {
		TestUtils.Custom_Handle_Dropdown(DISPLAY_SIZE, displaysize);
	}

	public void clickOnLollipop() {
		TestUtils.Custom_Click(LOLLIPOP, "clickOnLollipop");
	}

	public void enterQuantity(String quantity) {
		TestUtils.Custom_SendKeys(QUANTITY, quantity, "enterQuantity");
	}

	public void clickOnAddToWishlist() {
		TestUtils.Custom_Click(ADD_TO_WISHLIST, "clickOnAddToWishlist");
	}

	public void clickOnWishlistModule() {
		TestUtils.Custom_Click(WISHLIST_MODULE, "clickOnWishlistModule");
	}

}