package policyTestPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import policyUtilityPackage.StaticBrowser;

public class BaseClass {
static WebDriver driver;
@Parameters({"browserName"})
  @BeforeTest
  public void beforeTest(String browserName )
  {  	  driver=StaticBrowser.openBrowser(browserName,"https://www.policybazaar.com");

	   this.driver=driver;
  }
@AfterTest
public void aftertest()
{
	//driver.quit();
}
}
