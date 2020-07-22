package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		//open the browser
				WebDriver driver=new ChromeDriver();
				//maximize the window
				driver.manage().window().maximize();
				//enter the URL 
				driver.get("https://www.facebook.com/");
				
				//identify and enter user name TB
				driver.findElement(By.id("email")).sendKeys("hnsagarnag@gmail.com");
				//identify and enter password TB
				driver.findElement(By.id("pass")).sendKeys("gisgisgi");
				//identify and click on login btn
				driver.findElement(By.id("u_0_b")).click();
	}

}
