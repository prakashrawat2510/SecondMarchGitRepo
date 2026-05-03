package PageClasses;

import org.openqa.selenium.By;

public class CreateNewAppointmentPage {

	
	
	public static By SelectFacility() {
		return By.xpath("//select[@id='combo_facility']");
	}
	
	public static By EnterDate() {
		return By.xpath("//input[@id='txt_visit_date']");
	}
	
	public static By EnterComment() {
		return By.xpath("//textarea[@id='txt_comment']");
		
	}
	
	public static By ClickBookAppoint() {
		return By.xpath("//button[@id='btn-book-appointment']");
		
	}
	
	public static By validAppoint() {
		return By.xpath("//h2[text()='Appointment Confirmation']");
		
	}
	
	public static By validMessage() {
		return By.xpath("//p[contains(text(),'Please be ')]");
		
	}
	
}
