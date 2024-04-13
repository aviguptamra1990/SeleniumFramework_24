package com.MyStore.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.MyStore.Base.MyStoreBase;
import com.MyStore.PageObject.SignInPage;
import com.MyStore.PageObject.SignUpPage;
import com.MyStore.utilities.ExtentReport;
import com.MyStore.utilities.ITestListenerClass;


public class SignUpPageTC extends MyStoreBase{
	
	SignUpPage sup;
	SignInPage sip;
	ExtentReport report;
	
	@BeforeMethod
	public void setUp()
	
	{
		
		ConfigurationStarts(prop.getProperty("browsername"));
		sup =new SignUpPage();
		sip=new SignInPage();
		report=new ExtentReport();
	}
	
	
	
	
	@Test
	public void CreateAccountAndVerifyAccountSuccessfullyCreated() throws InterruptedException
	
	{
		
		
		sip.ClickOnSignFromHomePage();
		sup.EnterEmailAddress(prop.getProperty("emailAddress"));
		sup.ClickOnCreateAccountButton();
		sup.SelectTitle();
		sup.EnterFirstName(prop.getProperty("firstName"));
		sup.EnterLastName(prop.getProperty("lastName"));
		sup.EnterPassword(prop.getProperty("password"));
		sup.SelectDay(prop.getProperty("day"));
		sup.SelectMonth(prop.getProperty("month"));
		sup.SelectYear(prop.getProperty("year"));
		sup.ClickOnRegisterButton();
		
		String VerifyAccountPageTitle= sup.MyAccountPageTitle();
		
		Assert.assertEquals(VerifyAccountPageTitle, "My account - My Shop");
		
		System.out.println("VerifyAccountPageTitle AND First verification 'PASSED' for SignUp Creation.  " + VerifyAccountPageTitle);
		
		String VerifyUserNameOnMyAccountPage= sup.getUserName();
				
		Assert.assertEquals(VerifyUserNameOnMyAccountPage, "Avi Gupta");
		
		System.out.println("Verify UserName is Displayed on My Account Page AND Second verification 'PASSED' for SignUp Creation. : " + VerifyUserNameOnMyAccountPage);

		String VerifyAccountCreationSuccessfullMessage=sup.getAccountCreationSuccessfullMessage();
		
		Assert.assertEquals(VerifyAccountCreationSuccessfullMessage, "Your account has been created.");
		
		System.out.println("Verify Account Creation Successfull Message is Displayed on My Account Page AND Third verification 'PASSED' for SignUp Creation. : " + VerifyAccountCreationSuccessfullMessage);

		
	}
	
	
	@AfterMethod
	public void tearDown()
	
	{
		ConfigurationEnds();
	}

}
