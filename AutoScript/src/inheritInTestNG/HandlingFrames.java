package inheritInTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandlingFrames extends BaseClass{
	
	
	@Test
	public void testA() throws InterruptedException
	{
		driver.findElement(By.id("eid")).sendKeys("QSP01");
		driver.findElement(By.id("ename")).sendKeys("SAGAR NAG H N");
		WebElement frame1 = driver.findElement(By.cssSelector("iframe[title='t1']"));
		driver.switchTo().frame(frame1);
		
		
		driver.findElement(By.id("pfno")).sendKeys("21345678654");
		Thread.sleep(9000);
	}

}
