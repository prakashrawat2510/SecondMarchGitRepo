package PageClasses;

import org.openqa.selenium.By;

public class LoginPage  {

	
	
	public static By ClickHamburgerMenu() {
		return By.xpath("//a[@id='menu-toggle']");
			
	}
	
	public static By ClickLoginBtn() {
		return By.xpath("//a[text()='Login']");
			
	}
	
	public static By EnterUserName() {
		return By.xpath("//input[@id='txt-username']");
			
	}
	
	public static By EnterPassword() {
		return By.xpath("//input[@id='txt-password']");
			
	}
	
	public static By ClickSubmitBtn() {
		return By.xpath("//button[@id='btn-login']");
			
	}
	
	
}
