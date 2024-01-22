package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
		ts.Custom_Click(REGISTER);
	}

	public void selectGender() {
		ts.Custom_Click(GENDER);
	}

	public void sendFirstName(String firstname) {
		ts.Custom_SendKeys(FIRST_NAME, firstname);
	}

	public void sendLastName(String lastname) {
		ts.Custom_SendKeys(LAST_NAME, lastname);
	}

	public void selectDay(String day) {
		ts.Custom_Handle_Dropdown(DOB_DAY, day);
	}

	public void selectMonth(String month) {
		ts.Custom_Handle_Dropdown(DOB_MONTH, month);
	}

	public void selectYear(String year) {
		ts.Custom_Handle_Dropdown(DOB_YEAR, year);
	}

	public void sendEmail(String email) {
		ts.Custom_SendKeys(EMAIL, email);
	}

	public void sendCompanyName(String company) {
		ts.Custom_SendKeys(COMPANY_NAME, company);
	}

	public void sendPassword(String pwd) {
		ts.Custom_SendKeys(PASSWORD, pwd);
	}

	public void sendConfirmPassword(String confirmpwd) {
		ts.Custom_SendKeys(CONFIRM_PASSWORD, confirmpwd);
	}

	public void ClickRegisterButton() {
		ts.Custom_Click(REGISTER_BUTTON);
	}

	public String Custom_Random_String() {
		String rdmstring = RandomString.make(8);
		return rdmstring;
	}

}
