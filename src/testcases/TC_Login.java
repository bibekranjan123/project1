package testcases;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generics.BaseTest;
import pages.LoginPage;

@Listeners(generics.Screenshot.class)
public class TC_Login extends BaseTest
{
	@Test
	public void login() throws IOException, InterruptedException
	{
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginMethod();
	}
}