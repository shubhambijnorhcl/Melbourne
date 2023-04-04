package com.CA.Team.Testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.CA.Team.Players;
import com.CA.Videos.Video;
import com.CA.base.Page;

public class PlayersTest  extends Page {
	
	Players players;
	
	public PlayersTest() {
		
		super();
	}
	
	
	@Test(priority=0)
	public void Verifyplayers() throws InterruptedException {
		
		players=new Players ();
		players.Verifyclubsplayers();
	}

}
