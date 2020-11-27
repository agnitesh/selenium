package com.nitesh.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocalBrowserRun {
	
	@Test		
	public void test() {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.automatetheplanet.com/selenium-webdriver-4-overview/#tab-con-4");
			  
	}
		


}
