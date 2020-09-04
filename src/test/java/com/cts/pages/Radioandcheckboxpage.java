package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radioandcheckboxpage {
	
	
	public static By clickonradioLoc=By.id("vfb-7-1");
	
	
	public static By clickoncheckbox1Loc=By.id("vfb-6-0");
	public static By clickoncheckbox2Loc=By.id("vfb-6-2");
			
	
	public static void clickonradio(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(clickonradioLoc));
		driver.findElement(clickonradioLoc).click();
	}

	public static void clickoncheckbox(WebDriver driver)
	{
		driver.findElement(clickoncheckbox1Loc).click();
	}
	public static void clickoncheckbox1(WebDriver driver)
	{
		driver.findElement(clickoncheckbox2Loc).click();
	}

}
