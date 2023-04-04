package com.CA.News;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.CA.base.Page;

public class News extends Page {
	SoftAssert sa_all = new SoftAssert();
	
	@FindBy(xpath="//*[@id=\"top-level-nav\"]/ul[1]/li[1]/a")
	public WebElement NEWS ;

	@FindBy(xpath="//*[@id=\"GetMoreNews\"]")
	WebElement more_stories;

	@FindBy(xpath="//*[@id=\"FilterByType\"]")
	WebElement FILTER_BY_TYPE; 
	
	@FindBy(xpath="//*[@id=\"FilterBySeries\"]")
	WebElement FILTER_BY_SERIES ;
	
	@FindBy(xpath="//*[@id=\"category\"]/div/div/div[2]/ul/li[1]")
	WebElement VIEW_ALL_CATEGORY; 
	
	@FindBy(xpath="//*[@id=\"category\"]/div/div/div[2]/ul/li[2]")
	WebElement MATCH_REPORTS; 
	
	@FindBy(xpath="//*[@id=\"category\"]/div/div/div[2]/ul/li[3]")
	WebElement FEATURES;
	
	@FindBy(xpath="//*[@id=\"series\"]/div/div/div[2]/ul/li[1]")
	WebElement VIEW_ALL_SEASONS;
	
	@FindBy(xpath="//*[@id=\"series\"]/div/div/div[2]/ul/li[2]")
	WebElement WEBER_WBBL; 
	
	@FindBy(xpath="//*[@id=\"series\"]/div/div/div[2]/ul/li[3]")
	WebElement KFC_BBL ;
	
	public News() {

		PageFactory.initElements(driver, this);
	}
	
    public void verifynewspage() throws InterruptedException {
		
		NEWS.click();
		Thread.sleep(3000);
		System.out.println("Clicked on NEWS button");
		FILTER_BY_TYPE.click();
		System.out.println("Clicked on FILTER_BY_TYPE button");
			Thread.sleep(3000);
			MATCH_REPORTS.click();
			System.out.println("Clicked on MATCH_REPORTS button");
			Thread.sleep(3000);
			FILTER_BY_TYPE.click();
			System.out.println("Clicked on FILTER_BY_TYPE button");
			Thread.sleep(3000);
			FEATURES.click();
			System.out.println("Clicked on FEATURES button");
			Thread.sleep(3000);
			FILTER_BY_TYPE.click();
			System.out.println("Clicked on FILTER_BY_TYPE button");
			Thread.sleep(3000);
			VIEW_ALL_CATEGORY.click();
			System.out.println("Clicked on VIEW_ALL_CATEGORY button");
			Thread.sleep(3000);
			more_stories.click();
			Thread.sleep(3000);
			FILTER_BY_SERIES.click();
			System.out.println("Clicked on FILTER_BY_SERIES button");
			Thread.sleep(3000);
			WEBER_WBBL.click();
			System.out.println("Clicked on WBBL button");
			Thread.sleep(3000);
			FILTER_BY_SERIES.click();
			System.out.println("Clicked on FILTER_BY_SERIES button");
			Thread.sleep(3000);
			KFC_BBL.click();
			System.out.println("Clicked on BBL button");
			Thread.sleep(3000);
	        FILTER_BY_SERIES.click();
			System.out.println("Clicked on FILTER_BY_SERIES button");
			Thread.sleep(3000);
			VIEW_ALL_SEASONS.click();
			System.out.println("Clicked on VIEW_ALL_SEASONS button");
			Thread.sleep(3000);
			more_stories.click();
			
		}
	
}
