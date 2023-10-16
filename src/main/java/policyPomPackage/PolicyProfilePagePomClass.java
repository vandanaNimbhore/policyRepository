package policyPomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyProfilePagePomClass {
	WebDriver driver;
	@FindBy(xpath="//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']") private WebElement userName;
	public PolicyProfilePagePomClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void verifyActualExpectedText(String expected)
	{
		String actualResult=userName.getText();
		if(actualResult.equals(expected))
		{
			System.out.println("expected  and actual match");
		}
		else
		{
			System.out.println("not match");
		}
	}

}
