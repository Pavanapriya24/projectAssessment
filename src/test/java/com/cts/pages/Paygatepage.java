package com.cts.pages;


	import org.junit.Assert;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Paygatepage {
		

	private static By quantityLoc = By.name("quantity");
	private static By buyLoc = By.xpath("//input[@type='submit']");
	private static By cardLoc =  By.id("card_nmuber");
	private static By monthLoc =  By.id("month");
	private static By yearLoc =  By.id("year");
	private static By cvvLoc = By.id("cvv_code");
	private static By frameLoc = By.id("flow_close_btn_iframe");
	private static By closeButLoc = By.id("closeBtn");	
	private static By payLoc = By.xpath("//*[@id=\"three\"]/div/form/div[2]/div/ul/li/input");
	private static By orderLoc = By.xpath("//h2[contains(text(),'Payment successfull!')]");
	private static By creditLoc = By.linkText("Check Credit Card Limit");
	private static By numLoc = By.xpath("//*[@id='card_nmuber']");
	private static By subLoc = By.name("submit");
	private static By detailsLoc = By.xpath("//*[@id='three']/div/div/h4");
	private static By tableLoc = By.xpath("//table[@class='alt']");


		
		public static void clickOnQuantity(WebDriver driver, String quantity)
		{
		Select value = new Select(driver.findElement(quantityLoc));
		value.selectByValue(quantity);
		
		}
		public static void clickOnBuy(WebDriver driver)
		{
			driver.findElement(buyLoc).click();
		}
		public static void enterCardnum(WebDriver driver,String cardnumber)
		{
			 driver.findElement(cardLoc).sendKeys(cardnumber);
		}
		 
		public static void clickonMonth(WebDriver driver,String month)
		{
			 Select months = new Select(driver.findElement(monthLoc));
				months.selectByValue(month);
		}
		public static void clickOnYear(WebDriver driver,String year)
		{
			
			Select years = new Select(driver.findElement(yearLoc));
			years.selectByValue(year);
		}
		public static void enterCvv(WebDriver driver,String cvv)
		{
			driver.findElement(cvvLoc).sendKeys(cvv);
		}
		
		public static void switchFrame(WebDriver driver)
		{
			driver.switchTo().frame(driver.findElement(frameLoc));  
		}
		public static void clickOnClose(WebDriver driver)
		{
			WebDriverWait wait=new WebDriverWait(driver, 50);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(closeButLoc)).click();
			  driver.switchTo().defaultContent();
		}
		public static void clickPay(WebDriver driver)
		{
			 driver.findElement(payLoc).click();
				
		}
		   
		public static  String orderPlaced(WebDriver driver)
		{
			 String msg=driver.findElement(orderLoc).getText();
		
		return msg;
		}
		public static void clickAlert(WebDriver driver)
		{
			 Alert alerts=driver.switchTo().alert();
				String alertMess=driver.switchTo().alert().getText();
				System.out.println(alertMess); 
			   driver.switchTo().alert().accept();
		}
		
		public static void clickCredit(WebDriver driver)
		{
			 driver.findElement(creditLoc).click();
				
		}
		public static void enterNumber(WebDriver driver,String card)
		{
			driver.findElement(numLoc).sendKeys(card);
				
		}

		public static void clickSubmit(WebDriver driver)
		{
			 driver.findElement(subLoc).click();
				
		}
		
		public static  String cardDetails(WebDriver driver)
		{
			 String details=driver.findElement(detailsLoc).getText();
		
		return details;
		}

		public static  String tableDetails(WebDriver driver)
		{
			 String tabledet=driver.findElement(tableLoc).getText();
			 System.out.println(tabledet);
		
		return tabledet;
		}
		public static  void checkAlert(WebDriver driver)
		{
			 
			String pageSource = driver.getPageSource();
			boolean check = pageSource.contains("Check");
			Assert.assertTrue("Not Passed", check);
			System.out.println("then");
		}
		
	}


