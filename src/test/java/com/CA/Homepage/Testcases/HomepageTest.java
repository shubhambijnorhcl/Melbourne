package com.CA.Homepage.Testcases;

import org.testng.annotations.Test;

import com.CA.Homepage.Homepage;
import com.CA.base.Page;

public class HomepageTest  extends Page {
	
	Homepage homePage;
	
	public HomepageTest() {
		
		super();
	}
	
	
	@Test(priority=0)
	public void VerifyHomePageLinkTest() throws InterruptedException {
		
		homePage=new Homepage();
		homePage.validate_header_links();
	}
	
	@Test(priority=1)
	public void VerifyHomemiddleLinkTest() throws InterruptedException {
		
		homePage=new Homepage();
		homePage.Verifymiddlelinks();
	}
	
	@Test(priority=2)
	public void VerifyHomebelowLinkTest() throws InterruptedException {
		
		homePage=new Homepage();
		homePage.VerifyBelowlinks();
	}

}


