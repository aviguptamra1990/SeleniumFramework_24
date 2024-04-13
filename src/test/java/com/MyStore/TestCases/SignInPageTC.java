package com.MyStore.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MyStore.Base.MyStoreBase;
import com.MyStore.PageObject.SignInPage;

public class SignInPageTC extends MyStoreBase {
	
	
	SignInPage sip;
	
	
	@BeforeMethod
	public void setUp()
	
	{
		ConfigurationStarts(prop.getProperty("browserName"));
		
		sip =new SignInPage();
		
	}
	
	
	@Test
	public void ClickOnSignInFromHomePageAndVerifyTitle()
	
	{
		sip.ClickOnSignFromHomePage();
		
        String VerifyTitle=sip.HomePageTitle();
		 
		Assert.assertEquals(VerifyTitle, "Login - My Shop1");
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		ConfigurationEnds();
	}
	
	

}
