package test3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizatn {
	
	@Parameters({"URL"})
	@Test
	public void param1(String urlname)
	{
		System.out.println("Print the url");
		System.out.println(urlname);
	}
	
	@Test
	public void param2()
	{
		System.out.println("Print 2nd url");
	}

}
