package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utility.TestUtils;

import net.bytebuddy.utility.RandomString;

public class UserRegistration extends BasePage {

	public UserRegistration() {
		super();
	}

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement REGISTER;

	@FindBy(id = "gender-female")
	private WebElement GENDER;

	@FindBy(id = "FirstName")
	private WebElement FIRST_NAME;

	@FindBy(id = "LastName")
	private WebElement LAST_NAME;

	@FindBy(name = "DateOfBirthDay")
	private WebElement DOB_DAY;

	@FindBy(name = "DateOfBirthMonth")
	private WebElement DOB_MONTH;

	@FindBy(name = "DateOfBirthYear")
	private WebElement DOB_YEAR;

	@FindBy(name = "Email")
	private WebElement EMAIL;

	@FindBy(id = "Company")
	private WebElement COMPANY_NAME;

	@FindBy(id = "Password")
	private WebElement PASSWORD;

	@FindBy(id = "ConfirmPassword")
	private WebElement CONFIRM_PASSWORD;

	@FindBy(id = "register-button")
	private WebElement REGISTER_BUTTON;

	@FindBy(xpath = "//div[text()='Your registration completed']")
	private WebElement REGISTER_SUCCESS;

	public void clickRegisterModule() {
		TestUtils.Custom_Click(REGISTER);
	}

	public void selectGender() {
		TestUtils.Custom_Click(GENDER);
	}

	public void sendFirstName(String firstName) {
		TestUtils.Custom_SendKeys(FIRST_NAME, firstName);
	}

	public void sendLastName(String lastName) {
		TestUtils.Custom_SendKeys(LAST_NAME, lastName);
	}

	public void selectDay(String day) {
		TestUtils.Custom_Handle_Dropdown(DOB_DAY, day);
	}

	public void selectMonth(String month) {
		TestUtils.Custom_Handle_Dropdown(DOB_MONTH, month);
	}

	public void selectYear(String year) {
		TestUtils.Custom_Handle_Dropdown(DOB_YEAR, year);
	}

	public void sendEmail(String email) {
		TestUtils.Custom_SendKeys(EMAIL, email);
	}

	public void sendCompanyName(String companyName) {
		TestUtils.Custom_SendKeys(COMPANY_NAME, companyName);
	}

	public void sendPassword(String pwd) {
		TestUtils.Custom_SendKeys(PASSWORD, pwd);
	}

	public void sendConfirmPassword(String confirmPwd) {
		TestUtils.Custom_SendKeys(CONFIRM_PASSWORD, confirmPwd);
	}

	public void ClickRegisterButton() {
		TestUtils.Custom_Click(REGISTER_BUTTON);
	}

	public String Custom_Random_String() {
		String rdmstring = RandomString.make(8);
		return rdmstring;
	}

}
