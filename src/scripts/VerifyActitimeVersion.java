package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.EnterTimeTrack;
import pom.LoginPage;

public class VerifyActitimeVersion extends BaseTest
{
	@Test
	public void testVerifyVersion() throws InterruptedException
	{
		String username=Excel.getCellValue(PATH, "VerifyActitimeVersion", 1, 0);
		String password=Excel.getCellValue(PATH, "VerifyActitimeVersion", 1, 1);
		String loginPageTitle=Excel.getCellValue(PATH, "VerifyActitimeVersion", 1, 2);
		String homePageTitle=Excel.getCellValue(PATH, "VerifyActitimeVersion", 1, 3);
		String version=Excel.getCellValue(PATH, "VerifyActitimeVersion", 1, 4);
		LoginPage login=new LoginPage(driver);
		login.setUsername(username);
		login.setPassword(password);
		login.verifyLoginPage(loginPageTitle);
		login.clickLogin();
		EnterTimeTrack timeTrack=new EnterTimeTrack(driver);
		timeTrack.verifyHomePage(homePageTitle);
		timeTrack.clickHelp();
		Thread.sleep(2000);
		timeTrack.clickAboutActiTime();
		Thread.sleep(2000);
		timeTrack.verifyVersion(version);
		timeTrack.clickClose();
		timeTrack.clickLogout();
		login.verifyLoginPage(loginPageTitle);
	}

}
