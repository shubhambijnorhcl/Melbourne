package com.CA.Corporate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CA.base.Page;

public class Ourpartners extends Page {

	
	@FindBy(xpath="//*[@id=\"top-level-nav\"]/ul[1]/li[6]/a")
	public WebElement CORPORATE;
	
	@FindBy(xpath="//*[@id=\"jQ-uid4\"]/li[2]")
	public WebElement partners;
	
	public Ourpartners() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void resultlink() throws InterruptedException{
	Actions aa= new Actions(driver);
	aa.moveToElement(CORPORATE).build().perform();
	Thread.sleep(3000);
	aa.moveToElement(partners).click().build().perform();
	Thread.sleep(3000);
}


}
