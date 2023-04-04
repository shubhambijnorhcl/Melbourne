package com.CA.Matches;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CA.base.Page;

public class Ladder extends Page {

	@FindBy(xpath="//*[@id=\"top-level-nav\"]/ul[1]/li[4]/a")
	public WebElement MATCHES;
	
	@FindBy(xpath="//*[@id=\"jQ-uid2\"]/li[3]")
	public WebElement Ladder;

	@FindBy(xpath = "//*[@id=\"WBBL\"]")
	WebElement wbbl;
	
public Ladder() {
		
		PageFactory.initElements(driver, this);
	}
        public void verifyladder() throws InterruptedException {
    	Thread.sleep(5000);
    	Actions aa= new Actions(driver);
    	aa.moveToElement(MATCHES).build().perform();
    	aa.moveToElement(Ladder).click().build().perform();
    	System.out.println("Clicked on LADDER button");
    	Thread.sleep(5000);
    	wbbl.click();
    	System.out.println("Clicked on WBBL button");
}
}
