package com.CA.Corporate.Testcases;

import org.testng.annotations.Test;

import com.CA.Community.Blast;
import com.CA.Corporate.Matchhospitality;
import com.CA.base.Page;

public class MatchhodpitalityTest extends Page {
	
	Matchhospitality mh;
	
	public MatchhodpitalityTest() {
		
		super();
	}
	
	
	@Test(priority=0)
	public void Verifymatchhospitality() throws InterruptedException {
		mh=new Matchhospitality();
		mh.resultlink();
	
	}

}
