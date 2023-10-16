 package policyTestPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import policyPomPackage.PolicyHomePagePomClass;
import policyPomPackage.PolicyProfilePagePomClass;
import policyUtilityPackage.FetchData;

public class PolicyTestClass extends BaseClass {
	PolicyHomePagePomClass home;
	//WebDriver driver;
	PolicyProfilePagePomClass profile;
	FetchData fd;
	
	@BeforeClass
	public void beforeClass()
	{
		home= new PolicyHomePagePomClass(driver);
		profile= new PolicyProfilePagePomClass(driver);
		
	} 
	@Test(dataProvider="login",dataProviderClass=policyTestPackage.DataProviderClass.class)
  public void verifyUserName(String phno,String pass) throws EncryptedDocumentException, IOException, InterruptedException
  {
		FileInputStream file=new FileInputStream("C:\\Users\\91935\\OneDrive\\Desktop\\New folder\\AutoEx.xlsx");
	
	/*Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
	String data=sh.getRow(2).getCell(0).getStringCellValue();
	String data1=sh.getRow(2).getCell(1).getStringCellValue();
	String expected=sh.getRow(2).getCell(2).getStringCellValue();*/
     home.clickOnSignInButton();
     Thread.sleep(2000);
     home.enterMobileNumber(phno);
	 //home.enterMobileNumber(fd.readDataForExcel(2, 0));
	 Thread.sleep(2000);
	 home.clickOnSignInPasswordButton();
	 Thread.sleep(2000);
	 home.enterPassword(pass);
	// home.enterPassword(fd.readDataForExcel(2, 1));
	 Thread.sleep(2000);
	 home.clickOnSignButton();
	 Thread.sleep(2000);
	 home.clickOnMyAccount();
	 Thread.sleep(2000);
	 home.clickOnMyProfile();
	 Thread.sleep(2000);
	ArrayList<String> address= new ArrayList<String>(driver.getWindowHandles());
	
	for(int i=0;i<address.size();i++)
	{
		String addr=address.get(i);
		
		driver.switchTo().window(addr);
	}
	profile.verifyActualExpectedText(fd.readDataForExcel(2, 2));

 }
}
