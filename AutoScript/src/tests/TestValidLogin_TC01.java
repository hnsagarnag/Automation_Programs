package tests;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import inheritInTestNG.BaseClass;
import page.OrgHRMLoginPage_POM;

public class TestValidLogin_TC01 extends BaseClass{
	
	@Test
    public void testValid() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException {

	OrgHRMLoginPage_POM lp=new OrgHRMLoginPage_POM(driver);
	Workbook wk = WorkbookFactory.create(new FileInputStream("./data/TestData.xlsx"));
	String username = wk.getSheet("ValidLogin").getRow(1).getCell(0).toString();
	String password = wk.getSheet("ValidLogin").getRow(1).getCell(1).toString();
	lp.setCrendtials(username,password);
	lp.clickLogin();
	Thread.sleep(3000);
 	}
	
	@Test
	public void testInvalidInput() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException
	{
		Workbook wk = WorkbookFactory.create(new FileInputStream("./data/TestData.xlsx"));
		Sheet sh = wk.getSheet("InvalidLogin");
		int count = sh.getLastRowNum();
		for( int i=1 ; i<count ; i++)
		{
			String username = sh.getRow(i).getCell(0).toString();
			 String password = sh.getRow(i).getCell(1).toString();
			OrgHRMLoginPage_POM lp=new OrgHRMLoginPage_POM(driver);
			lp.setCrendtials(username, password);
			lp.clickLogin();
			Thread.sleep(2000);
		}
				
		
		
		
	}
	
	
	
	
}
