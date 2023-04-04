package com.CA.News.Testcases;

import org.testng.annotations.Test;

import com.CA.Homepage.Homepage;
import com.CA.News.News;
import com.CA.base.Page;

public class NewsTest  extends Page {
	
	News news;
	
	public NewsTest() {
		
		super();
	}
	
	
	@Test(priority=0)
	public void VerifyNews() throws InterruptedException {
		
		news=new News();
		news.verifynewspage();
	}
	


}
