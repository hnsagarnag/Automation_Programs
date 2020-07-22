package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import inheritInTestNG.BaseClass;
import page.OrgHRMLoginPage_POM;

public class TestParam extends BaseClass{
	
	@Test
	@Parameters({"username","password"})
	public void testInvalid(String username,String password) throws InterruptedException
	{
		OrgHRMLoginPage_POM lp=new OrgHRMLoginPage_POM(driver);
		lp.setCrendtials(username , password );
		lp.clickLogin();
		Thread.sleep(2000);
	}
	
	
	
}
