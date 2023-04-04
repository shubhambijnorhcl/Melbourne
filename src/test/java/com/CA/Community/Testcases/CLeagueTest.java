package com.CA.Community.Testcases;

import org.testng.annotations.Test;

import com.CA.Community.CLeague;
import com.CA.Matches.Results;
import com.CA.base.Page;

public class CLeagueTest extends Page {
	
	CLeague cl;
	
	public CLeagueTest() {
		
		super();
	}
	
	
	@Test(priority=0)
	public void Verifycleague() throws InterruptedException {
		cl=new CLeague();
		cl.resultlink();
	
	}

}
