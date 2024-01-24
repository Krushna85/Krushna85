package com.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.utility.BaseClass;
import com.utility.DataProviderss;
import com.utility.TestUtils;

public class UserRegistrarionTest extends BaseClass {

	@Test(enabled = false)
	public void RegisterNewUser() throws IOException {
		TestUtils.Custom_ThreadSleep(2000);
		userRegistration.clickRegisterModule();
		userRegistration.selectGender();
		userRegistration.sendFirstName("krushna");
		userRegistration.sendLastName("sohani");
		userRegistration.selectDay("1");
		userRegistration.selectMonth("March");
		userRegistration.selectYear("2001");
		userRegistration.sendEmail(userRegistration.Custom_Random_String() + "55@gmail.com");
		userRegistration.sendCompanyName("NRB");
		userRegistration.sendPassword("Times2@123");
		userRegistration.sendConfirmPassword("Times2@123");
		// userRegistration.ClickRegisterButton();
		// TestUtils.Custom_Screenshot();
	}

	@Test(dataProvider = "userRegistrationData", dataProviderClass = DataProviderss.class)
	public void userLoginUsingExcelData(String firstName, String lastName, String day, String month, String year,
			String companyName, String pwd, String confirmPwd) {
		TestUtils.Custom_ThreadSleep(1000);
		userRegistration.clickRegisterModule();
		userRegistration.selectGender();
		userRegistration.sendFirstName(firstName);
		userRegistration.sendLastName(lastName);
		userRegistration.selectDay(day);
		userRegistration.selectMonth(month);
		userRegistration.selectYear(year);
		userRegistration.sendEmail(userRegistration.Custom_Random_String() + "55@gmail.com");
		userRegistration.sendCompanyName(companyName);
		userRegistration.sendPassword(pwd);
		userRegistration.sendConfirmPassword(confirmPwd);
		userRegistration.ClickRegisterButton();

	}

}
