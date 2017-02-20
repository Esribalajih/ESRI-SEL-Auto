package com.esri.test.auto.wrappers;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class WiniumTest {
	
	WiniumDriver driver=null;
	 
	  @BeforeClass
	  public void setupEnvironment() {
		  DesktopOptions options=new DesktopOptions();
		  options.setApplicationPath("C:\\Program Files (x86)\\Cherwell Software\\Cherwell Service Management\\Trebuchet.App.exe");
		  try{
			 driver=new WiniumDriver(new URL("http://localhost:9999"),options);
			  
		  }
		  catch(MalformedURLException e){
			 e.printStackTrace();
		  }
	  }


	@Test
	public void cherwellTest() throws InterruptedException {
		Thread.sleep(3000);
		
		driver.findElement(By.id("m_btnOk")).click();
	  }
	
	@AfterClass
	  public void close() throws InterruptedException {
		Thread.sleep(5000);
	}
}
