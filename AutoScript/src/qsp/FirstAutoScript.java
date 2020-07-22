package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutoScript {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException  {
		
		//open chrome browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
		System.out.println(gmailLink.getText());
		
		System.out.println("The font size is "+gmailLink.getCssValue("font-size"));
		
//		Point loc = gmailLink.getLocation();
//		int x = loc.getX();
//		int y = loc.getY();
//		System.out.println("x axis "+x+" y axis "+y);
		 
//		Rectangle r = gmailLink.getRect();
//		System.out.println("var r "+r );
//		int x = r.getX();
//		int y = r.getY();
//		int l = r.getHeight();
//		int b = r.getWidth();
//		System.out.println(l);
//		System.out.println(b);
//		
//		
//		Dimension var = gmailLink.getSize();
//		int h = var.getHeight();
//		int bb = var.getWidth();
//		System.out.println(var);
		
		
//		String tagname = gmailLink.getTagName();
//		if(tagname.equals("a"))
//			System.out.println("its a link");
//		else
//			System.out.println("its not a link");
		
		System.out.println(gmailLink.isDisplayed());
		
		
		
		Thread.sleep(1000);
		driver.close();
		
	}

}
