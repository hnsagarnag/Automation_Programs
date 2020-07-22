package fEs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksProgram {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count = allLinks.size();
		System.out.println(count);
		
//		for(int i=0;i<count;i++)
//		{
//			System.out.println(allLinks.get(i).getText());
//		}
		
		for(WebElement we:allLinks)
		{
			System.out.println(we.getText());
		}
		
		Thread.sleep(3000);
		driver.close();
	}
}
