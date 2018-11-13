package test2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2Class1 {
	@Parameters({"URL2"})
	@Test
	public void test2m2(String urlname2 )
	{
		System.out.println("Package execution");
		System.out.println(urlname2);
		
	}
	
	
}
