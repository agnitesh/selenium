package com.nitesh.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
  @Test
  public void f() throws IOException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  WebElement element =  driver.findElement(By.xpath("//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]"));
//	  driver.findElement(By.xpath("//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Hello");;
//	  driver.findElement(By.xpath("//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[3]/center[1]/input[1]"));
	  File file = element.getScreenshotAs(OutputType.FILE);
	  String filePath = System.getProperty("user.dir")+"\\selenium\\ScreenShot";
	  System.out.println(filePath);
	  
	  File destFile = new File("C:\\Users\\Dell\\eclipse-workspace\\selenium\\ScreenShot\\Screenhot.png");
	  FileUtils.copyFile(file, destFile);
	  File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  File fullpage = new File("C:\\Users\\Dell\\eclipse-workspace\\selenium\\ScreenShot\\ScreenhotFullPage.png");
	  FileUtils.copyFile(screenshot, fullpage);
	  
	  
  }
  
  
}
