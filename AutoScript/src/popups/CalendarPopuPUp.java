package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarPopuPUp {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://retail.starhealth.in/policies/instantpay/renew");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,200)");
		
		driver.findElement(By.id("policyNumber")).sendKeys("i dont knw");
		// Handle calendar pop up using JavaScriptExecutor Methods
        // Date picker using JSE
		WebElement calendar = driver.findElement(By.xpath("//input[@class='form-control']"));
		// 1st arg -> java script method
		//2nd arg -> WebElement
		
		String date="01-01-2019";
		js.executeScript("arguments[0].setAttribute('value','01-12-2016');", calendar);
//		                        OR
		js.executeScript("arguments[0].setAttribute('value','"+date+"');", calendar);
		
		
		
	}
}
