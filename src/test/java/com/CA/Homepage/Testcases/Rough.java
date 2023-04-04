package com.CA.Homepage.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.CA.Homepage.Homepage;
import com.CA.base.Page;

public class Rough  extends Page {
	
	
	
	@Test
	public void VerifyHomebelowLinkTest() throws InterruptedException {
		WebElement b=driver.findElement(By.xpath("//*[@id=\"WBBL\"]"));
		b.click();
		Thread.sleep(3000);
		WebElement a=driver.findElement(By.xpath("//*[@id=\"bbl-detail\"]/div/div/div[1]/div/div[2]/div/a"));
	   a.click();  //*[@id="wbbl-detail"]/div/div/div[1]/div/div[2]/div/a
	}

}//*[@id="wbbl-detail"]/div/div/div[3]/div/div[2]/div/a
