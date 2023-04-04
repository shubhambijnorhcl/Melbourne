package com.CA.Community;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CA.base.Page;

public class CLeague extends Page {

	@FindBy(xpath="//*[@id=\"top-level-nav\"]/ul[1]/li[5]/a")
	public WebElement COMMUNITY;
	
	@FindBy(xpath="//*[@id=\"jQ-uid3\"]/li[1]")
	public WebElement Cleague;
	
	public CLeague() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void resultlink() throws InterruptedException{
	Actions aa= new Actions(driver);
	aa.moveToElement(COMMUNITY).build().perform();
	Thread.sleep(3000);
	aa.moveToElement(Cleague).click().build().perform();
	Thread.sleep(3000);
}
}