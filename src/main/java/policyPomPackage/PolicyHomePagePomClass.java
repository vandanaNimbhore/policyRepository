package policyPomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyHomePagePomClass {
	@FindBy(xpath="//a[@class='sign-in']") private WebElement signInButton;
	@FindBy(xpath="(//input[@id=\"central-login-module-sign-mobile\"])[2]") private WebElement mobileNumField;
	@FindBy(xpath="(//span[@id='central-login-sign-in-with-password-span'])[2]") private WebElement signInWithPasswordButton;
	@FindBy(xpath="//input[@name='password']") private WebElement passwordField;
	@FindBy(xpath="//a[@id='login-in-with-password']") private WebElement signInButton1;
	@FindBy(xpath="//div[@class='userprofile']") private WebElement  myAccount;
	@FindBy(xpath="//span[text()=' My profile ']") private WebElement myProfile;
	WebDriver driver;
	public PolicyHomePagePomClass(WebDriver driver)
	{
		this.driver=driver;
	   PageFactory.initElements(driver,this);
	} 
	public void clickOnSignInButton()
	{
		signInButton.click();
	}
	public void enterMobileNumber(String mobileNum)
	{
		mobileNumField.sendKeys(mobileNum);
	}
	public void clickOnSignInPasswordButton()
	{
		signInWithPasswordButton.click();
	}
	public void enterPassword(String password)
	{
		passwordField.sendKeys(password);
	}
	public void clickOnSignButton()
	{
		signInButton1.click();
	}
	public void clickOnMyAccount()
	{
		myAccount.click();
	}
	public void clickOnMyProfile()
	{
		myProfile.click();
	}

}
