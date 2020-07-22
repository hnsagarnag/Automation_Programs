package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OrgHRMLoginPage_POM {

	// declare the elements by using @FindBy
	@FindBy(id="txtUsername") 
	private WebElement usernameTB;
	@FindBy(id = "txtPassword")
	private WebElement passwordTB;
	@FindBy(id = "btnLogin")
	private WebElement loginBtn;
	@FindBy(linkText = "Forgot your password?")
	private WebElement forgotPasswordLink;
	@FindBy(xpath = "//img[contains(@src,'login/logo')]")
	private WebElement loginLogo;
	
	//Initialization
	public OrgHRMLoginPage_POM(WebDriver driver)
	{
		// Initialize all the web elements by using PageFactory class
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public void setCrendtials(String enter_username,String enter_password)
	{
		usernameTB.sendKeys(enter_username);
		passwordTB.sendKeys(enter_password);
	}
	
	public void clickLogin()
	{
		loginBtn.click();
	}
	
	public void clickForgotPassword()
	{
		forgotPasswordLink.click();
	}
	
	public void verifyLogo()
	{
		Assert.assertTrue(loginLogo.isDisplayed());
	}
}
	
	
	
	
