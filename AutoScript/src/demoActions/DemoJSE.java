package demoActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoJSE {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.craftsvilla.com");
		
		WebElement element = driver.findElement(By.xpath("(//img[contains(@class,'img-responsive ')])[1]"));
		Point loc = element.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		System.out.println("x element is "+x);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("scrollBy("+x+","+y+")");
//		js.executeAsyncScript("scrollBy("+x+","+y+")");
//		executeAsyncScript=render/performs before the web page load
		driver.close();
		
		
		
	}
}
