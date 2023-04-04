package com.CA.Videos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CA.base.Page;

public class Video extends Page{
	
	@FindBy(xpath="//*[@id=\"top-level-nav\"]/ul[1]/li[2]/a")
	public WebElement VIDEOS;
	
	@FindBy(xpath="//*[@id=\"videocategory\"]") 
	public WebElement FILTER_BY_TYPE_video;
	
	@FindBy(xpath="//*[@id=\"series\"]")
	public WebElement FILTER_BY_SEASON_video;
	
	@FindBy(xpath="//*[@id=\"category\"]/div/div/div[2]/ul/li[1]")
	public WebElement VIEW_ALL_CATEGORIES_video;
	
	@FindBy(xpath="//*[@id=\"category\"]/div/div/div[2]/ul/li[2]") 
	public WebElement recruit;
	
	
	@FindBy(xpath="//*[@id=\"seriestarget\"]/div/div/div[2]/ul/li[1]")
	public WebElement VIEW_ALL_SEASONS_video;
	
	@FindBy(xpath="//*[@id=\"seriestarget\"]/div/div/div[2]/ul/li[2]")
	public WebElement WEBER_WBBL_video;
	
	@FindBy(xpath="//*[@id=\"seriestarget\"]/div/div/div[2]/ul/li[3]")
	public WebElement KFC_BBL_video;
	
	@FindBy(xpath="//*[@id=\"opencloseseries\"]")
	public WebElement cutt;
	
	@FindBy(xpath="//*[@id=\"GetMoreVideos\"]")
	public WebElement MORE_VIDEOS;
	
	public Video() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void videolink() throws InterruptedException{
	VIDEOS.click();
	Thread.sleep(3000);
	FILTER_BY_TYPE_video.click();
	Thread.sleep(3000);
	recruit.click();
	Thread.sleep(3000);
	FILTER_BY_TYPE_video.click();
	Thread.sleep(3000);
	VIEW_ALL_CATEGORIES_video.click();
	Thread.sleep(3000);
	FILTER_BY_SEASON_video.click();
	Thread.sleep(3000);
	WEBER_WBBL_video.click();
	Thread.sleep(3000);
	FILTER_BY_SEASON_video.click();
	Thread.sleep(3000);
	KFC_BBL_video.click();
	Thread.sleep(3000);
	FILTER_BY_SEASON_video.click();
	Thread.sleep(3000);
     VIEW_ALL_SEASONS_video.click();
     Thread.sleep(3000);
    MORE_VIDEOS.click();	
   
	}
	

}
