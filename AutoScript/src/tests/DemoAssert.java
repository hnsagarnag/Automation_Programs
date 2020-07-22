package tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;
import inheritInTestNG.BaseClass;
import page.OrgHRMLoginPage_POM;

public class DemoAssert extends BaseClass {
	
	@Test
	public void testA() throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/OrangeHRMCredentials.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		
		
		FileOutputStream fos=new FileOutputStream("./data/OrangeHRMCredentials.properties");
		prop.setProperty("java", "selenium");
		prop.store(fos, "Updated By Author: SAGAR");
		
		
		OrgHRMLoginPage_POM lp=new OrgHRMLoginPage_POM(driver);
		lp.setCrendtials(username,password);
		lp.clickLogin();
	}
	
	
	

}
