package popups;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChildBrowserPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		
		Set<String> whs = driver.getWindowHandles();
		for(String s:whs)
		{
			System.out.println(s);
		}
		
		Iterator<String> it = whs.iterator();
		String parentWindow = it.next();
		String childWindow=it.next();
		
		driver.switchTo().window(childWindow);
		driver.close();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//button[text()='Search']")).click();
	}
}
