package ScreenShotWithFailedTestCases;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

//import org.apache.commons.io.FileUtils;
//import org.apache.tools.ant.util.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseClass {
	public static WebDriver driver;
public static String screenshotsubFolder;
	//private Object FileUtils;
	

	public void setupBrowser(String url) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		 driver=new FirefoxDriver();
		 
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		}
	
	
	public void screencapture(String filenme) throws IOException
	{
		
	
TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	File destFile = new File("./Screenshot/"+filenme+timestamp()+".png");
	FileHandler.copy(sourceFile, destFile);
	System.out.println("Screenshot saved successfully");
}
	public String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
}
}

	
