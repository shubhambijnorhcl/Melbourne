package com.CA.Team.Testcases;

import org.testng.annotations.Test;

import com.CA.Team.Careers;
import com.CA.Team.MarvelStadium;
import com.CA.base.Page;

public class CareersTest extends Page {
	
	Careers career;
	
	public CareersTest() {
		
		super();
	}
	
	
	@Test(priority=0)
	public void VerifyCareer() throws InterruptedException {
		career=new Careers();
		career.Verifycareer();
	
	}

}
