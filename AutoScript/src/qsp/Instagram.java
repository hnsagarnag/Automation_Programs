package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("hnsagarnag@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		
		WebElement var = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		System.out.println("displayed ? "+var.isDisplayed());
		System.out.println("is selected ? "+var.isSelected());
		System.out.println("is enabled ? "+ var.isEnabled());
	
	
	}
}
