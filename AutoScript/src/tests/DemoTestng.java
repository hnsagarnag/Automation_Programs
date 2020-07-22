package tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestng {

	@Test(enabled = false)
	public void testZ()
	{
		Reporter.log("click on login button",true);
	}
	
	@Test
	public void testA()
	{
		Reporter.log("click on gmail link",true);
	}
	
}
