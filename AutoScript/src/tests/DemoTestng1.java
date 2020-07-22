package tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestng1 {

	@Test
	public void testSignUp()
	{
		Reporter.log("user signedUp ",true);
	}
	
	@Test(dependsOnMethods = "testSignUp")
	public void testLogin()
	{
		Reporter.log("user logged in",true);
	}
	
	@Test(dependsOnMethods = "testLogin")
	public void testTask()
	{
		Reporter.log("User Performs task",true);
	}
	
	@Test(dependsOnMethods = {"testLogin","testTask"})
	public void testLogout()
	{
		Reporter.log("user Logged out",true);
	}
}
