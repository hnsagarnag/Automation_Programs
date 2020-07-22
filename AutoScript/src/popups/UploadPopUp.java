package popups;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/WCSM3/demo.html");
		
		WebElement uploadBtn = driver.findElement(By.id("i25"));
		
		// sendKeys-> only absolute path
		File f=new File("./data/resume");
		System.out.println(f.getAbsolutePath());
		uploadBtn.sendKeys(f.getAbsolutePath());
		
		
		
		
		
		
		
		
	}
}
