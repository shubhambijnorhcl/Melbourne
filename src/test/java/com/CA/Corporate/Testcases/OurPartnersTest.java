package com.CA.Corporate.Testcases;

import org.testng.annotations.Test;

import com.CA.Corporate.Matchhospitality;
import com.CA.Corporate.Ourpartners;
import com.CA.base.Page;

public class OurPartnersTest extends Page {
	
	Ourpartners part;
	
	public OurPartnersTest() {
		
		super();
	}
	
	
	@Test(priority=0)
	public void Verifyourpartners() throws InterruptedException {
		part=new Ourpartners();
		part.resultlink();
	
	}


}
