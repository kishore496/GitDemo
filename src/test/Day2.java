package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups= {"Smoke"})
	public void Demo() {
		System.out.println("Good");

	}
	
@BeforeTest
public void Prerequestie() {
	System.out.println("I will execute First");
}
}
