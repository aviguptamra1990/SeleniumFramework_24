package com.MyStore.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MyStoreBase {
	
	public static WebDriver driver;
	 public Properties prop;
	
	public MyStoreBase()   
	
	{
		
    try {
			
		String filePath="C:\\Users\\ASUS\\eclipse-workspace-Appium\\SeleniumFramework_POM_24\\Configuration\\Config.properties";
		prop=new Properties();
		FileInputStream fis=new FileInputStream(filePath);
		prop.load(fis);
		
	} 
		
		catch (IOException e) {

        e.printStackTrace();
		
	}
    
    
		
	
		
	}
	
	public void ConfigurationStarts(String browserName)
	
	{
		
		if(browserName.equalsIgnoreCase("chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace-Appium\\SeleniumFramework_POM_24\\Drivers\\chromedriver-win64\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
			
		{
			FirefoxOptions opt=new FirefoxOptions();
			opt.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASUS\\eclipse-workspace-Appium\\SeleniumFramework_POM_24\\Drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver(opt);
		}
		
		else if(browserName.equalsIgnoreCase("edge"))
			
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\ASUS\\eclipse-workspace-Appium\\SeleniumFramework_POM_24\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		    driver=new EdgeDriver();
		}
		
		else
		{
			System.out.println("No driver found, Please check...");
		}
	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("baseURL"));
	
		
	}
	
	public void ConfigurationEnds()
	
	{
		
		driver.quit();
		
	}
	
	

}
