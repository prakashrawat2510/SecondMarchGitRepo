package PageRepository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;

public class LogoutfromApp extends BaseClass {
	
WebDriver driver;
	
	public LogoutfromApp(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath="//*[text()='Log out']")
		WebElement CLickLogout;
		
	
		
		public void ClickLogout () {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	       
			 wait.until(ExpectedConditions.visibilityOf(CLickLogout));

	        // Wait until logout is clickable
	    

	        // Scroll to element
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].scrollIntoView(true);", CLickLogout);

	        // Click using JS (safer)
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", CLickLogout);
	    }

}
