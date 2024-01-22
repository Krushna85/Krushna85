
package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage() {
		super();
	}

	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement LOGIN_MODULE;

	@FindBy(id = "Email")
	private WebElement EMAIL;

	@FindBy(id = "Password")
	private WebElement PASSWORD;

	@FindBy(className = "button-1 login-button")
	private WebElement LOGIN_CTA;

	public void clickOnLoginModule() {
		ts.Custom_Click(LOGIN_MODULE);
	}

	public void sendEmail(String email) {
		ts.Custom_SendKeys(EMAIL, email);
	}

	public void sendPassword(String pwd) {
		ts.Custom_SendKeys(PASSWORD, pwd);
	}

	public void clickOnLoginCTA() {
		ts.Custom_Click(LOGIN_CTA);
	}
}
