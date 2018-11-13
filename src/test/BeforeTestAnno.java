package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestAnno {
	@Test
	public void normaltest()
	{
		System.out.println("Normal test");
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

}
