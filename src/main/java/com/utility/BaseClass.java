package com.utility;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass extends ConfigDataProvider {
	// static final Logger log = Logger.getLogger(BaseClass.class);

	@BeforeTest
	public void setup() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		// options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(BaseUrl);
	}

	@AfterTest
	public void tearDown() {
		driver.close();
//		driver.quit();
	}

	@BeforeSuite
	public void BeforeSuite() {
		ExtentReport.getReports();
	}

	@AfterSuite
	public void AfterSuite() {
		ExtentReport.endReport();
	}

//	@Parameters("browser")
//	@BeforeTest
//	public void setup(String browserName) throws InterruptedException {
//		System.out.println("************ @BeforeTest************************");
//
//		if (browserName.equals("Chrome")) {
//			ChromeOptions options = new ChromeOptions();
////			options.addArguments("--disable-notifications");
////			options.addArguments("--headless");
//			driver = new ChromeDriver(options);
//			// PropertyConfigurator.configure("log4j2.properties");
//		} else if (browserName.equals("Firefox")) {
//			FirefoxOptions options = new FirefoxOptions();
////			options.addArguments("--disable-notifications");
////			options.addArguments("--headless");
//			driver = new FirefoxDriver(options);
//		}
//
//		else if (browserName.equals("InternetExplorer")) {
//			InternetExplorerOptions options = new InternetExplorerOptions();
////		options.addArguments("--disable-notifications");
////		options.addArguments("--headless");
//			driver = new InternetExplorerDriver(options);
//		}
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get(BaseUrl);
//
//	}

}
