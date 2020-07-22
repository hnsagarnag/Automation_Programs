package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//enter the URL 
		driver.get("https://www.google.com");
		
		
		driver.findElement(By.xpath("//a[@class='gb_g']")).click();
		
		
		//to handle single element with tagName locator
//		WebElement var = driver.findElement(By.tagName("a"));
//		var.click();
//        driver.findElement(By.tagName("a")).click();
		
//		Using ID locator
//		driver.findElement(By.id("i1")).click();
		
//		using name locator 
//		driver.findElement(By.name("n1")).click();
		
//		using className locator
//		driver.findElement(By.className("c1")).click();
		
//		driver.findElement(By.partialLinkText("mail")).click();
		
		
	}

}
