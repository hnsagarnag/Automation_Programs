package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("(//button[contains(text(),'me')])[1]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());

		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		al.dismiss();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//button[contains(text(),'me')])[2]")).click();
		Alert al1 = driver.switchTo().alert();
		System.out.println(al1.getText());
		al1.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
		Alert al2 = driver.switchTo().alert();
		al2.sendKeys("selenium alter ");
		Thread.sleep(2000);
		al2.accept();
	}
}
