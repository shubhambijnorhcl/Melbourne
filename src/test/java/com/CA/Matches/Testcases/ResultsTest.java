package com.CA.Matches.Testcases;

import org.testng.annotations.Test;

import com.CA.Matches.Results;
import com.CA.Matches.UpcomingMatches;
import com.CA.base.Page;

public class ResultsTest extends Page {
	
	Results rs;
	
	public ResultsTest() {
		
		super();
	}
	
	
	@Test(priority=0)
	public void Verifyresults() throws InterruptedException {
		rs=new Results();
		rs.resultlink();
	
	}

}
