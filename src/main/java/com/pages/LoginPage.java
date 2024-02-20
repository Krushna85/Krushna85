
package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utility.TestUtils;

public class LoginPage extends BasePage {

	public LoginPage() {
		super();
	}

	@FindBy(className = "ico-login")
	private WebElement LOGIN_MODULE;

	@FindBy(id = "Email")
	private WebElement EMAIL;

	@FindBy(id = "Password")
	private WebElement PASSWORD;

	@FindBy(xpath = "//button[@class='button-1 login-button']")
	private WebElement LOGIN_CTA;

	@FindBy(xpath = "//span[@class='forgot-password']")
	private WebElement FORGET_PASSWORD;

	@FindBy(id = "Email")
	private WebElement FORGET_EMAIL;

	@FindBy(name = "send-email")
	private WebElement MAIL_RECOVER_BUTTON;

	@FindBy(xpath = "//div[contains(text(),'Login was unsuccessful.')]")
	private WebElement ERROR_MSG;

	public void clickOnLoginModule() {
		TestUtils.Custom_Click(LOGIN_MODULE, "clickOnLoginModule");
	}

	public void sendEmail(String Uname) {
		TestUtils.waitForVisibilityOfElement(EMAIL);
		TestUtils.Custom_SendKeys(EMAIL, Uname, "sendEmail");
	}

	public void sendPassword(String Passwd) {
		TestUtils.Custom_SendKeys(PASSWORD, Passwd, "sendPassword");
	}

	public void clickOnLoginCTA() {
		TestUtils.Custom_Click(LOGIN_CTA, "clickOnLoginCTA");
	}

	public boolean validateErrorMsg() {
		TestUtils.Custom_is_Displayed(ERROR_MSG, "error msg");
		return true;
	}
}
