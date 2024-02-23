package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class uploadPdfExample {
	public static WebDriver driver;

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement uploadFile = driver.findElement(By.xpath("//input[@name='upfile']"));
		try {
			uploadFile.sendKeys("C:\\Users\\krush\\Downloads\\SOFTWARE TESTING.docx");
			System.out.println("file is uploaded");

		} catch (Exception e) {
			throw e;
		}
	}
}
