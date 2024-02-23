package com.utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass extends ConfigDataProvider {
	public static Log log = new Log();
	public static String path;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	public static String pathofss;

	@BeforeClass
	public void setup() throws InterruptedException {
		// extentReport = new ExtentReport();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		// options.addArguments("--headless");
		options.addArguments("--incognito");
		// options.addArguments("disable-infobars");
		// options.addArguments("--disable-extensions");
		// options.addArguments("--auto-open-devtools-for-tabs");
		// options.addArguments("download.default_directory=/path/to/download/directory");

		driver = new ChromeDriver(options);
		log.info("Browser is launching");
		// Dimension size = new Dimension(1000, 1000); // Width, Height
		// driver.manage().window().setSize(size);
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(BaseUrl);
		// extentTest = extentReports.createTest(context.getName());
	}

//	@AfterTest
//	public void tearDown() {
//		// log.info("closing the browser");
//		// driver.close();
////		driver.quit();
//	}

	@BeforeSuite
	public void BeforeSuite() {
		String path = System.getProperty("user.dir") + "\\test-output\\AutomationReport\\ExtentReport.html";
		ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter(path);
		log.info("initializing the report");
		extentReport.intitializeExtentReport();
	}

//	@Parameters("browser")
//	@BeforeTest
//	public void setup(String browser, ITestContext context) throws InterruptedException {
//		System.out.println("************ @BeforeTest************************");
//
//		if (browser.equals("Chrome")) {
//			ChromeOptions options = new ChromeOptions();
////			options.addArguments("--disable-notifications");
////			options.addArguments("--headless");
//			driver = new ChromeDriver(options);
//			// PropertyConfigurator.configure("log4j2.properties");
//		} else if (browser.equals("Firefox")) {
//			FirefoxOptions options = new FirefoxOptions();
////			options.addArguments("--disable-notifications");
////			options.addArguments("--headless");
//			driver = new FirefoxDriver(options);
//		}
//
//		else if (browser.equals("InternetExplorer")) {
//			InternetExplorerOptions options = new InternetExplorerOptions();
////		options.addArguments("--disable-notifications");
////		options.addArguments("--headless");
//			driver = new InternetExplorerDriver(options);
//		}
//
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get(BaseUrl);
//		extentReports.createTest(context.getName());
//	}

	@AfterMethod
	public void checkStatus(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			log.info(result.getName() + " Test case is failed screenshot has captured ");

			TestUtils.Custom_Screenshot(result.getName());
			// extentTest.info("Test case Failed here is screenshot ");
			// extentTest.addScreenCaptureFromPath(pathofss);
			// extentTest.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			log.info(" Test case is passed ");
			// extentTest.log(Status.PASS, " Test case is passed " + m.getName());
		}
	}

	@AfterClass
	public void tearDown() {
		log.info("closing the browser");
		// driver.close();
//		driver.quit();
	}

//	@AfterSuite
//	public void AfterSuite() throws Exception {
//		log.info("generating the report");
//		ExtentReport.endReport();
//		Desktop.getDesktop().browse(new File(path).toURI());
//	}

}
