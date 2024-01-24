package com.Test;

import org.testng.annotations.Test;

import com.utility.BaseClass;
import com.utility.DataProviderss;
import com.utility.TestUtils;

public class LoginTest extends BaseClass {

	@Test(enabled = false)
	public void userLogin() {
		System.out.println("************  test started************************");
		TestUtils.Custom_ThreadSleep(2000);
		loginPage.clickOnLoginModule();
		TestUtils.Custom_ThreadSleep(2000);
		loginPage.sendEmail(Username);
		loginPage.sendPassword(Password);
		loginPage.clickOnLoginCTA();
	}

	@Test(dataProvider = "userCredentials", dataProviderClass = DataProviderss.class)
	public void userLogin2(String Uname, String Passwd) {
		TestUtils.Custom_ThreadSleep(2000);
		loginPage.clickOnLoginModule();
		TestUtils.Custom_ThreadSleep(2000);
		loginPage.sendEmail(Uname);
		loginPage.sendPassword(Passwd);
		loginPage.clickOnLoginCTA();

	}
}
