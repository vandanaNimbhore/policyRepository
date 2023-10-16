package policyUtilityPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {
     
	public static void captureScreenShots(WebDriver driver) throws IOException
	{
	    
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination= new File("C:\\Users\\91935\\eclipse-workspace\\Policy\\test-output\\ScreenShot\\test\\"+System.currentTimeMillis()+".png");
	FileHandler.copy(source, destination);

	}

}
