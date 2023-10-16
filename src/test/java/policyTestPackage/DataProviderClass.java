package policyTestPackage;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name="login")
	public  String[][] testData(String phno,String pass)
	{
		String test[][]= {{"9623153925","abc123"},{"4567345678","abc1234"}};
		return test;
	}
	

}
