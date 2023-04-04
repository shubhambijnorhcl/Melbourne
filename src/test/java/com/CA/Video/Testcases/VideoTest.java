package com.CA.Video.Testcases;

import org.testng.annotations.Test;

import com.CA.News.News;
import com.CA.Videos.Video;
import com.CA.base.Page;

public class VideoTest  extends Page {
	
	Video video;
	
	public VideoTest() {
		
		super();
	}
	
	
	@Test(priority=0)
	public void VerifyNews() throws InterruptedException {
		
		video=new Video();
		video.videolink();
	}

}





