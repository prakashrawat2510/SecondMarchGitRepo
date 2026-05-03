package TestClasses;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageClasses.LoginPage;
import Utilities.BaseClass;
import Utilities.FetchDataFromExcel;
import Utilities.ListenersImplementation;

@Listeners(ListenersImplementation.class)

public class LoginTest extends BaseClass{
	
	@Test (priority=0, groups ="regression")
	public static void executeLogin() throws IOException, InterruptedException {
		
		driver.findElement(LoginPage.ClickHamburgerMenu()).click();
		
		driver.findElement(LoginPage.ClickLoginBtn()).click();
		driver.findElement(LoginPage.EnterUserName()).sendKeys(FetchDataFromExcel.getCredential(1, 0));
		driver.findElement(LoginPage.EnterPassword()).sendKeys(FetchDataFromExcel.getCredential(1, 1));
		driver.findElement(LoginPage.ClickSubmitBtn()).click();
		
		Thread.sleep(5000);
		
	}
	
	

}
