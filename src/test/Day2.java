package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups= {"Smoke"})
	public void Demo() {
		System.out.println("Good");
		
		System.out.println("Too Good");
		
		System.out.println("love");

	}
	
	@Test(groups= {"Smoke"})
	public void Demo2() {
		System.out.println("Good");
		
		System.out.println("Too Good");
		
		System.out.println("love");

	}
	
	
@BeforeTest
public void Prerequestie() {
	System.out.println("I will execute First");
}
}
