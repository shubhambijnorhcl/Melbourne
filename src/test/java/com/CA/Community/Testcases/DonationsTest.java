package com.CA.Community.Testcases;

import org.testng.annotations.Test;

import com.CA.Community.Blast;
import com.CA.Community.Donations;
import com.CA.base.Page;

public class DonationsTest extends Page {
	
	Donations d;
	
	public DonationsTest() {
		
		super();
	}
	
	
	@Test(priority=0)
	public void Verifydonations() throws InterruptedException {
		d=new Donations();
		d.resultlink();
	
	}

}
