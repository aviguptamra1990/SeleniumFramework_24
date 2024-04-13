package com.MyStore.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class ITestListenerClass  implements ITestListener {


	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		 ExtentTest test= ExtentReport.extentreports.createTest(result.getName());
			
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		TakeFailedScreenShot.failedScreenShot(result.getName());
		
		ExtentTest test= ExtentReport.extentreports.createTest(result.getName());
		
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {

        ExtentTest test= ExtentReport.extentreports.createTest(result.getName());
		
		test.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.YELLOW));
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
		ExtentReport.setupReport();
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		ExtentReport.tearDownReport();
		
	}
	
	

}
