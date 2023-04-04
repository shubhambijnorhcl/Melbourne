package com.CA.Matches.Testcases;

import org.testng.annotations.Test;

import com.CA.Matches.UpcomingMatches;
import com.CA.Team.Careers;
import com.CA.base.Page;

public class UpcomingMatchesTest extends Page {
	
	UpcomingMatches um;
	
	public UpcomingMatchesTest() {
		
		super();
	}
	
	
	@Test(priority=0)
	public void Verifyum() throws InterruptedException {
		um=new UpcomingMatches();
		um.Verifyum();
	
	}

}
