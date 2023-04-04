package com.CA.Team;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CA.base.Page;

public class Players extends Page {

	@FindBy(xpath="//*[@id=\"top-level-nav\"]/ul[1]/li[3]/a")
	public WebElement TEAM;
	
	@FindBy(xpath="//*[@id=\"jQ-uid1\"]/li[1]")
	public WebElement PLAYERS;

	@FindBy(xpath = "//*[@id=\"btn-desktop-more\"]")
	WebElement more_players ;
	
	@FindBy(xpath ="//*[@id=\"column-content\"]/div[2]/div/div[1]/div[2]/div[1]/form/div[1]/div/div/label[1]")
	WebElement ALL ;
	
	@FindBy(xpath = "//*[@id=\"column-content\"]/div[2]/div/div[1]/div[2]/div[1]/form/div[1]/div/div/label[2]")
	WebElement BBL ;
	
	@FindBy(xpath = "//*[@id=\"column-content\"]/div[2]/div/div[1]/div[2]/div[1]/form/div[1]/div/div/label[3]")
	WebElement WBBL ;
	
	public Players() {

		PageFactory.initElements(driver, this);
	}
	
	public void Verifyclubsplayers() throws InterruptedException {

		Actions aa= new Actions(driver);
		aa.moveToElement(TEAM).build().perform();
		aa.moveToElement(PLAYERS).click().build().perform();
		System.out.println("Clicked on Players button");
		Thread.sleep(3000);
	//	more_players.click();
	//	Thread.sleep(3000);
        ALL.click();
        for(int i=0;i<1;i++) {
        more_players.click();
        Thread.sleep(3000);
        }
        BBL.click();
        for(int i=0;i<1;i++) {
        	 Thread.sleep(3000);
            more_players.click();
            Thread.sleep(3000);
        }
         WBBL.click();
         for(int i=0;i<1;i++) {
        	Thread.sleep(3000);
            more_players.click();
            Thread.sleep(3000);
        }
}
}
