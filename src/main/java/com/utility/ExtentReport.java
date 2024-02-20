package com.utility;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	public static ExtentSparkReporter sparkReporter_all;
	public static String path;

	public static void intitializeExtentReport() {
		String path = System.getProperty("user.dir") + "\\test-output\\AutomationReport\\ExtentReport.html";
		ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter(path);
		sparkReporter_all.config().setDocumentTitle("Automation Report");
		sparkReporter_all.config().setReportName("Times Etmoney");
		sparkReporter_all.config().setTheme(Theme.DARK);
		extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReporter_all);
		extentReports.setSystemInfo("Project Name", "Times Etmoney");
		extentReports.setSystemInfo("Host Name", "Local Host");
		extentReports.setSystemInfo("Environment", "QA");
		extentReports.setSystemInfo("User Name", "Krushna");
		extentReports.createTest("test 1");
		extentReports.createTest("test 2");
		extentReports.createTest("test 3");
		extentReports.createTest("test 4");
		// extentTest = extentReports.createTest(context.getName());

	}

	public static void endReport() throws IOException {
		extentReports.flush();
		Desktop.getDesktop().browse(new File(path).toURI());
	}
}
