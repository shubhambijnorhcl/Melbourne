package com.CA.Team;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CA.base.Page;

public class Coaches extends Page {

	@FindBy(xpath="//*[@id=\"top-level-nav\"]/ul[1]/li[3]/a")
	public WebElement TEAM;
	
	@FindBy(xpath="//*[@id=\"jQ-uid1\"]/li[2]")
	public WebElement COACHES;
	
	public Coaches() {

		PageFactory.initElements(driver, this);
	}
	
	public void Verifyclubscoaches() throws InterruptedException {

		Actions aa= new Actions(driver);
		aa.moveToElement(TEAM).build().perform();
		aa.moveToElement(COACHES).click().build().perform();
		System.out.println("Clicked on Coaches button");
	
	}
}
