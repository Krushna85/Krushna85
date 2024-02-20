package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utility.BaseClass;
import com.utility.DataProviderss;
import com.utility.TestUtils;

public class LoginTest extends BaseClass {

	@Test(priority = 1)
	public void userLoginWithValidCredentials() {
		System.out.println("************  test started************************");

		TestUtils.Custom_ThreadSleep(2000);
		loginPage.clickOnLoginModule();
		TestUtils.Custom_ThreadSleep(2000);
		loginPage.sendEmail(Username);
		loginPage.sendPassword(Password);
		loginPage.clickOnLoginCTA();
		if (driver.getPageSource().contains("Welcome to our store")) {
			Assert.assertTrue(true, "user rediredt to home page");
			log.info("user successfully logged in");
		} else {
			Assert.assertTrue(false, "user have not log in");
		}
	}

	@Test(priority = 2)
	public void userLoginWithInvalidCredentials() {
		System.out.println("************  test started************************");

		TestUtils.Custom_ThreadSleep(2000);
		// loginPage.clickOnLoginModule();
		TestUtils.Custom_ThreadSleep(2000);
		loginPage.sendEmail("eAZL5@gmail.com");
		loginPage.sendPassword("Dhanraj1234");
		loginPage.clickOnLoginCTA();

		WebElement expResult = driver.findElement(By.xpath("//div[contains(text(),'Login was unsuccessful.')]"));
		String actResult = "Login was unsuccessful. Please correct the errors and try again";
		// Assert.assertEquals(actResult, expResult);
		if (expResult.getText().equals(actResult)) {
			Assert.assertTrue(true);
			log.info("Login Test Passed");

		} else {
			Assert.assertTrue(false);
			log.info("Login Test Failed");

		}

	}

	@Test(dataProvider = "userCredentials", dataProviderClass = DataProviderss.class)
	public void userLogin3(String Uname, String Passwd) {
		TestUtils.Custom_ThreadSleep(2000);
		// loginPage.clickOnLoginModule();
		TestUtils.Custom_ThreadSleep(2000);
		loginPage.sendEmail(Uname);
		loginPage.sendPassword(Passwd);
		loginPage.clickOnLoginCTA();

	}
}
