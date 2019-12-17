package generic;

import org.testng.annotations.Test;

import pom.LoginPage;

public class LoginTest extends BaseTest
{
	@Test
	public void login(String username, String password)
	{
	/*String username=Excel.getCellValue(PATH, "ValidLoginLogout", 1, 0);
	String password=Excel.getCellValue(PATH, "ValidLoginLogout", 1, 1);*/
	String loginPageTitle=Excel.getCellValue(PATH, "ValidLoginLogout", 1, 2);
	String homePageTitle=Excel.getCellValue(PATH, "ValidLoginLogout", 1, 3);
	LoginPage login=new LoginPage(driver);
	login.setUsername(username);
	login.setPassword(password);
	login.clickLogin();
	}

}
