package com.cts.pages;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Dashboardpage {
	
	
	public static By clickonnewtourLoc=By.linkText("New Tours");

	public static By clickonregisterLoc=By.linkText("REGISTER");

	public static By enterfirstNameLoc=By.xpath("//input[@name='firstName']");

	public static By enterlastnameLoc=By.xpath("//input[@name='lastName']");

	public static By enterphonenoLoc=By.xpath("//input[@name='phone']");

	public static By enterEmailLoc=By.xpath("//input[@id='userName']");

	public static By enteraddressLoc=By.xpath("//input[@name='address1']");

	public static By entercityLoc=By.xpath("//input[@name='city']");

	public static By enterstateLoc=By.xpath("//input[@name='state']");

	public static By enterpostalcodeLoc=By.xpath("//input[@name='postalCode']");
	
	public static By selectCountryLoc=By.name("country");
	
	public static By enteruserNameLoc=By.id("email");
	
	public static By enterpasswordLoc=By.xpath("//input[@name='password']");
	
	public static By enterconfirmpasswordLoc=By.xpath("//input[@name='confirmPassword']");
	
	public static By clickonsubmitLoc=By.xpath("//input[@type='submit']");
	
	
	
	
	public static By clickonflightLoc=By.linkText("Flights");
	
	public static By clickononewayLoc=By.xpath("//input[@value='oneway']");
	
	public static By passengercountLoc=By.xpath("(//select[@name='passCount']/option)[3]");
	
	public static By departureLoc=By.xpath("(//select[@name='fromPort']/option)[5]");
	
	public static By selectmonthLoc=By.xpath("(//select[@name='fromMonth']/option)[4]");

	public static By selectdateLoc=By.xpath("(//select[@name='fromDay']/option)[8]");
	
	public static By selectarriveLoc=By.xpath("(//select[@name='toPort']/option)[8]");
	
	public static By selectreturnmonthLoc=By.xpath("(//select[@name='toMonth']/option)[11]");
	
	public static By selectreturndateLoc=By.xpath("(//select[@name='toDay']/option)[11]");
	
	public static By selectclassLoc=By.xpath("//input[@name='servClass']");
	
	public static By selectairlineLoc=By.xpath("//select[@name='airline']/option");
	
	public static By selectcontinueLoc=By.xpath("//input[@type='image']");
	
	public static By gettextmessageLoc=By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/p/font/b/font[1]");

	
	

    public static By clickontelecomLoc=By.linkText("Telecom Project");
	
    public static By clickonbankprojectLoc=By.linkText("Bank Project");
   
  	public static  By clickonbankproject1Loc=By.linkText("Bank Project V1");
	
  	public static By clickonseleniumLoc=By.xpath("//a[@class='dropdown-toggle']");
  	
  	public static By clickonradiodemoLoc=By.linkText("Radio & Checkbox Demo");
  	
  	
  	
  	
  	
  	
  	
	public static void clickonnewtours(WebDriver driver)
	{
		Actions action = new Actions(driver); 
		action.moveToElement(driver.findElement(clickonnewtourLoc)).click().build().perform();
		
	}
	
	
    public static void clickonregister(WebDriver driver)
    {
    	driver.findElement(clickonregisterLoc).click();
    }
    
    public static void enterfirstName(WebDriver driver, String firstName)
    {
    	driver.findElement(enterfirstNameLoc).sendKeys(firstName);
    }
    
    public static void enterlastName(WebDriver driver,String lastName)
    {
    	driver.findElement(enterlastnameLoc).sendKeys(lastName);
    }
    
    public static void enterphoneno(WebDriver driver,String phoneNo)
    {
    	driver.findElement(enterphonenoLoc).sendKeys(phoneNo);
    }
    
    public static void enterEmail(WebDriver driver,String Email)
    {
    	driver.findElement(enterEmailLoc).sendKeys(Email);
    }
   
    public static void enteraddress(WebDriver driver,String address)
    {
    	driver.findElement(enteraddressLoc).sendKeys(address);
    }
    
    public static void entercity(WebDriver driver,String city)
    {
    	driver.findElement(entercityLoc).sendKeys(city);
    }
    
    public static void enterstate(WebDriver driver,String state)
    {
    	driver.findElement(enterstateLoc).sendKeys(state);
    }
    
    public static void enterpostalcode(WebDriver driver,String postalcode)
    {
    	driver.findElement(enterpostalcodeLoc).sendKeys(postalcode);
    }
    
    public static void selectcountry(WebDriver driver)
    {
    	Select dropdown = new Select(driver.findElement(selectCountryLoc));
        dropdown.selectByVisibleText("INDIA");
    	
    }
   
    public static void enteruserName(WebDriver driver,String userName)
    {
    	driver.findElement(enteruserNameLoc).sendKeys(userName); 
    }
   
    public static void enterpassword(WebDriver driver,String password)
    {
    	driver.findElement(enterpasswordLoc).sendKeys(password);
    }	
  
    public static void enterconfirmpassword(WebDriver driver,String confirmpassword)
    {
    	driver.findElement(enterconfirmpasswordLoc).sendKeys(confirmpassword);
    }
   
    public static void clickonsubmit(WebDriver driver)
    {
    	WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(clickonsubmitLoc)).click();
    	
    }
    public static void screenshot(WebDriver driver)
    {
    	 Date date = new Date();
 		String dateStr = date.toString().replace(":", "-");
 		
 		TakesScreenshot screenshot = (TakesScreenshot) driver;
 		
 		File file = screenshot.getScreenshotAs(OutputType.FILE);
 		
 		file.renameTo(new File("src/test/resources/screenshot" + dateStr + ".png"));
 	}

    
    
    
   
    
    public static void clickonflight(WebDriver driver)
	{
		driver.findElement(clickonflightLoc).click();
	}
	
	public static void clickononeway(WebDriver driver)
	{
		driver.findElement(clickononewayLoc).click();
	}
	
	public static void clickonpassengercount(WebDriver driver)
	{
		driver.findElement(passengercountLoc).click();
	}
	
	public static void departure(WebDriver driver)
	{
		driver.findElement(departureLoc).click();
	}
	
	public static void selectmonth(WebDriver driver)
	{
		driver.findElement(selectmonthLoc).click();
	}
	
	public static void selectdate(WebDriver driver)
	{
		driver.findElement(selectdateLoc).click();
	}
	
	public static void selectarrival(WebDriver driver)
	{
		driver.findElement(selectarriveLoc).click();
	}
	
	public static void returnmonth(WebDriver driver)
	{
		driver.findElement(selectreturnmonthLoc).click();
	}
	
	public static void returndate(WebDriver driver)
	{
		driver.findElement(selectreturndateLoc).click();
	}
	
	public static void selectclass(WebDriver driver)
	{
		driver.findElement(selectclassLoc).click();
	}
	
	public static void selectairline(WebDriver driver)
	{
		driver.findElement(selectairlineLoc).click();
	}
	
	public static void selectcontinue(WebDriver driver)
	{
		driver.findElement(selectcontinueLoc).click();
	}
	
	public static void getextmessage(WebDriver driver)
	{
		String data=driver.findElement(gettextmessageLoc).getText();
		System.out.println(data);
		
	}
	
	
	/*click on telecom project*/
	public static void clickontelecom(WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(clickontelecomLoc)).click().build().perform();
		
	}
	
	public static void clickonbankproject(WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(clickonbankprojectLoc)).click().build().perform();
		
	}
	
	public static void clickonbankproject1(WebDriver driver)
	{
		driver.findElement(clickonbankproject1Loc).click();
	}
	
	public static void clickonselenium(WebDriver driver)
	{
		driver.findElement(clickonseleniumLoc).click();
	}
	
	public static void clickonradiobutton(WebDriver driver)
	{
		driver.findElement(clickonradiodemoLoc).click();
	}
	
	
	
}
