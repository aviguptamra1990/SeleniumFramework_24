package com.MyStore.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.MyStore.Base.MyStoreBase;

public class TakeFailedScreenShot extends MyStoreBase{
	
	public static void failedScreenShot(String ScreenShotName)
	
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File file= ts.getScreenshotAs(OutputType.FILE);
		try {
			
			FileUtils.copyFile(file, new File("C:\\Users\\ASUS\\eclipse-workspace-Appium\\SeleniumFramework_POM_24\\ScreenShot\\" +ScreenShotName+".png"));
			
		}
		
		catch (IOException e) 
		
		{
			
			e.printStackTrace();
		}
		
	}

}
