package com.CA.Matches;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CA.base.Page;

public class UpcomingMatches extends Page {

	@FindBy(xpath="//*[@id=\"top-level-nav\"]/ul[1]/li[4]/a")
	public WebElement MATCHES;
	
	@FindBy(xpath="//*[@id=\"jQ-uid2\"]/li[1]")
	public WebElement U_M;
	
	@FindBy(xpath="//*[@id=\"fixtures-bbl\"]")
	public WebElement BBL;
	
	@FindBy(xpath="//*[@id=\"fixtures-wbbl\"]")
	public WebElement WBBL;
	
	public UpcomingMatches() {

		PageFactory.initElements(driver, this);
	}
	
	public void Verifyum() throws InterruptedException {

		Actions aa= new Actions(driver);
		aa.moveToElement(MATCHES).build().perform();
		aa.moveToElement(U_M).click().build().perform();
		System.out.println("Clicked on Upcoming matches button");
		Thread.sleep(3000);
		BBL.click();
		Thread.sleep(3000);
		WBBL.click();
	
	}
	
	
	
}