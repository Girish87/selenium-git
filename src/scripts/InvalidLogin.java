package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LoginPage;

public class InvalidLogin extends BaseTest
{
	@Test
	public void testInvalidLogin()
	{
		String username=Excel.getCellValue(PATH, "InvalidLogin", 1, 0);
		String password=Excel.getCellValue(PATH, "InvalidLogin", 1, 1);
		LoginPage login=new LoginPage(driver);
		login.setUsername(username);
		login.setPassword(password);
		login.clickLogin();
		login.verifyErrorMessage();
		
	}

}
