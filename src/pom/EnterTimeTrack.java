package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import generic.Base_Page;

public class EnterTimeTrack extends Base_Page
{

	@FindBy(id="logoutLink")
	private WebElement lnkLogout;
	
	@FindBy(xpath="//span[contains(.,'Help')]")
	private WebElement btnHelp;
	
	@FindBy(xpath="//div[contains(.,'About actiTIME')]//div[contains(.,'About actiTIME')]//div[contains(.,'About actiTIME')]//div[contains(.,'About actiTIME')]")
	private WebElement btnAbout;
	
	@FindBy(xpath="//td[.='3.3 (build 17443), Auto-installation package']")
	private WebElement lblVersion;
	
	@FindBy(xpath="//img[@class='close']")
	private WebElement imgClose;
		
	public EnterTimeTrack(WebDriver driver) 
	{
		super(driver);
		
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	public void clickHelp()
	{
		btnHelp.click();
	}
	
	public void clickAboutActiTime()
	{
		btnAbout.click();
	}
	
	public void clickClose()
	{
		imgClose.click();
	}
	
	public void verifyHomePage(String hpTitle)
	{
		verifyTitle(hpTitle);
	}
	
	public void verifyVersion(String expVersion)
	{
		String actVersion=lblVersion.getText();
		try
		{
			Assert.assertEquals(actVersion, expVersion);
			Reporter.log("Version is matching",true);
		}
		catch(Exception e)
		{
			Reporter.log("Version is not matching",true);
			Assert.fail();
		}
	}

}
