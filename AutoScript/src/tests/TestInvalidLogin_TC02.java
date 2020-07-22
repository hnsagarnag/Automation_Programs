package tests;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import inheritInTestNG.BaseClass;
import page.OrgHRMLoginPage_POM;

public class TestInvalidLogin_TC02 extends BaseClass {
	
	    @Test(dataProvider = "dp")
	    public void testInvalid(String username,String password) throws InterruptedException {
		OrgHRMLoginPage_POM lp=new OrgHRMLoginPage_POM(driver);
		lp.setCrendtials(username , password );
		lp.clickLogin();
		Thread.sleep(2000);
	 	}
	 
	    @DataProvider
	    public String[][] dp()
	    { 
	    	return new String[][] {{"selenium","java"},{"@123ABC","admin123"},{" ","admin123"},{"!@#$%","admin123"}};
	    }
	    
	    
}
