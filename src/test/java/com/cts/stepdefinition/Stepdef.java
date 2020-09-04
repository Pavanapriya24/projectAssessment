package com.cts.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cts.excel.ReadExcel;
import com.cts.pages.Dashboardpage;
import com.cts.pages.Homepage;
import com.cts.pages.Homepages;
import com.cts.pages.Loginpage;
import com.cts.pages.Paygatepage;
import com.cts.pages.Radioandcheckboxpage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class Stepdef {
	public WebDriver driver;
	
	@Before
	public void start()
	{
	System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
	
	 driver=new ChromeDriver();

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable.extensions");
	options.setExperimentalOption("useAutomationExtension",false);
	

	}
	@After
	public void end()
	{
		
		
		driver.quit();
	}
	/*
	 * open the browser
	 */
	
	
	@Given("^an application to lauch the browser$")
	public void an_application_to_lauch_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		
//	     driver=new ChromeDriver();
//	     driver.manage().window().maximize();
//	     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	     driver.get("http://www.demo.guru99.com/V4/manager/Managerhomepage.php");
//	     ChromeOptions options=new ChromeOptions();
//	     options.addArguments("--disable.extensions");
//		 options.setExperimentalOption("useAutomationExtension",false);
	   
	    
	}
	
	
	
	
	/*
	 * click on new tours
	 */

	@When("^the user clicks on new tours$")
	public void the_user_clicks_on_new_tours() throws Throwable {
		Dashboardpage.clickonnewtours(driver);
	}

	@When("^click on register$")
	public void click_on_register() throws Throwable {
	   Dashboardpage.clickonregister(driver);
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and_and_and_and_and_and_and_and(String firstName, String lastName, String phoneNo, String Email, String address, String city, String state, String postalcode, String country) throws Throwable
	{
	   Dashboardpage.enterfirstName(driver, firstName); 
	   Dashboardpage.enterlastName(driver, lastName);
	   Dashboardpage.enterphoneno(driver, phoneNo);
	   Dashboardpage.enterEmail(driver, Email);
	   Dashboardpage.enteraddress(driver, address);
	   Dashboardpage.entercity(driver, city);
	   Dashboardpage.enterstate(driver, state);
	   Dashboardpage.enterpostalcode(driver, postalcode);
	   Dashboardpage.selectcountry(driver);
	   
	}
	@When("^\"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void and_and(String userName, String password, String confirmpassword) throws Throwable {
	    Dashboardpage.enteruserName(driver, userName);
	    Dashboardpage.enterpassword(driver, confirmpassword);
	    Dashboardpage.enterconfirmpassword(driver, confirmpassword);
	}

	@When("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
	    Dashboardpage.clickonsubmit(driver);
	}

	@Then("^it will get registed$")
	public void it_will_get_registed() throws Throwable {
	   Dashboardpage.screenshot(driver); 
	   driver.quit();
	}


	

	/*
	 * click on new tours and select flights
	 */
	

	@When("^user clicks on new tours$")
	public void user_clicks_on_new_tours() throws Throwable {
	    Dashboardpage.clickonnewtours(driver);
	}

	@When("^click on flights$")
	public void click_on_flights() throws Throwable {
		 Dashboardpage.clickonflight(driver);
	}

	@When("^select the data$")
	public void select_the_data() throws Throwable {
	    Dashboardpage.clickononeway(driver);
	    Dashboardpage.clickonpassengercount(driver);
	    Dashboardpage.departure(driver);
	    Dashboardpage.selectmonth(driver);
	    Dashboardpage.selectdate(driver);
	    Dashboardpage.selectarrival(driver);
	    Dashboardpage.returnmonth(driver);
	    Dashboardpage.returndate(driver);
	    Dashboardpage.selectclass(driver);
	    Dashboardpage.selectairline(driver);
	    
	    
	}

	@When("^click on search$")
	public void click_on_search() throws Throwable {
		Dashboardpage.selectcontinue(driver);
	}

	@Then("^we will get data$")
	public void we_will_get_data() throws Throwable {
		Dashboardpage.getextmessage(driver);
		driver.quit();
	}


	

	/*
	 * click on telecom project and add new customer
	 */
	
	@When("^the user clicks on telecom project$")
	public void the_user_clicks_on_telecom_project() throws Throwable {
		Homepage.clickontelecomproject(driver);
	}

	@When("^click on new customer$")
	public void click_on_new_customer() throws Throwable {
	    Homepage.addnewcustomer(driver);
	}

	@When("^enter the \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_and_and_and_and(String firstnamedata, String lastnamedata, String emaildata, String addr, String number) throws Throwable {
	    Homepage.enterfirst(driver, firstnamedata);
	    Homepage.enterlast(driver, lastnamedata);
	    Homepage.enterEmail(driver, emaildata);
	    Homepage.enteraddr(driver, addr);
	    Homepage.entermobilenumber(driver, number);
	    
	}
	@When("^click  submit button$")
	public void click_submit_button() throws Throwable {
	    Homepage.clicksubmit(driver);
	}


	@Then("^we will get a customer id$")
	public void we_will_get_a_customer_id() throws Throwable {
	    Homepage.getmessage(driver);
	    driver.quit();
	}
	/*
	 * click on bank project 
	 */
	
	@When("^the user clicks on bank project$")
	public void the_user_clicks_on_bank_project() throws Throwable {
	    Dashboardpage.clickonbankproject(driver);
	    Dashboardpage.clickonbankproject1(driver);
	}

	@When("^I enter the data from Excel \"([^\"]*)\" with SheetName \"([^\"]*)\"$")
	public void i_enter_the_data_from_Excel_with_SheetName(String fileDetails, String sheetName) throws Throwable {
		String str[][] = ReadExcel.getSheetIntoStringArray("src/test/resources/Excelguru.xlsx",
				"InvalidData");
		
		Homepage.enterusername(driver, str[0][0]);
		Homepage.enterpassword(driver, str[0][1]);
		Homepage.clickonlogin(driver);
		Homepage.clickonlogin(driver);
	}

	@Then("^alert message should be displayed$")
	public void alert_message_should_be_displayed() throws Throwable {
		Homepage.Alert(driver);
		driver.quit();
	    
	}

	

/*
 * check radio and checkbox buttons
 */



@When("the user clicks on selenium")
public void the_user_clicks_on_selenium() {
	Dashboardpage.clickonselenium(driver);
}
@When("click on radio demo")
public void click_on_radio_demo() {
    Dashboardpage.clickonradiobutton(driver);
}
@Then("click the radio button")
public void click_the_radio_button() {
    Radioandcheckboxpage.clickonradio(driver);
}
@Then("click on check box")
public void click_on_check_box() {
    Radioandcheckboxpage.clickoncheckbox(driver);
    Radioandcheckboxpage.clickoncheckbox1(driver);
  
}
@When("^I click on Payment Gateway project  browser navigate to the page$")
public void i_click_on_Payment_Gateway_project_browser_navigate_to_the_page() throws Throwable {
	Homepages.clickOnPaymentGate(driver);
}

@When("^I click on number of items \"([^\"]*)\" and click on buy and browser  navigate to the payment process page$")
public void i_click_on_number_of_items_and_click_on_buy_and_browser_navigate_to_the_payment_process_page(String quantity) throws Throwable {
	Paygatepage.clickOnQuantity(driver,quantity);
	
	Paygatepage.clickOnBuy(driver);
}

@When("^I  enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_enter_and_and_and(String cardnumber, String month, String year, String cvv) throws Throwable {
	Paygatepage.enterCardnum(driver, cardnumber);

	Paygatepage.clickonMonth(driver,month);
		
	Paygatepage.clickOnYear(driver,year);
		
	Paygatepage.enterCvv(driver, cvv);
	}
	
		
		


@When("^I click on the place order$")
public void i_click_on_the_place_order() throws Throwable {
	
	Paygatepage.clickPay(driver);
}
/*
 * method to get screenshot
 */
@Then("^I should get the message as orderplaced$")
public void i_should_get_the_message_as_orderplaced() throws Throwable {
	
  Date date = new Date();
	String dateStr = date.toString().replace(":", "-");
	
	TakesScreenshot screenshot = (TakesScreenshot) driver;
	
	File file = screenshot.getScreenshotAs(OutputType.FILE);
	
	file.renameTo(new File("src/test/resources/screenshot" + dateStr + ".png"));
}

@When("^I click on Payment Gateway project  browser navigate to  page$")
public void i_click_on_Payment_Gateway_project_browser_navigate_to_page() throws Throwable {
	Homepages.clickOnPaymentGate(driver);
}

@When("^I click on the number of items \"([^\"]*)\" and click  buy and browser  navigate to the payment process page$")
public void i_click_on_the_number_of_items_and_click_buy_and_browser_navigate_to_the_payment_process_page(String quantity) throws Throwable {

	Paygatepage.clickOnQuantity(driver,quantity);

	Paygatepage.clickOnBuy(driver);
}

@When("^I  enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and with some details blank$")
public void i_enter_and_and_and_and_with_some_details_blank(String cardnumber, String month, String year, String cvv) throws Throwable {
	Paygatepage.enterCardnum(driver, cardnumber);
	
	
	Paygatepage.clickonMonth(driver,month);
		
	Paygatepage.clickOnYear(driver,year);
		
	Paygatepage.enterCvv(driver, cvv);
	

}

@When("^I click on  place order$")
public void i_click_on_place_order() throws Throwable {
Paygatepage.clickPay(driver);
	
	Paygatepage.clickAlert(driver);//--------------
	
}

@Then("^I should get error message\\.$")
public void i_should_get_error_message() throws Throwable {

	Paygatepage.checkAlert(driver);
}

@When("^I click on the credit card limit and enter the \"([^\"]*)\"$")
public void i_click_on_the_credit_card_limit_and_enter_the(String card) throws Throwable {
Homepages.clickOnPaymentGate(driver);
	
	Paygatepage.clickCredit(driver);
	
	Paygatepage.enterNumber(driver, card);
}

@When("^I click on submit$")
public void i_click_on_submit() throws Throwable {
	Paygatepage.clickSubmit(driver);
}

@Then("^It should  navigate to the required page and  data should display\\.$")
public void it_should_navigate_to_the_required_page_and_data_should_display() throws Throwable {
	Paygatepage.cardDetails(driver);//----------------------
	Paygatepage.tableDetails(driver);//---
}

@When("^I click selenium dropdown appears$")
public void i_click_selenium_dropdown_appears() throws Throwable {
	Dashboardpage.clickonselenium(driver);
}

@When("^I click on login$")
public void i_click_on_login() throws Throwable {
	
	Homepages.clickLogin(driver);
}

@When("^I enter login details from Excel \"([^\"]*)\" with SheetName \"([^\"]*)\"$")
public void i_enter_login_details_from_Excel_with_SheetName( String fileDetails,String sheetName) throws Throwable {
	String str[][] =ReadExcel.getSheetIntoStringArray("src/test/resources/resources/login.xlsx",
			"Login");
	
Loginpage.enterEmail(driver, str[0][0]);

Loginpage.enterPassword(driver, str[0][1]);
}

@When("^I click on signin$")
public void i_click_on_signin() throws Throwable {
	Loginpage.clickSignin(driver);
}

@When("^click on icon link$")
public void click_on_icon_link() throws Throwable {
	Loginpage.clickOnLink(driver);
}

@Then("^Required page should displayed$")
public void required_page_should_displayed() throws Throwable {
	Loginpage.assertText(driver);//------------------
}

@When("^I click on security project$")
public void i_click_on_security_project() throws Throwable {
	Homepages.clickOnSecurityProject(driver);
}

@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_enter_and(String Userid, String Password) throws Throwable {
Homepages.enterUserid(driver,Userid);
	
	Homepages.enterPasswrd(driver,Password);
}

@When("^I click on reset$")
public void i_click_on_reset() throws Throwable {
	 Homepages.clickOnReset(driver);
}

@Then("^It should clear the details$")
public void it_should_clear_the_details() throws Throwable {
	  Date date = new Date();
		String dateStr = date.toString().replace(":", "-");
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		
		file.renameTo(new File("src/test/resources/screenshot" + dateStr + ".png"));
	
}


}