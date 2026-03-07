package PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class NewCustomerAccount extends BaseClass {
	
	WebDriver driver;
	
	public NewCustomerAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath ="//a[text()='New Account']")
	WebElement Cust_Accnt;
	
	@FindBy(xpath ="//input[@name='cusid']")
	WebElement Cust_ID;
	
	@FindBy(xpath ="//input[@name='inideposit']")
	WebElement Deposit;
	
	@FindBy(xpath ="//input[@type='submit']")
	WebElement Submit;
	
	@FindBy(xpath="//table[@id='account']/tbody/tr[4]/td[2]")
	WebElement AccountID;
	
	
	public void ClickNewAccount () {
		Cust_Accnt.click();
	}
	
	public void CustomerID (String idnumber) {
		Cust_ID.sendKeys(idnumber);
	}
	
	public void InDeposit (String deposit) {
		Deposit.sendKeys(deposit);
	}
	
	public void ClickAccountSubmit () {
		Submit.click();
	}
	
	public String getAccountID() {
	    return AccountID.getText();
	}
	

}
