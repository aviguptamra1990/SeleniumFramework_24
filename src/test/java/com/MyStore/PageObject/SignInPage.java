package com.MyStore.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.Base.MyStoreBase;

public class SignInPage extends MyStoreBase {
	
	
	
	public SignInPage()
	
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'Sign')]")
	WebElement SignIn;
	
	
    public void ClickOnSignFromHomePage()
	
	{
		SignIn.click();
	}
    
    public String HomePageTitle()
	
	{
		String HomePageTitle=driver.getTitle();
		System.out.println(HomePageTitle);
		
		return HomePageTitle;
	}

}
