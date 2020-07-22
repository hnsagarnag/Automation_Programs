package inheritInTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HandlingXLSheet {

	@Test(enabled = false)
	public void getXLData() throws EncryptedDocumentException, IOException
	{
//		FileInputStream fis=new FileInputStream("./data/TestData.xlsx");
//		Workbook wk = WorkbookFactory.create(fis);
//		Sheet sh = wk.getSheet("WCSM3");
//		Row r = sh.getRow(2);
//		Cell c = r.getCell(0);
//		Reporter.log(c.toString(),true);
		//or
		Workbook wk = WorkbookFactory.create(new FileInputStream("./data/TestData.xlsx"));
		Reporter.log(wk.getSheet("WCSM3").getRow(1).getCell(0).toString(),true);
	}
	
	@Test
	public void setXLData() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Workbook wk = WorkbookFactory.create(new FileInputStream("./data/TestData.xlsx"));
		Sheet sh = wk.getSheet("WCSM3");
		Row r=null;
			if(sh!=null)
			{
				r = sh.getRow(0);
			}
			if(r==null)
			{
				r=sh.createRow(0);
			}
		Cell c = r.getCell(0);
			if(c==null)
			{
				c=r.createCell(0);
			}
		c.setCellValue("handling XL");
		FileOutputStream fos=new FileOutputStream("./data/TestData.xlsx");
		wk.write(fos);
		wk.close();
		fos.close();
		
	}
	
	
	
	
	
	
}
