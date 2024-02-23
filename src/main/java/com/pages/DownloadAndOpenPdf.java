package com.pages;

import java.awt.AWTException;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadAndOpenPdf {
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("disable-infobars");
		options.addArguments("--disable-extensions");
		options.addArguments("--auto-open-devtools-for-tabs");
		options.addArguments("download.default_directory=C:\\Users\\krush\\Downloads");

		driver = new ChromeDriver(options);
		driver.get("http://zhimin.com/books/pwta");
		driver.findElement(By.xpath("//a[text()='Download']")).click();
		Thread.sleep(120000);
		File pdfFile = new File("/path/to/download/directory/dummy.pdf");

		// Open the downloaded PDF file using Desktop class
		if (pdfFile.exists()) {
			Desktop.getDesktop().open(pdfFile);
		} else {
			System.out.println("PDF file not found at the specified location.");
		}
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_J);
//		robot.keyRelease(KeyEvent.VK_J);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//
//		Thread.sleep(120000); // Wait for the Downloads tab to open
//
//		// Press Enter to open the downloaded file
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//
//		Thread.sleep(5000);
	}
}
