
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

	public void clickOnLoginModule() {
		TestUtils.Custom_Click(LOGIN_MODULE);
	}

	public void sendEmail(String Uname) {
		TestUtils.Custom_SendKeys(EMAIL, Uname);
	}

	public void sendPassword(String Passwd) {
		TestUtils.Custom_SendKeys(PASSWORD, Passwd);
	}

	public void clickOnLoginCTA() {
		TestUtils.Custom_Click(LOGIN_CTA);
	}
}
