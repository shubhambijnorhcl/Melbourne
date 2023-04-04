package com.CA.Community.Testcases;

import org.testng.annotations.Test;

import com.CA.Community.Blast;
import com.CA.Community.Schoolhp;
import com.CA.base.Page;

public class SchoolhpTest extends Page {
	
	Schoolhp shp;
	
	public SchoolhpTest() {
		
		super();
	}
	
	
	@Test(priority=0)
	public void Verifyschoolholidayprogram() throws InterruptedException {
		shp=new Schoolhp();
		shp.resultlink();
	
	}

}
