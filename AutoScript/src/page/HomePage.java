package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText = "Welcome Admin")
	private WebElement welcomeAdmin;
	@FindBy(linkText = "Logout")
	private WebElement logoutLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickWelcomeAdmin()
	{
		welcomeAdmin.click();
	}
	
	public void clickLogoutLink()
	{
		logoutLink.click();
	}
	
	
	
}
