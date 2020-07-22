package inheritInTestNG;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoSeleniumGrid {
	
	@Test
	@Parameters({"nodeURL","browserName"})
	public void demoGrid(String nodeURL,String browserName) throws MalformedURLException, InterruptedException
	{
		URL u=new URL(nodeURL);
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName(browserName);
		WebDriver driver=new RemoteWebDriver(u, dc);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement var = driver.switchTo().activeElement();
		var.sendKeys("selenium Grid");
		var.sendKeys(Keys.ENTER);
		
		Thread.sleep(6000);
		driver.close();
		
	}

}
