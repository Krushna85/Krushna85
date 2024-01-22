package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.utility.RandomString;

public class TestUtils extends BaseClass {

	public String randomstring() {
		RandomString.make(4);
		return randomstring();
	}

	public static void Custom_SendKeys(WebElement element, String value, String fieldName) {
		try {
			element.clear();
			element.sendKeys(value);
			// test.log(Status.PASS, fieldName+"==Value Succesfully Send " + value);
			// test.log(Status.PASS, fieldName);
			log.info("Value Succesfully Sent " + fieldName);
		} catch (Exception e) {
			// test.log(Status.FAIL, e.getMessage() + "" + fieldName);
			log.error("Unable to send value " + fieldName);
		}
	}

	public static void Custom_Click(WebElement element, String fieldName) {
		try {
			// waitForVisibilityOfElement(element);
			element.click();
			log.info("Click Succesfully " + "" + fieldName);

		} catch (Exception e) {
//				
			// element.click();
			log.error("Unable to click " + fieldName);

		}
	}

	public static void Custom_Handle_Dropdown(WebElement element, String text) {
		try {
			Select s = new Select(element);
			s.selectByVisibleText(text);
//				s.selectByValue(value);
			// s.selectByIndex(index);

		} catch (Exception e) {

		}
	}

	public static void Custom_Clear(WebElement element) {
		try {

			// test.log(Status.PASS, fieldName+"clear the textvalue"+fieldName);
//				test.log(Status.PASS, LogMessege);
//				logger.info(LogMessege);

		} catch (Exception e) {
//				test.log(Status.FAIL, e.getMessage() + "unable to clear the field" + LogMessege);
//				logger.info(LogMessege);
		}
	}

	public static void Custom_Refresh() {
		driver.navigate().refresh();
		// logger.info("trying to refresh the page");
	}

	public static void Custom_Forward() {
		driver.navigate().forward();
		// logger.info("trying to refresh the page");
	}

	public static void Custom_Back() {
		driver.navigate().back();
		// logger.info("trying to back the page");
	}

	public static void Custom_ThreadSleep(int wait) {
		try {
			Thread.sleep(wait);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static WebElement waitForVisibilityOfElement(WebElement element) {
		TestUtils.Custom_ThreadSleep(000);
		// logger.info("Waiting for element to be visible ");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;

	}

	public static WebElement waitForElementToBeClickable(WebElement element) {
		// logger.info("Waiting for element to be clickable ");
		TestUtils.waitForVisibilityOfElement(element);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}

	public static void Custom_Wait_Till_Alert_Is_Present() {
		// logger.info("waiting for the alert to be present");
		TestUtils.Custom_ThreadSleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
	}

//		public static void CUstom_Is_Alert_Present() {
//			TestUtils.ThreadSleep(3000);
	//
//		}

	public static void Custom_Aceept() {
		// logger.info("Accepting to the alert popup");
		driver.switchTo().alert().accept();
	}

	public static void Custom_Dismiss() {
		// logger.info("Dismissing to the alert popup");
		driver.switchTo().alert().dismiss();
	}

	public static void Custom_Gettext() {
		// logger.info("getting text of alert popup ");
		driver.switchTo().alert().getText();
	}

	public static void Custom_DefaultContent() {
		// logger.info("switched to parent page");
		driver.switchTo().defaultContent();
	}
//		

//		

	public String Custom_Random_String(String Alphabetic) {
		String rdmstring = RandomString.make(8);
		return rdmstring;
	}

	public String Custom_Random_String2(String Alphanumeric) {
		String rdmstring2 = RandomString.make(8);
		return rdmstring2;
	}

	public static void Custom_Add() {
		if (driver.getCurrentUrl().equals("https://demo.guru99.com/v4/manager/Managerhomepage.php#google_vignette")) {
			TestUtils.Custom_Back();
			TestUtils.Custom_ThreadSleep(1000);
		}
	}

	public boolean isAlertPresent() {
		try {
			TestUtils.Custom_Aceept();
			TestUtils.Custom_DefaultContent();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	public static String getConfigData(String key) {
		Properties pro = null;
		String path = System.getProperty("user.dir") + "/src/main/resources/config.properties";
		File src = new File(path);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String data = pro.getProperty(key);
		return data;
	}

	public static void Custom_Screenshot(String filename) throws IOException {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		String dateName = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
		// String rs = RandomString.make(4);
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String pathofss = System.getProperty("user.dir") + "/Screenshots/" + filename + "_" + dateName + ".jpg";
		File destFile = new File(pathofss);
		FileHandler.copy(sourceFile, destFile);
		// logger.info("screenshot saved successfully");

	}

	public static void Custon_Handle_Dropdown2(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();

	}

	public static void Custon_Action_Click(WebElement element) {
		Actions act = new Actions(driver);
		act.click(element).perform();

	}
//		public static String getDataFromPropertyFile(String key) throws
//		IOException 
//		 { 
//		 FileInputStream file = new
//		FileInputStream("H:\\Java\\Selenium\\PropertyFile\\PropertyFile.proper
//		ties"); 
//		 
//		 Properties p = new Properties(); 
//		 p.load(file); 
//		 
//		 String value = p.getProperty(key); 
//		 return value; 
//		 }

	public static void Custom_is_Displayed(WebElement element, String value) {
		driver.findElement(By.xpath(value)).isDisplayed();
	}

	public static void Custom_is_Enabled(WebElement element, String value) {
		driver.findElement(By.xpath(value)).isEnabled();
	}

	public static void Custom_is_selected(WebElement element, String value) {
		driver.findElement(By.xpath(value)).isSelected();
	}

}
