package com.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.utility.BaseClass;
import com.utility.DataProviderss;
import com.utility.TestUtils;

@Test
public class UserRegistrarionTest extends BaseClass {

	@Test
	public void RegisterNewUser() throws IOException {
		TestUtils.Custom_ThreadSleep(2000);
		userRegistration.clickRegisterModule();
		userRegistration.selectGender();
		userRegistration.sendFirstName(userRegistration.Custom_Random_String() + "abc");
		userRegistration.sendLastName(userRegistration.Custom_Random_String() + "xyz");
		userRegistration.selectDay("1");
		userRegistration.selectMonth("August");
		userRegistration.selectYear("1998");
		userRegistration.sendEmail(userRegistration.Custom_Random_String() + ".12@gmail.com");
		userRegistration.sendCompanyName("NRB");
		userRegistration.sendPassword("Times@123");
		userRegistration.sendConfirmPassword("Times@123");
//		userRegistration.ClickRegisterButton();
//		if (driver.getPageSource().contains("Your registration completed")) {
//			Assert.assertTrue(true);
//			log.info("user registered successfully");
//		} else {
//			Assert.assertTrue(false, "user not registered");
//		}
//		// TestUtils.Custom_Screenshot();
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
		// userRegistration.ClickRegisterButton();

	}

}
