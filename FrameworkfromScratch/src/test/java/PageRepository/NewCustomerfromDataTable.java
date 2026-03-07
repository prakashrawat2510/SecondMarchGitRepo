package PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerfromDataTable {

	WebDriver driver;

	public NewCustomerfromDataTable(WebDriver driver) {
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

	public void fillCustomerForm(String name, String dob, String address, String city, String state, String pin,
			String mobile, String email, String password) {

		Cust_name.sendKeys(name);
		Gender.click();
		DOB.sendKeys(dob);
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		Pin.sendKeys(pin);
		Mobile.sendKeys(mobile);
		Email.sendKeys(email);
		Password.sendKeys(password);
	}

	public void ClickSubmit() {
		Submit.click();
	}

	public String getCustomerId() {
		return CustomerId.getText();
	}

}