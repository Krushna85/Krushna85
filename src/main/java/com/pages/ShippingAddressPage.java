package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utility.TestUtils;

public class ShippingAddressPage extends BasePage {
	public ShippingAddressPage() {
		super();
	}

	@FindBy(xpath = "(//button[text()='Continue'])[3]")
	private WebElement CONTINUE;

	@FindBy(id = "shippingoption_0")
	private WebElement SHIPPING_BY_LAND_TRANSPORT;

	@FindBy(id = "paymentmethod_1")
	private WebElement CREDIT_CARD;

	@FindBy(xpath = "(//button[text()='Continue'])[4]")
	private WebElement CONTINUE2;

	@FindBy(id = "CreditCardType")
	private WebElement CREDIT_CARD_TYPE;

	@FindBy(id = "ExpireMonth")
	private WebElement MONTH;

	@FindBy(id = "ExpireYear")
	private WebElement YEAR;

	@FindBy(id = "CardholderName")
	private WebElement CARD_HOLDER_NAME;

	@FindBy(id = "CardNumber")
	private WebElement CARD_HOLDER_NUMBER;

	@FindBy(id = "CardCode")
	private WebElement CARD_CODE;

	@FindBy(xpath = "(//button[text()='Continue'])[5]")
	private WebElement CONTINUE3;

	@FindBy(xpath = "//button[text()='Confirm']")
	private WebElement CONFIRM;

	@FindBy(xpath = "//div[@class='order-number']")
	private WebElement ORDER_NO;

	public void selectShippingAddress() {
		TestUtils.Custom_Click(SHIPPING_BY_LAND_TRANSPORT, "selectShippingAddress");
	}

	public void clickOnContinue() {
		TestUtils.Custom_Click(CONTINUE, "clickOnContinue");
	}

	public void selectPaymentMethod() {
		TestUtils.Custom_Click(CREDIT_CARD, "selectPaymentMethod");
	}

	public void clickOnContinue2() {
		TestUtils.Custom_Click(CONTINUE2, "clickOnContinue2");
	}

	public void selectCreditCardType() {
		TestUtils.Custom_Click(CREDIT_CARD_TYPE, "selectCreditCardType");
	}

	public void enterCardHolderName(String cardHolderName) {
		TestUtils.Custom_SendKeys(CARD_HOLDER_NAME, cardHolderName, "sendCardHolderName");
	}

	public void enterCardNumber(String cardNumber) {
		TestUtils.Custom_SendKeys(CARD_HOLDER_NUMBER, cardNumber, "enterCardNumber");
	}

	public void enterCardCode(String cardCode) {
		TestUtils.Custom_SendKeys(CARD_CODE, cardCode, "cardCode");
	}

	public void selectMonth(String month) {
		TestUtils.Custom_Handle_Dropdown(MONTH, month);
	}

	public void selectYear(String year) {
		TestUtils.Custom_Handle_Dropdown_By_Value(YEAR, year);
	}

	public void clickOnContinue3() {
		TestUtils.Custom_Click(CONTINUE3, "clickOnContinue3");
	}

	public void clickOnConfirm() {
		TestUtils.scrollByPixelSize(800);
		TestUtils.Custom_Click(CONFIRM, "clickOnConfirm");
		TestUtils.Custom_ThreadSleep(2000);
	}

	public void getOrderNo() {
		TestUtils.getText(ORDER_NO);

	}

}
