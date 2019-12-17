package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.EnterTimeTrack;
import pom.LoginPage;

public class ValidLoginLogout extends BaseTest
{
	@Test
	public void testValidLoginLogout()
	{
		String username=Excel.getCellValue(PATH, "ValidLoginLogout", 1, 0);
		String password=Excel.getCellValue(PATH, "ValidLoginLogout", 1, 1);
		String loginPageTitle=Excel.getCellValue(PATH, "ValidLoginLogout", 1, 2);
		String homePageTitle=Excel.getCellValue(PATH, "ValidLoginLogout", 1, 3);
		LoginPage login=new LoginPage(driver);
		login.setUsername(username);
		login.setPassword(password);
		login.clickLogin();
		EnterTimeTrack homePage=new EnterTimeTrack(driver);
		homePage.verifyHomePage(homePageTitle);
		homePage.clickLogout();		
		login.verifyLoginPage(loginPageTitle);
	}

}
