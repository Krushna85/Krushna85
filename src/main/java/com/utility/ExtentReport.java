package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	public static ExtentReports extent;
	public static ExtentTest test;

	public static ExtentReports getReports() {

		String path = System.getProperty("user.dir") + "\\test-output\\AutomationReport\\ExtentReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("Times Etmoney");
		reporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.setSystemInfo("Project Name", "Times Etmoney");
		extent.setSystemInfo("Host Name", "Local Host");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User Name", "Krushna");
		return extent;

	}

	public static void endReport() {
		extent.flush();
	}
}
