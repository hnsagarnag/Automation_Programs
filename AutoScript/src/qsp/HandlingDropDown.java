package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/WCSM3/demo.html");
		
		//Handling single select -> we cannot use de select option
		
//		WebElement singleSelectDDL = driver.findElement(By.id("i1"));
//		Select ss=new Select(singleSelectDDL);
//		ss.selectByIndex(3);
//		Thread.sleep(1000);
//		ss.selectByValue("v2");
//		Thread.sleep(1000);
//		ss.selectByVisibleText("Maharashtra");
//		System.out.println("is it multi select ?"+ss.isMultiple());
	
		// handling multi select DDL 
		
		WebElement multiSelectDDL = driver.findElement(By.id("i2"));
		Select ms=new Select(multiSelectDDL);
		ms.selectByIndex(0);
		ms.selectByValue("z3");
		ms.selectByVisibleText("MisalPav");
		System.out.println("is it multi select ? "+ms.isMultiple());
//		ms.deselectByIndex(0);
//		ms.deselectByValue("z7");
//		ms.deselectByVisibleText("ChouleBhatura");
//		ms.deselectAll();
		System.out.println("-----------------------------------------");
		List<WebElement> allSelOPts = ms.getAllSelectedOptions();
		System.out.println("all selected options are");
		for(WebElement we:allSelOPts)
		{
			System.out.println(we.getText());
		}
		System.out.println("-----------------------------------------");
		WebElement firstSel = ms.getFirstSelectedOption();
		System.out.println("First Selected Option "+firstSel.getText());
		System.out.println("-----------------------------------------");
		
		List<WebElement> allOPtions = ms.getOptions();
		System.out.println("All options of multi select are");
		for(WebElement we:allOPtions)
		{
			System.out.println(we.getText());
		}
		System.out.println("-----------------------------------------");
		
		WebElement wrapEle = ms.getWrappedElement();
		System.out.println("the Wrapped options are");
		System.out.println(wrapEle.getText());
		System.out.println("-----------------------------------------");
		
		
		
		
		
		
		
		
		
	}
}
