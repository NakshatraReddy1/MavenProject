package Pack;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyFile {
	public static void main(String [] args) throws InterruptedException, IOException
	{
WebDriver driver;
	System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	
driver=new FirefoxDriver(); 

}
}