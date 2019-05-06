package com.model;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallelProg 
{
	public WebDriver driver;
	@Test
	public void openChromeBr()
	{
		System.out.println("In Chrome Browser");
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium setup\\chromedriver_win32 (16)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		System.out.println("Chrome Browser is opened:"+""+Thread.currentThread().getId());
	}
	@Test
	public void openIEbr()
	{
		System.out.println("In IE browser");
		System.setProperty("webdriver.ie.driver","C:\\Program Files\\Selenium setup\\16122018\\IEDriverServer_x64_3.14.0 (10)\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("https://naukri.com");
		System.out.println("IE browser is opened:"+""+Thread.currentThread().getId());
		System.out.println("successfully opened");
		
	}
	

}
