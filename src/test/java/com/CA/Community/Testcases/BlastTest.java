package com.CA.Community.Testcases;

import org.testng.annotations.Test;

import com.CA.Community.Blast;
import com.CA.Community.CLeague;
import com.CA.base.Page;

public class BlastTest extends Page {
	
	Blast b;
	
	public BlastTest() {
		
		super();
	}
	
	
	@Test(priority=0)
	public void Verifyblast() throws InterruptedException {
		b=new Blast();
		b.resultlink();
	
	}

}
