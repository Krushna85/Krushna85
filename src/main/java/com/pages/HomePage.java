package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utility.TestUtils;

public class HomePage extends BasePage {

	public HomePage() {
		super();
	}

	// **************************HOME PAGE
	// ELEMENT***********************************

	@FindBy(id = "small-searchterms")
	private WebElement SEARCH_BAR;

	@FindBy(xpath = "//button[text()='Search']")
	private WebElement SEARCH_BUTTON;

	@FindBy(xpath = "(//a[text()='Build your own computer'])")
	private WebElement COMPUTER;

	@FindBy(xpath = "//div[@class='no-result']")
	private WebElement No_Product_Error_Msg;

	@FindBy(xpath = "//div[@class='picture']")
	private WebElement TOTAL_PRODUCT_IMG;

	@FindBy(xpath = "(//img)[1]")
	private WebElement PRODUCT_LOGO_IMG;

	@FindBy(xpath = "(//img)[2]")
	private WebElement HTC_LOLIPOP_IMG;

	@FindBy(xpath = "//a[contains(text(),'HTC One M8 Android')]")
	private WebElement HTC_LOLIPOP_NAME;

	@FindBy(xpath = "(//div[@class='prices'])[1]")
	private WebElement HTC_LOLIPOP_PRICE;

	@FindBy(xpath = "(//img)[3]")
	private WebElement HTC_MINIBLUE_IMG;

	@FindBy(xpath = "//a[contains(text(),'HTC One Mini')]")
	private WebElement HTC_MINIBLUE_NAME;

	@FindBy(xpath = "(//div[@class='prices'])[2]")
	private WebElement HTC_MINIBLUE_PRICE;

	@FindBy(xpath = "(//img)[4]")
	private WebElement NOKIA_LUMIA_IMG;

	@FindBy(xpath = "//a[contains(text(),'Nokia Lumia 1020 ')]")
	private WebElement NOKIA_LUMIA_NAME;

	@FindBy(xpath = "(//div[@class='prices'])[3]")
	private WebElement NOKIA_LUMIA_PRICE;

	@FindBy(xpath = "//div[@class='product-grid']")
	private WebElement TOTAL_PRODUCT_COUNT;

	public void sendValueInSearchBar() {

		TestUtils.Custom_SendKeys(SEARCH_BAR, "phone", "sendValueInSearchBar");
	}

	public void clickOnSearch() {
		TestUtils.Custom_Click(SEARCH_BUTTON, "clickOnSearch");
	}

	public void verifyProductLogoDisplayed() {
		TestUtils.Custom_is_Displayed(PRODUCT_LOGO_IMG, "ProductLogo");

	}

	public void verifyHTClolipopDisplayed() {
		TestUtils.Custom_is_Displayed(HTC_LOLIPOP_IMG, "HTClolipop");
	}

	public void verifyHTClolipopNameDisplayed() {
		TestUtils.Custom_is_Displayed(HTC_LOLIPOP_NAME, "HTClolipopName");
		TestUtils.getText(HTC_LOLIPOP_NAME);
	}

	public void clickOnHTClolipop() {
		TestUtils.Custom_Click(HTC_LOLIPOP_NAME, "clickOnHTClolipop");
	}

	public void verifyHTClolipopPriceDisplayed() {
		TestUtils.Custom_is_Displayed(HTC_LOLIPOP_PRICE, "HTClolipopPrice");
		TestUtils.getText(HTC_LOLIPOP_PRICE);
	}

	public void verifyHTCMiniblueIMGDisplayed() {
		TestUtils.Custom_is_Displayed(HTC_MINIBLUE_IMG, "HTCMiniblueIMG");
	}

	public void verifyHTCMiniblueNameDisplayed() {
		TestUtils.Custom_is_Displayed(HTC_MINIBLUE_NAME, "HTCMiniblueName");
		TestUtils.getText(HTC_MINIBLUE_NAME);

	}

	public void verifyHTCMinibluePriceDisplayed() {
		TestUtils.Custom_is_Displayed(HTC_MINIBLUE_PRICE, "HTCMinibluePrice");
		TestUtils.getText(HTC_MINIBLUE_PRICE);

	}

	public void verifyNoProductErrorMsg() {
		TestUtils.Custom_is_Displayed(No_Product_Error_Msg, "NoProductErrorMsg");
		TestUtils.getText(No_Product_Error_Msg);
	}

//	public void countAllElements() {
//		TestUtils.countWebElements(TOTAL_PRODUCT_COUNT);
//	}

	public void clickOnComputer() {
		TestUtils.Custom_ThreadSleep(3000);
		// TestUtils.scrollTillElementIsVisible(COMPUTER);
		// TestUtils.scrollByPixels(500);
		// TestUtils.performScrollTillElement(COMPUTER);
		TestUtils.scrollByPixelSize(500);
		TestUtils.Custom_Click(COMPUTER, "clickOnComputer");
	}

	public void sendProductInsearch(String searchData) {
		TestUtils.Custom_SendKeys(SEARCH_BAR, searchData, "search bar value");
		TestUtils.Custom_Click(SEARCH_BUTTON, "SEARCH_BUTTON");
	}

}
