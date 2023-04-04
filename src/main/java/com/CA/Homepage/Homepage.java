package com.CA.Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.CA.base.Page;

public class Homepage  extends Page {
	SoftAssert sa_all = new SoftAssert();
	
	@FindBy(xpath="//*[@id=\"top-level-nav\"]/ul[1]/li[1]/a")
	public WebElement NEWS ;
	
	@FindBy(xpath="//*[@id=\"top-level-nav\"]/ul[1]/li[2]/a")
	public WebElement VIDEOS;
	
	@FindBy(xpath="//*[@id=\"top-level-nav\"]/ul[1]/li[3]/a")
	public WebElement TEAM;
	
	@FindBy(xpath="//*[@id=\"top-level-nav\"]/ul[1]/li[4]/a")
	public WebElement MATCHES;
	
	@FindBy(xpath="//*[@id=\"top-level-nav\"]/ul[1]/li[5]/a")
	public WebElement COMMUNITY;
	
	@FindBy(xpath="//*[@id=\"top-level-nav\"]/ul[1]/li[6]/a")
	public WebElement CORPORATE;
	
	@FindBy(xpath="//*[@id=\"top-level-nav\"]/ul[1]/li[7]/a")
	public WebElement MEMBERSHIP;
	
	@FindBy(xpath="//*[@id=\"top-level-nav\"]/ul[1]/li[8]/a")
	public WebElement SHOP;
	
	@FindBy(xpath="//*[@id=\"top-level-nav\"]/ul[2]/li[1]/a[1]")
	public WebElement T_P;
	
	@FindBy(xpath="//*[@id=\"homepage-video-container\"]/section/div/div[3]/div/div/div/p/a[1]")
	public WebElement VIEW_ALL_PROGRAMS;
	
	@FindBy(xpath="//*[@id=\"homepage-video-container\"]/section/div/div[3]/div/div/div/p/a[2]")
	public WebElement RECRUIT;
	
	@FindBy(xpath="//*[@id=\"homepage-set-of-4-articles\"]/div[3]/div/a")
	public WebElement VIEW_ALL_NEWS;
	
	@FindBy(xpath="//*[@id=\"WBBL\"]")
	public WebElement WBBL;
	
	@FindBy(xpath="//*[@id=\"BBL\"]")
	public WebElement BBL;
	
	@FindBy(xpath="//*[@id=\"bbl-detail\"]/div/div/div[1]/div/div[2]/div/a")
	public WebElement MORE_STATS1; 
	
	@FindBy(xpath="//*[@id=\"bbl-detail\"]/div/div/div[2]/div/div[2]/div/a")
	public WebElement MORE_STATS2;
	
	@FindBy(xpath="//*[@id=\"bbl-detail\"]/div/div/div[3]/div/div[2]/div/a")
	public WebElement FULL_LADDER;
	
	@FindBy(xpath="//*[@id=\"promo-squares\"]/div/div/div[1]/div/a")
	public WebElement MEMBERSHIP2;
	
	@FindBy(xpath="//*[@id=\"promo-squares\"]/div/div/div[2]/div/a")
	public WebElement CHAMPIONS_LEGUE;
	
	@FindBy(xpath="//*[@id=\"promo-squares\"]/div/div/div[3]/div/a")
	public WebElement GEAR;


public Homepage() {

	PageFactory.initElements(driver, this);
}

public void validate_header_links() throws InterruptedException{
	
	Actions aa = new Actions(driver);
	NEWS.click();
	Thread.sleep(3000);
	sa_all.assertEquals(driver.getCurrentUrl(),"https://www.melbournerenegades.com.au/news");
	System.out.println(driver.getTitle());
	driver.navigate().back();
	Thread.sleep(3000);
	
	VIDEOS.click();
	Thread.sleep(3000);
	sa_all.assertEquals(driver.getCurrentUrl(),"https://www.melbournerenegades.com.au/video");
	System.out.println(driver.getTitle());
	driver.navigate().back();
	Thread.sleep(3000);
	
	TEAM.click();
	Thread.sleep(3000);
	sa_all.assertEquals(driver.getCurrentUrl(),"https://www.melbournerenegades.com.au/players");
	System.out.println(driver.getTitle());
	driver.navigate().back();
	Thread.sleep(3000);
	
	MATCHES.click();
	Thread.sleep(3000);
	sa_all.assertEquals(driver.getCurrentUrl(),"https://www.melbournerenegades.com.au/fixtures");
	System.out.println(driver.getTitle());
	driver.navigate().back();
	Thread.sleep(3000);
	
	CORPORATE.click();
	Thread.sleep(3000);
	sa_all.assertEquals(driver.getCurrentUrl(),"https://www.melbournerenegades.com.au/corporate/match-day-hospitality");
	System.out.println(driver.getTitle());
	driver.navigate().back();
	Thread.sleep(3000);
	
	MEMBERSHIP.click();
	Thread.sleep(3000);
	sa_all.assertEquals(driver.getCurrentUrl(),"https://am.ticketmaster.com/melbournerenegades/#/");
	System.out.println(driver.getTitle());
	driver.navigate().back();
	Thread.sleep(3000);
	
	SHOP.click();
	Thread.sleep(3000);
	sa_all.assertEquals(driver.getCurrentUrl(),"https://shop.cricket.com.au/collections/renegades/");
	System.out.println(driver.getTitle());
	driver.navigate().back();
	Thread.sleep(3000);
	
	T_P.click();
	Thread.sleep(3000);
	sa_all.assertEquals(driver.getCurrentUrl(),"https://www.melbournerenegades.com.au/tickets");
	System.out.println(driver.getTitle());
	driver.navigate().back();
	Thread.sleep(3000);
}
	 public void Verifymiddlelinks() throws InterruptedException {
	 
		VIEW_ALL_PROGRAMS.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		RECRUIT.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		VIEW_ALL_NEWS.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);	 
		 
	 }
	 public void VerifyBelowlinks() throws InterruptedException {
	
/*		 MORE_STATS1.click();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(5000);
		 MORE_STATS2.click();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(5000);
		 FULL_LADDER.click();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(3000);*/
		 MEMBERSHIP2.click();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(3000);
		 CHAMPIONS_LEGUE.click();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(3000);
		 GEAR.click();
		 Thread.sleep(3000);
		 driver.navigate().back();
}
}