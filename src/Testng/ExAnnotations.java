package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ExAnnotations {

	@Test
	public void my1stTestng() {
		System.out.println("My 1st teztng program");
	}
	@BeforeMethod
	public void beforemethod1() {
	System.out.println("This will execute before each method");
	}
	@AfterMethod
	public void aftermethod() {
	System.out.println("This will execute after each method");
	}
	@BeforeClass
	public void beforeclass() {
	System.out.println("This will execute before each class");
	}
	@AfterClass
	public void afterClass() {
	System.out.println("This will execute after each class");
	}
	@BeforeTest
	public void beforetest() {
	System.out.println("This will execute before each Test");
	}
	@AfterTest
	public void AfterTest() {
	System.out.println("This will execute after each Test");
	}
	@BeforeSuite
	public void beforesuite() {
	System.out.println("This will execute before each suite");
	}
	@AfterSuite
	public void Aftersuite() {
	System.out.println("This will execute after each suite");
	}
	
	
}
