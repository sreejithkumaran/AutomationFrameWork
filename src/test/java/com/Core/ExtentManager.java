package com.Core;

import java.io.IOException;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {
	private static ExtentReports extent;
	private static ExtentTest test;
	private static ExtentHtmlReporter htmlReporter;
	private static String filePath = "./extentreport.html";


	public static ExtentReports GetExtent(){
		if (extent != null)
			return extent; //avoid creating new instance of html file
		extent = new ExtentReports();		
		extent.attachReporter(getHtmlReporter());
		return extent;
	}

	public static void UserInfo() {
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Host Name", "Sreejith Kumaran");
		extent.setSystemInfo("Environment", "QA");
	}

	private static ExtentHtmlReporter getHtmlReporter() {
		htmlReporter = new ExtentHtmlReporter(filePath);
		return htmlReporter;
	}

	public static ExtentTest createTest(String name, String description){
		test = extent.createTest(name, description);
		return test;
	}

	public static void logPass(String desc) {
		test.log(Status.PASS, desc);
	}

	public static void logFail(ITestResult result) {
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
	}

	public static void logPass(ITestResult result) {
		test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test case PASSED:", ExtentColor.GREEN));
	}

	public static void logSkip(ITestResult result) {
		//	test.log(Status.FAIL, desc);
		test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test case SKIPPED due to below issues:", ExtentColor.BROWN));
	}

	public static void logInfo(String desc) {
		test.log(Status.INFO, desc);
	}
	public static void logFail(String desc) {
		test.log(Status.FAIL, desc);
	}

	public static void logFailDetails(ITestResult result) {
		test.fail(result.getThrowable());
	}

	public static void logSkip(String desc) {
		test.log(Status.SKIP, desc);
	}

	public static void logFatal(String desc) {
		test.log(Status.FATAL, desc);
	}

	public  static void flush() {
		extent.flush();
	}

	public static void logScreenShot(String path) throws IOException {
		test.log(Status.FAIL, "Snapshot below: " + test.addScreenCaptureFromPath(path));
	}




}

