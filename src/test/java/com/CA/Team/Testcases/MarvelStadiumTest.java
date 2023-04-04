package com.CA.Team.Testcases;

import org.testng.annotations.Test;

import com.CA.Team.Coaches;
import com.CA.Team.MarvelStadium;
import com.CA.base.Page;

public class MarvelStadiumTest extends Page {
	
	MarvelStadium ms;
	
	public MarvelStadiumTest() {
		
		super();
	}
	
	
	@Test(priority=0)
	public void VerifyMarvelStadium() throws InterruptedException {
		
		ms=new MarvelStadium();
		ms.VerifyclubsMarvel();
	}

}
