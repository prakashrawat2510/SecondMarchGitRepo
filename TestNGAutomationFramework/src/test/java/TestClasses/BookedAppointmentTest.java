package TestClasses;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageClasses.BookedAppointmentPage;
import PageClasses.CreateNewAppointmentPage;
import PageClasses.LoginPage;
import Utilities.BaseClass;
import Utilities.ListenersImplementation;


@Listeners(ListenersImplementation.class)
public class BookedAppointmentTest extends BaseClass{
	
	
public static void CreateNewAppointment(String date, String description) throws IOException, InterruptedException {
		
	
	
	
		WebElement ele =driver.findElement(CreateNewAppointmentPage.SelectFacility());
		Select sl = new Select(ele);
		sl.selectByIndex(2);
		
		driver.findElement(CreateNewAppointmentPage.EnterDate()).sendKeys(date);
		driver.findElement(CreateNewAppointmentPage.EnterComment()).sendKeys(description);
		driver.findElement(CreateNewAppointmentPage.ClickBookAppoint()).click();	
		
	
	}
	
	@Test (groups ="regression")
	public void createAndValiDateHistory() throws IOException, InterruptedException {
	
		LoginTest.executeLogin();
		List<String[]> data = Arrays.asList(
				new String[] {"22/04/2026", "Need to Show a Dentist for Cavities"}, new String[] {"23/04/2026", "Need to visit a physician"});
		
		
		for (String[] entry : data) {
			CreateNewAppointment (entry[0], entry[1]);	
			Thread.sleep(4000);
			driver.findElement(BookedAppointmentPage.ClickHomePage()).click();
		}
		
		driver.findElement(LoginPage.ClickHamburgerMenu()).click();
		driver.findElement(BookedAppointmentPage.ClickHistory()).click();
		Thread.sleep(5000);
		
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='panel panel-info']"));
		int x =li.size();
		Assert.assertEquals(x, 2);
		
		List<WebElement> li2 = driver.findElements(By.xpath("//p[@id='comment']"));

		for (int i=0; i<li2.size(); i++) {
			
		String actualDesc = li2.get(i).getText();
		String expecteddes = data.get(i)[1];
		System.out.println("Actual: " + actualDesc);
	    System.out.println("Expected: " + expecteddes);

				Assert.assertEquals(actualDesc,expecteddes,"Description Mismatch" +i);
		}
	}
	

}
