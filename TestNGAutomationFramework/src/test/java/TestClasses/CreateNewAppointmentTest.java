package TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageClasses.CreateNewAppointmentPage;
import Utilities.BaseClass;
import Utilities.ListenersImplementation;

@Listeners(ListenersImplementation.class)

public class CreateNewAppointmentTest extends BaseClass {
	
	@DataProvider(name="bookAppointment")
	
	public Object [][] dpMethod(){
		return new Object [][]
				{
			
			{"22/04/2026", " Need a Dentist for"}, {"25/04/2026","Need to vist  physician"}
				};
	
	}
	
	@Test (dataProvider="bookAppointment", groups="sanity", retryAnalyzer=Utilities.RetryAnalyzerUtil.class)
	public static void CreateNewAppointment(String date, String description) throws IOException, InterruptedException {
		
		LoginTest.executeLogin();
		
		WebElement ele = driver.findElement(CreateNewAppointmentPage.SelectFacility());
		Select sl = new Select(ele);
		sl.selectByIndex(2);
		
		driver.findElement(CreateNewAppointmentPage.EnterDate()).sendKeys(date);
		driver.findElement(CreateNewAppointmentPage.EnterComment()).sendKeys(description);
		driver.findElement(CreateNewAppointmentPage.ClickBookAppoint()).click();
		boolean flag1 =driver.findElement(CreateNewAppointmentPage.validAppoint()).isDisplayed();
		boolean flag2 =driver.findElement(CreateNewAppointmentPage.validMessage()).isDisplayed();
		
		if(flag1==true && flag2==true) {
			
			System.out.println("Test script passed");
		}
		
	}
	
	
	

}
