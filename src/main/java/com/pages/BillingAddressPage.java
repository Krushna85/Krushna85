package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utility.TestUtils;

public class BillingAddressPage extends BasePage {
	public BillingAddressPage() {
		super();
	}

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

	public void selectCountry(String country) {
		TestUtils.Custom_ThreadSleep(2000);
		TestUtils.Custom_Handle_Dropdown(COUNTRY, country);
	}

	public void selectState(String state) {
		TestUtils.Custom_Handle_Dropdown_By_Value(STATE, state);
	}

	public void sendCity(String city) {
		TestUtils.Custom_SendKeys(CITY, city, "sendCity");
	}

	public void sendAddress1(String address1) {
		TestUtils.Custom_SendKeys(ADDRESS1, address1, "sendAddress1");
	}

	public void sendPostalCode(String postalcode) {
		TestUtils.Custom_SendKeys(POSTAL_CODE, postalcode, "sendPostalCode");
	}

	public void sendPhoneNo(String phoneno) {
		TestUtils.Custom_SendKeys(PHONE_NO, phoneno, "sendPhoneNo");
	}

	public void clickOnContinue() {
		TestUtils.Custom_Click(CONTINUE_BUTTON, "Continue");
	}

}
