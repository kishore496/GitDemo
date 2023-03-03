package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@BeforeClass
	public void beforeclas() {
		System.out.println("I will execute before any methods in this class");
	}
	
	@AfterClass
	public void afterclas() {
		System.out.println("I will execute after any methods in this class");
	}
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void WebloginCarLoan(String urlname, String key) {
//		Selenium
		System.out.println("WebloginCarLoan");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@BeforeMethod
	public void beforeevery() {
		System.out.println("I will execute before every test method in Day3 class");
	}
	
	@AfterMethod
	public void afterevery() {
		System.out.println("I will execute after every test method in Day3 class");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileloginCarLoan() {
//		Appium
		System.out.println("MobileloginCarLoan");
	}
	
	@BeforeSuite
	public void bfsuite() {
		System.out.println("I am no 1");
	}
	
	@Test(enabled=false)
	public void MobileSigninHomeLoan() {
//		Appium
		System.out.println("Mobile SignIn");
	}
	
	@Test(dataProvider="getData")
	public void MobileSignoutHomeLoan(String username, String password) {
//		Appium
		System.out.println("Mobile Signout");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@Test(dependsOnMethods={"WebloginCarLoan","MobileSignoutHomeLoan"})
	public void APICarLoan() {
//		Rest API automation
		System.out.println("LoginAPICarLoan");
	}
	
	@DataProvider
	public Object[][] getData() {
//		1st combination - username and password - good credit history
//		2nd - username and password - no credit history
//		3rd - fraudalent credit history
		Object[][] data= new Object[3][2];
//		1st set
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
//		2nd set
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
//		3rd set
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		return data;
		
	}

}
