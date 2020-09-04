package com.cts.pages;


	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Loginpage {
		private static By emailLoc = By.xpath("//*[@id=\"email\"]");
		private static By passwordLoc = By.id("passwd");
		
		private static By signupLoc = By.xpath(" //*[@id=\"SubmitLogin\"]/span/i");
		private static By linkLoc = By.xpath("//div[@class='error-copy']/a/img");
		
		public static void enterEmail(WebDriver driver, String login)
		{
			driver.findElement(emailLoc).sendKeys(login);
		}
		public static void enterPassword(WebDriver driver, String password)
		{
			driver.findElement(passwordLoc).sendKeys(password);
		}
		public static void clickSignin(WebDriver driver)
		{
		
			WebElement sign = driver.findElement(signupLoc);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()",sign);
		}
		
		public static void clickOnLink(WebDriver driver)
		{
		     WebDriverWait wait=new WebDriverWait(driver, 50);
		     wait.until(ExpectedConditions.visibilityOfElementLocated(linkLoc)).click();
			   
		}
		public static String assertText(WebDriver driver)
		{
			 String title=driver.getTitle();
			 String expectedtitle = "Meet Guru99 - Free Training Tutorials & Video for IT Courses";
			   Assert.assertEquals(expectedtitle,title);
			   System.out.println(title);
			   return title;
		}
	}




