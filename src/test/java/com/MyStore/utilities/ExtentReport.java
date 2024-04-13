package com.MyStore.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport  {
	
	 public static	 ExtentReports extentreports;
	
    public static  void setupReport()
	
	{
		extentreports=new ExtentReports();
		
		
		String TimeStamp=new SimpleDateFormat("yyyy.mm.dd hh.mm.ss").format(new Date());
		
		String ReportName= "MyStoreTestReport_" +TimeStamp+ ".html"; 
		
		
		ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\ASUS\\eclipse-workspace-Appium\\SeleniumFramework_POM_24\\ExtentReportsFailedScreenShot\\" +ReportName);
		extentreports.attachReporter(spark);
		
		extentreports.setSystemInfo("MachinName :", "Avi Gupta");
		extentreports.setSystemInfo("OS", "Windows");
		extentreports.setSystemInfo("browser","Chrome");
		spark.config().setDocumentTitle("MyStoreReport");
		spark.config().setReportName("MyStoreReportTest");
		spark.config().setTheme(Theme.STANDARD);
		
		
	}
	
	public static void tearDownReport()
	
	{
		extentreports.flush();
		
		
	}
	

	}
