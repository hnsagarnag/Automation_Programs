package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MethodOfWebDriver {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		// enter the URL
//		driver.get("https://www.seleniumhq.org");
		
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://www.google.com");
		
		driver.switchTo().activeElement().sendKeys("selenium");
		
		
		
		
//		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		Thread.sleep(5000);
//		driver.quit();
		
//		fetch the current URL of the web page
//		System.out.println(driver.getCurrentUrl());
		
		//fetch the front end source code of the web page
//		System.out.println(driver.getPageSource());
		
		//it is used to display the title of the web page
//		System.out.println(driver.getTitle());
		
		
		
		
	}

}
