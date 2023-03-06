package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

	@AfterTest
	public void lastexecution() {
		System.out.println("I will execute Last");
		
	}
	@Test(timeOut=4000)
	public void Demo() {
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
	@AfterSuite
	public void afsuite() {
		System.out.println("I am no 1 from last");
	}
	
	@Test
	public void Demo1() {

		System.out.println("Bye");
		System.out.println("Bye1");
		System.out.println("Bye2");
		
		System.out.println("Bye3");
		System.out.println("Bye4");
		System.out.println("Bye5");

	}
	
	@Test
	public void Demo5() {

		System.out.println("Bye");
		System.out.println("Bye1");
		System.out.println("Bye2");
		
		System.out.println("Bye3");
		System.out.println("Bye4");
		System.out.println("Bye5");

	}

}
