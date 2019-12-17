package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Automation_Const
{
	public WebDriver driver;
	
	static
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	
	
	@BeforeMethod
	public void openApplication()
	{
		driver = new FirefoxDriver();
		String url="http://127.0.0.1/login.do"; 
		driver.get(url);
	}
	
	@AfterMethod
	public void closeApplication()
	{
		driver.close();
	}

}
