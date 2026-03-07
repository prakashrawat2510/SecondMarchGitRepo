package PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class NewCustomerPage extends BaseClass {
		
	
	WebDriver driver;
	
	public NewCustomerPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
		
	@FindBy(xpath = "//a[text()='New Customer']")
	WebElement Cust_click;

	@FindBy(xpath = "//input[@name='name']")
	WebElement Cust_name;

	@FindBy(xpath = "//input[@value='m']")
	WebElement Gender;
	
	@FindBy(xpath = "//input[@id='dob']")
	WebElement DOB;

	@FindBy(xpath = "//textarea[@name='addr']")
	WebElement Address;

	@FindBy(xpath = "//input[@name='city']")
	WebElement City;

	@FindBy(xpath = "//input[@name='state']")
	WebElement State;
	
	@FindBy(xpath = "//input[@name='pinno']")
	WebElement Pin;

	@FindBy(xpath = "//input[@name='telephoneno']")
	WebElement Mobile;

	@FindBy(xpath = "//input[@name='emailid']")
	WebElement Email;

	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement Submit;
	
	@FindBy(xpath = "//table[@id='customer']/tbody/tr[4]/td[2]")
	WebElement CustomerId;
	
	
	public void ClickNewCustomer() {
		Cust_click.click();
	}
	
	public void enterCustName(String Cname) {
		Cust_name.sendKeys(Cname);
	}
	
	public void selectGender() {
		Gender.click();
	}
	
	public void enterDoB(String dob) {
		DOB.sendKeys(dob);
	}
	public void enterAddress(String address) {
		Address.sendKeys(address);
	}
	public void enterCity(String city) {
		City.sendKeys(city);
	}
	public void enterState(String state) {
		State.sendKeys(state);
	}
	public void enterPin(String pin) {
		Pin.sendKeys(pin);
	}
	public void enterMobile(String mobile) {
		Mobile.sendKeys(mobile);
	}
	
	public void enterEmail(String email) {
		Email.sendKeys(email);
	}
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	
	public void ClickSubmit() {
		Submit.click();
	}
	
	public String getCustomerId() {
	    return CustomerId.getText();
	}
	

}
