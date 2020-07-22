package inheritInTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	@BeforeSuite
	public void projectDoc()
	{
		Reporter.log("This application is used to track the employees and thier attandance and leaves.",true);
	}
	
	@BeforeTest
	public void setPro()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@BeforeMethod
	public void openApp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.get("file:///C:/Users/LENOVO/Desktop/WCSM3/AttendanceTracking.html");
	}
	
	
	@AfterMethod
	public void closeApp()
	{
		// take screenshot for only failed test cases
		driver.quit();
	}
	
	@AfterSuite
	public void reportGeneration() {
		Reporter.log("report generated ",true);
	}
	
	
	
	
	
	
	
	
	

}
