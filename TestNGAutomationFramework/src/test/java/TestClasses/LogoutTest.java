package TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import PageClasses.LoginPage;
import PageClasses.LogoutPage;
import Utilities.BaseClass;

public class LogoutTest extends BaseClass {

	@Test (groups ="regression")
	public static void executeLogout() throws IOException, InterruptedException {
		
		LoginTest.executeLogin();
		driver.findElement(LoginPage.ClickHamburgerMenu()).click();
		driver.findElement(LogoutPage.ClickLogout()).click();
		
	}
	
	
}
