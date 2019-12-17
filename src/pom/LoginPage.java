package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class LoginPage extends Base_Page
{
	@FindBy(xpath="//input[@name='username']")
	private WebElement txtUsername;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement txtPassword;
	
	@FindBy(id="loginButton")
	private WebElement btnLogin;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errorMsg;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void setUsername(String username)
	{
		txtUsername.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	public void verifyLoginPage(String lp_title)
	{
		verifyTitle(lp_title);
	}
	
	public void verifyErrorMessage()
	{
		verifyElement(errorMsg);
	}

}
