package com.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.utility.BaseClass;

public class UserRegistrarionTest extends BaseClass {

	@Test
	public void RegisterNewUser() throws IOException {
		ts.Custom_ThreadSleep(2000);
		ur.clickRegisterModule();
		ur.selectGender();
		ur.sendFirstName("krushna");
		ur.sendLastName("sohani");
		ur.selectDay("1");
		ur.selectMonth("March");
		ur.selectYear("2001");
		ur.sendEmail(ur.Custom_Random_String() + "55@gmail.com");
		ur.sendCompanyName("NRB");
		ur.sendPassword("Times2@123");
		ur.sendConfirmPassword("Times2@123");
		// ur.ClickRegisterButton();
		ts.Custom_Screenshot();

	}

}
