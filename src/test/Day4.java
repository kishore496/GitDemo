package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String urlname) {
//		Selenium
		System.out.println("WebloginHomeLoan");
		System.out.println(urlname);
	}
	
	@Test(groups= {"Smoke"})
	public void MobileloginHomeLoan() {
//		Appium
		System.out.println("MobileloginHomeLoan");
	}

	
	@Test
	public void LoginAPIHomeLoan() {
//		Rest API automation
		System.out.println("LoginAPIHomeLoan");
	}

}
