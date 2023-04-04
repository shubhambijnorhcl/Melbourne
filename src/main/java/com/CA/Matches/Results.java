package com.CA.Matches;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CA.base.Page;

public class Results extends Page {

	@FindBy(xpath="//*[@id=\"top-level-nav\"]/ul[1]/li[4]/a")
	public WebElement MATCHES;
	
	@FindBy(xpath="//*[@id=\"jQ-uid2\"]/li[2]")
	public WebElement Results;

	@FindBy(xpath="//*[@id=\"fixtures\"]/div/div/div[2]/form/div[1]/div[1]/div/div/label[1]")
	public WebElement resbbl; 

	@FindBy(xpath="//*[@id=\"fixtures\"]/div/div/div[2]/form/div[1]/div[1]/div/div/label[2]")
	public WebElement reswbbl;
	
	@FindBy(xpath="//*[@id=\"GetMoreMatchs\"]")
	public WebElement LOADMORE;
	
	@FindBy(xpath="//*[@id=\"fixtures\"]/div/div/div[1]/div[1]")
	public WebElement matchreports; 
	
	public Results() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void resultlink() throws InterruptedException{
	Actions aa= new Actions(driver);
	aa.moveToElement(MATCHES).build().perform();
	Thread.sleep(3000);
	aa.moveToElement(Results).click().build().perform();
	Thread.sleep(3000);
  /*  LOADMORE.click();	
    Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",matchreports);
	Thread.sleep(3000);*/
    reswbbl.click();	
	}
	
}
