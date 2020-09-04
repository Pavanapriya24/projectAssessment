package com.cts.pages;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Homepage {
	public static By clickontelecomLoc=By.linkText("Telecom Project");
	public static By clickonaddcustomerLoc =By.xpath("//a[text()='Add Customer']");
	public static By clickonpendingLoc=By.xpath("//label[text()='Pending']");
	public static By enterfirstLoc=By.xpath("//input[@id='fname']");
	public static By enterlastLoc=By.xpath("//input[@id='lname']");
	public static By enterEmailLoc=By.xpath("//input[@name='emailid']");
	public static By enteraddrLoc=By.xpath("//textarea[@name='addr']");
	public static By entermobileno=By.xpath("//input[@id='telephoneno']");
	public static By clickonsubmitLoc=By.xpath("//*[@id='main']/div/form/div/div[9]/ul/li[1]/input");
	public static By textmessageLocc=By.xpath("//h1[contains(text(),'Access Details to Guru99 Telecom')]");
    
	/*bankprojectlogin*/
	public static By enterusernameLoc=By.xpath("//input[@onkeyup='validateuserid();']");
	public static By enterpasswordLoc=By.xpath("//input[@name='password']");
    public static By clickonloginLoc=By.xpath("//input[@value='LOGIN']");
	
	
	
	public static void addnewcustomer(WebDriver driver)
	{
		//WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.presenceOfElementLocated(clickonaddcustomerLoc));
		driver.findElement(clickonaddcustomerLoc).click();
	}
	public static void clickonpending(WebDriver driver)
	{
		driver.findElement(clickonpendingLoc).click();
	}
	public static void enterfirst(WebDriver driver,String firstnamedata)
	{
		driver.findElement(enterfirstLoc).sendKeys(firstnamedata);
	}
	public static void enterlast(WebDriver driver,String lastnamedata )
	{
		driver.findElement(enterlastLoc).sendKeys(lastnamedata);
	}
	public static void enterEmail(WebDriver driver,String emaildata)
	{
		driver.findElement(enterEmailLoc).sendKeys(emaildata);
	}
	public static void enteraddr(WebDriver driver,String addr)
	{
		driver.findElement(enteraddrLoc).sendKeys(addr);
	}
	public static void entermobilenumber(WebDriver driver,String number)
	{
		driver.findElement(entermobileno).sendKeys(number);
	}
	public static void clicksubmit(WebDriver driver)
	{
		Actions action = new Actions(driver); 
		action.moveToElement(driver.findElement(clickonsubmitLoc)).click().build().perform();
		
	}
	public static void getmessage(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(textmessageLocc));
		String text=driver.findElement(textmessageLocc).getText();
		System.out.println(text);
		
	}
	
	public static void enterusername(WebDriver driver,String username1)
	{
		
		driver.findElement(enterusernameLoc).sendKeys(username1);
	}
	public static void enterpassword(WebDriver driver,String password1)
	{
		driver.findElement(enterpasswordLoc).sendKeys(password1);
	}
	public static void clickonlogin(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonloginLoc)).click();
		
		
	}
	public static void Alert(WebDriver driver)
	{
	
		Alert alert=driver.switchTo().alert();
		String alertmessage=driver.switchTo().alert().getText();
		   System.out.println(alertmessage);
		 
		   driver.switchTo().alert().accept();
	}


}
	
