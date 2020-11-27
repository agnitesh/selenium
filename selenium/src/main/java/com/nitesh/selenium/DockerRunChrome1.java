package com.nitesh.selenium;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerRunChrome1 {
	@Test
	public void test123() throws InterruptedException, IOException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.3.0");
		  File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  File fullpage = new File("C:\\Users\\Dell\\eclipse-workspace\\selenium\\ScreenShot\\ScreenhotFullChrome1.png");
		  FileUtils.copyFile(screenshot, fullpage);
		  Thread.sleep(5000);
		
		
	}

}
