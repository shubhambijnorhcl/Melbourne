package com.CA.Team.Testcases;

import org.testng.annotations.Test;

import com.CA.Team.Coaches;
import com.CA.Team.Players;
import com.CA.base.Page;

public class CoachesTest extends Page {
	
	Coaches coaches;
	
	public CoachesTest() {
		
		super();
	}
	
	
	@Test(priority=0)
	public void Verifycoaches() throws InterruptedException {
		
		coaches=new Coaches();
		coaches.Verifyclubscoaches();
	}

}
