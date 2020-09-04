package com.cts.pages;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Homepages {
		private static By paymentLoc = By.linkText("Payment Gateway Project");
		private static By seleniumLoc = By.xpath("//a[contains(@class,'dropdown-toggle')]");
		private static By framLoc = By.id("flow_close_btn_iframe");
		private static By closButLoc = By.id("closeBtn");
		private static By loginLoc = By.linkText("Login");
		private static By securityLoc = By.linkText("Security Project");
		private static By useridLoc = By.name("uid");
		private static By passLoc = By.xpath("//input[@type='password']");
		private static By resetLoc = By.name("btnReset");
		
		public static void clickOnPaymentGate(WebDriver driver)
		{
			//driver.findElement(paymentLoc).click();
			WebDriverWait wait=new WebDriverWait(driver, 50);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(paymentLoc)).click();
		}
		
		public static void seleniumOption(WebDriver driver)
		{
			
			WebDriverWait wait=new WebDriverWait(driver, 50);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(seleniumLoc)).click();
		}
		
		public static void switchFram(WebDriver driver)
		{
			driver.switchTo().frame(driver.findElement(framLoc));  
		}
		public static void clickOnClos(WebDriver driver)
		{
			WebDriverWait wait=new WebDriverWait(driver, 50);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(closButLoc)).click();
			  driver.switchTo().defaultContent(); // Return to main window
		}
		public static void clickLogin(WebDriver driver)
		{
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(loginLoc)).click().build().perform();;
			
		}
		public static void clickOnSecurityProject(WebDriver driver)
		{
			driver.findElement(securityLoc).click();
		}
		public static void enterUserid(WebDriver driver,String userrid)
		{
			//driver.findElement(firstnameLoc).clear();
			driver.findElement(useridLoc).sendKeys( userrid);
		}
		public static void enterPasswrd(WebDriver driver,String passwrd)
		{
			//driver.findElement(lastnameLoc).clear();
			driver.findElement(passLoc).sendKeys(passwrd);
		}
		
		public static void clickOnReset(WebDriver driver)
		{
			driver.findElement(resetLoc).click();
		}
		

		
	}




