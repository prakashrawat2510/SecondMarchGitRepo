package StepDefination1;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import PageRepository.LoginPage;
import PageRepository.LogoutfromApp;
import PageRepository.NewCustomerAccount;
import PageRepository.NewCustomerPage;
import PageRepository.NewCustomerfromDataTable;
import Utilities.BaseClass;
import Utilities.FetchDataFromExcel;
import Utilities.StoreAccountIDOnExcel;
import Utilities.StoreCustIDOnExcel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDenination1 extends BaseClass {
	
	
	WebDriver driver=BaseClass.intializeDriver();
	LoginPage obj = new LoginPage (driver);
	NewCustomerPage obj1 = new NewCustomerPage (driver);
	NewCustomerfromDataTable obj2= new NewCustomerfromDataTable (driver);
	NewCustomerAccount obj3 = new NewCustomerAccount(driver);
	LogoutfromApp obj4= new LogoutfromApp (driver);
	
	@Given("user open the browser URL")
	public void user_open_the_browser_url() {
		
		getTitle();
	}

	@Given("user enter the username {string}")
	public void user_enter_the_username(String uname) {
		
		obj.enterUserName(uname);
	   
	}

	@Given("user enter the password {string}")
	public void user_enter_the_password(String password) {
	   
		obj.enterPassword(password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	    
		obj.clickLogin();
	}

	@Then("validate that user navigate to homepage of the application")
	public void validate_that_user_navigate_to_homepage_of_the_application() {
		
		String URL1= getCurrentURL();
		if(URL1.contains("homepage"))
		{
		System.out.println("User navigate to correct page");
		}else {
			throw new NullPointerException("Page navigation not successfull");
			
		}
	 
	}
	
	
	@Given("user is on the homepage of the application")
	public void user_is_on_the_homepage_of_the_application() {
		getTitle();
	}

	@Given("user click on New Customer link")
	public void user_click_on_new_customer_link() {
	    
		obj1.ClickNewCustomer();
	}

	@Given("user enters the customer name as {string}")
	public void user_enters_the_customer_name_as(String cust_name) {
		
		obj1.enterCustName(cust_name);
	    
	}

	@Given("user selects gender")
	public void user_selects_gender() {
	    obj1.selectGender();
	}

	@Given("user enters dat of birth as {string}")
	public void user_enters_dat_of_birth_as(String dob) {
	   obj1.enterDoB(dob);
	}
	
	
	@Given("user enters address as {string}")
	public void user_enters_address_as(String address) {
		obj1.enterAddress(address);
	   
	}


	@Given("user enters city as {string}")
	public void user_enters_city_as(String city) {
	    obj1.enterCity(city);
	}

	@Given("user enters state as {string}")
	public void user_enters_state_as(String state) {
	    obj1.enterState(state);
	}
	
	@Given("user enters pin as {string}")
	public void user_enters_pin_as(String pin) {
	    obj1.enterPin(pin);
	}

	@Given("user enters mobile as {string}")
	public void user_enters_mobile_as(String mobile) {
	    obj1.enterMobile(mobile);
	}

	@Given("user enters email as emailAddress")
	public void user_enters_email_as_email_address() {
		obj1.enterEmail(getEmail());
	   
	}

	@Given("user enters password as {string}")
	public void user_enters_password_as(String password) {
	    obj1.enterPassword(password);
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
	    obj1.ClickSubmit();
	}

	@Then("a new customer will be created")
	public void a_new_customer_will_be_created() {
		
		String URL2= getCurrentURL();
		if(URL2.contains("CustomerReg"))
		{
		System.out.println("Customer Registered Successfully!!!");
		}else {
			throw new NullPointerException("Customer not Registered");
			
		}
	    
	}

	@Then("user captures the customer id")
	public void user_captures_the_customer_id() throws IOException {
	    
 	String custID = obj1.getCustomerId();
 	System.out.println("CustID is :"+  custID);
		
 	StoreCustIDOnExcel.storeCustID(1, 0, custID);
		
	}
	
	@Then("user closes the browser")
	public void user_closes_the_browser() throws InterruptedException {
	   
		CloseBrowser();
	}
	
	
	@Given("enter the below mandatory fields")
	public void enter_the_below_mandatory_fields(io.cucumber.datatable.DataTable userdata) {
	    
		List<List<String>> data= userdata.asLists(String.class);
		

	    String email = data.get(1).get(7);

	  
	    if(email.equalsIgnoreCase("randomEmail")) {
	        email = BaseClass.getEmail();
	    }
		
		
		obj2.fillCustomerForm(data.get(1).get(0),data.get(1).get(1), data.get(1).get(2), data.get(1).get(3), data.get(1).get(4), data.get(1).get(5), data.get(1).get(6), email, data.get(1).get(8));
		
		
	}
	
	
	
	@Given("user click on New Account link")
	public void user_click_on_new_account_link() {
	   obj3.ClickNewAccount();
	}

	@Given("user enter Customer id")
	public void user_enter_customer_id() throws IOException {
		
	//	driver.get(FetchDataFromExcel.FetchCustomerIDFromExcel(1, 0));
	    
	String CustID1 = FetchDataFromExcel.FetchCustomerIDFromExcel(1, 0);
		  System.out.println("Fetched CustID: " + CustID1);

		    obj3.CustomerID(CustID1);
		}

	@Given("user enter Initial deposit as {string}")
	public void user_enter_initial_deposit_as(String deposit) {
	   obj3.InDeposit(deposit);
	}
	
	@When("user click on Account submit button")
	public void user_click_on_account_submit_button() {
	   obj3.ClickAccountSubmit();
	}


	@Then("a new Account will be created")
	public void a_new_account_will_be_created() {
	  
		String URL3= getCurrentURL();
		if(URL3.contains("AccCreate"))
		{
		System.out.println("Account Generated Successfully!!!");
		}else {
			throw new NullPointerException("Account not Generated");
			
		}
		
	}

	@Then("user captures the Account id")
	public void user_captures_the_account_id() throws IOException {
		
		String AccountID = obj3.getAccountID();
	 	System.out.println("AccountID is :"+  AccountID);
			
	 	StoreAccountIDOnExcel.storeAccID(1, 0, AccountID);
	}


	

	@When("user clicks on logout link")
	public void user_clicks_on_logout_link() throws InterruptedException {
	//	scrollPage();
		
	//	Thread.sleep(2000);
		obj4.ClickLogout();
	//	Thread.sleep(2000);
     driver.switchTo().alert().accept();
	   
		
		
	}

	@Then("user should be redirected to login page")
	public void user_should_be_redirected_to_login_page() {
	    
	//	String actualTitle = driver.getTitle();
		
		String titile = driver.getTitle();
		
		System.out.println(titile);
	
	}

	

}
