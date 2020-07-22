package fEs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/WCSM3/demo.html");
		
		List<WebElement> cBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=cBoxes.size()-1;i>=0;i--)
		{
			cBoxes.get(i).click();
		}
		
		for(WebElement we:cBoxes)
		{
		   we.click();
		}
		
		List<WebElement> rBtns = driver.findElements(By.xpath("//input[@name='gender']"));
		
		for(WebElement w:rBtns)
		{
			w.click();
			Thread.sleep(500);
		}
		
		
	}
}
