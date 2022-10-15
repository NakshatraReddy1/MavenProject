package ScreenShotWithFailedTestCases;

import org.openqa.selenium.By;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass extends BaseClass{
	
	@Test(testName="setup")
	public void setup() throws InterruptedException
	{
		setupBrowser("https://www.facebook.com/");
	}
	@Test(testName="loginwithEmail")
	public void loginwithEmail()
	{
		
		driver.findElement(By.id("email")).sendKeys("7997264644");
		driver.findElement(By.name("pass2")).sendKeys("123456789");
		driver.findElement(By.name("login")).click();
	}
}
