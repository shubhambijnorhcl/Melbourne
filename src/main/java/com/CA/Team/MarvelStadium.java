package com.CA.Team;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CA.base.Page;

public class MarvelStadium  extends Page {

	@FindBy(xpath="//*[@id=\"top-level-nav\"]/ul[1]/li[3]/a")
	public WebElement TEAM;
	
	@FindBy(xpath="//*[@id=\"jQ-uid1\"]/li[3]")
	public WebElement MARVEL;
	
	public MarvelStadium() {

		PageFactory.initElements(driver, this);
	}
	
	public void VerifyclubsMarvel() throws InterruptedException {

		Actions aa= new Actions(driver);
		aa.moveToElement(TEAM).build().perform();
		aa.moveToElement(MARVEL).click().build().perform();
		System.out.println("Clicked on Marvel Stadium button");
	
	}

}
