package com.CA.Matches.Testcases;

import org.testng.annotations.Test;

import com.CA.Matches.Ladder;
import com.CA.Matches.Results;
import com.CA.base.Page;

public class LadderTest  extends Page {
	
	Ladder l;
	
	public LadderTest() {
		
		super();
	}
	
	
	@Test(priority=0)
	public void Verifyladder() throws InterruptedException {
		l=new Ladder();
		l.verifyladder();
	
	}

}
