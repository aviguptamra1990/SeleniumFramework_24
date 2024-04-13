package com.MyStore.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.MyStore.Base.MyStoreBase;

public class SignUpPage extends MyStoreBase{
	
	Select select;
	
	public SignUpPage()
	
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	@FindBy(id = "email_create")
	WebElement EmailAddressTextBox;
	
	@FindBy(id = "SubmitCreate")
	WebElement CreateAccountButton;
	
	@FindBy(id =  "id_gender1")
	WebElement Title;
	
	@FindBy(id = "customer_firstname")
	WebElement FirstNameTextBox;
	
	@FindBy(id = "customer_lastname")
	WebElement LastNameTextBox;
	
	@FindBy(id = "passwd")
	WebElement PasswordTextBox;
	
	@FindBy(id = "days")
	WebElement Days;
	
	@FindBy(id = "months")
	WebElement Months;
	
	@FindBy(id = "years")
	WebElement Years;
	
	@FindBy(id = "submitAccount")
	WebElement RegisterButton;
	
	@FindBy(xpath = "//a[@title='View my customer account']")
	WebElement UserName;
	
	@FindBy(xpath = "//p[@class='alert alert-success']")
	WebElement AccountCreationSuccessfullMessage;
	
	
	public void EnterEmailAddress(String EmailAddress)
	
	{
		EmailAddressTextBox.sendKeys(EmailAddress);
		
	}
	
	public void ClickOnCreateAccountButton() throws InterruptedException
	
	{
		CreateAccountButton.click();
		Thread.sleep(3000);
	}
	
    public void SelectTitle()
	
	{
		Title.click();
	}
    
    public void EnterFirstName(String FirstName)
	
  	{
  		FirstNameTextBox.sendKeys("Avi");
  	}
    
   public void EnterLastName(String LastName)
	
  	{
  		LastNameTextBox.sendKeys(LastName);
  	}
   
   public void EnterPassword(String Password)
	
 	{
 		PasswordTextBox.sendKeys(Password);
 	}
   
   public void SelectDay(String day)
   
   {
	   select=new Select(Days);
	   select.selectByValue(day);
   }
   
   public void SelectMonth(String month)
   
   {
	   select=new Select(Months);
	   select.selectByVisibleText(month);
   }
  
   public void SelectYear(String year)
  
  {
	   select=new Select(Years);
	   select.selectByVisibleText(year);
  }
  
   public void ClickOnRegisterButton() throws InterruptedException
  
  {
	   RegisterButton.click();
	   Thread.sleep(3000);
  }
	
	
   public String MyAccountPageTitle()
   
   {
	   String MyAccountPageTitle=driver.getTitle();
	   
	   return MyAccountPageTitle;
   }
	
   public String getUserName()
   
   {
	   
	  String username= UserName.getText();
	   
	   return username;
	   
   }
    public String getAccountCreationSuccessfullMessage()
   
   {
	   
	  String getAccountCreationSuccessfullMessage= AccountCreationSuccessfullMessage.getText();
	   
	   return getAccountCreationSuccessfullMessage;
	   
   }
   
	
	
	
	
	
	
	
	

}
