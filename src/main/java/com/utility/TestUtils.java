package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
	static Log log = new Log();

	public static String randomstring() {
		RandomString.make(4);
		return randomstring() + ".12@gmail.com";
	}

	public static void performScrollTillElement(WebElement element) {
		Log.info("Scrolling Till " + element + " Element is visible");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
	}

	public static void Custom_SendKeys(WebElement element, String value, String fieldName) {
		try {
			waitForVisibilityOfElement(element);
			element.clear();
			element.sendKeys(value);
			log.info("successfully sent the value " + value + " in the " + fieldName);
		} catch (Exception e) {
			// test.log(Status.PASS, fieldName+"==Value Succesfully Send " + value);
			// test.log(Status.PASS, fieldName);
			element.sendKeys(value);
			log.info("unable to send the value " + value + " in the " + fieldName);

		}
	}

	public static void Custom_Click(WebElement element, String fieldName) {
		try {
			waitForVisibilityOfElement(element);
			element.click();
			log.info("clicked on " + fieldName);
		} catch (Exception e) {
			element.click();
			log.error("unable to click on " + fieldName);
			element.click();

		}
	}

	public static void Custom_Handle_Dropdown(WebElement element, String text) {
		try {
			Select s = new Select(element);
			s.selectByVisibleText(text);
			log.info("the value " + text + " selected from the dropdown");
//			s.selectByValue(value);
//			s.selectByIndex(index);

		} catch (Exception e) {
			log.info("unable to select the value " + text + " from dropdown");

		}
	}

	public static void Custom_Handle_Dropdown_By_Value(WebElement element, String value) {
		try {
			Select s = new Select(element);
			s.selectByValue(value);
			log.info("the value " + value + " selected from the dropdown");

		} catch (Exception e) {
			log.info("unable to select the value from dropdown ");

		}
	}

	public static void Custom_Handle_Dropdown_By_Index(WebElement element, int index) {
		try {
			Select s = new Select(element);
			s.selectByIndex(index);
			log.info("the value " + index + " selected from the dropdown");
//			

		} catch (Exception e) {
			log.info("unable to select the Dropdown value");

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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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

	public static void Custom_Alert_Gettext() {
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
		try {
			Actions act = new Actions(driver);
			act.moveToElement(element).perform();
			log.info("moved on element");
		} catch (Exception e) {
			log.info("unable to move on element");
		}
	}

	public static void Custon_Action_Click(WebElement element) {
		try {
			Actions act = new Actions(driver);
			act.click(element).perform();
			log.info("clicked on movable element");
		} catch (Exception e) {
			log.info("unable to click on movable element");
		}
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

	public static void Custom_is_Displayed(WebElement element, String fieldName) {

		try {
			element.isDisplayed();
			// driver.findElement(By.xpath(element)).isDisplayed();
			log.info("element is displaying " + fieldName);
			// return true;
		} catch (Exception e) {
			log.info("element is not displaying " + fieldName);
			// return false;
		}

	}

	public static void Custom_is_Enabled(WebElement element, String value) {
		driver.findElement(By.xpath(value)).isEnabled();
	}

	public static void Custom_is_selected(WebElement element, String value) {
		driver.findElement(By.xpath(value)).isSelected();
	}

	public static int countWebElements(String tOTAL_PRODUCT_COUNT) {
		List<WebElement> listOfElements = driver.findElements(By.xpath(tOTAL_PRODUCT_COUNT));
		return listOfElements.size();
	}

	public static void getText(WebElement element) {

		System.out.println(element.getText());

	}

	public static void scrollTillElementIsVisible(WebElement element) {
		Log.debug("Scrolling till element is visible");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView();", element);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

//	public static void scrollByPixels(int pixels) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, arguments[0]);", pixels);
//	}

	public static void scrollByPixelSize(int PixelSize) {
		Log.info("Scrolling by pixel size");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + PixelSize + ")", "");
	}

}
