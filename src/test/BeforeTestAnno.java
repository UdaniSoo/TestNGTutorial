package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestAnno {
	
	@Test(dependsOnMethods={"normaltest2"})
	public void normaltest()
	{
		System.out.println("Normal test");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This is before class methhod");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("This is after class method");
	}
	
	@Test
	public void normaltest2()
	{
		System.out.println("Normal test2");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("This is Before test");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("This is After test");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This is before suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This is after suite");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This is before method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This is after method");
	}
	


}
