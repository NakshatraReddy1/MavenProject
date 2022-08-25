package uploadingFiles;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Upload {
	public static WebDriver driver;

@Test
public void setup() throws InterruptedException, IOException {
	
		
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			FirefoxDriver driver;
	driver=new FirefoxDriver(); 
			driver.get("https://www.filemail.com/share/upload-file");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/section[2]/div/div[2]/div[2]/div[4]/div/label[1]/span")).click();
Runtime.getRuntime().exec("C:\\Users\\HP\\Music\\Selenium programs\\FileUploadScript.exe");
	
driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/section[2]/div/div[2]/div[2]/div[4]/div/button[4]/i")).click();

String text=driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/section[1]/div/h1")).getText();
System.out.println(text);

String act= driver.getCurrentUrl();
System.out.print(act);
String ect=" https://www.filemail.com/share/upload-file";
Assert.assertNotEquals(act,ect);
}
//Autoit
//Download autoit software
//and scite as well
//write code in scite editor the click on tools complie then compli script
//Runtime.getRuntime().exec("C:\\Users\\HP\\Music\\Selenium programs\\FileUploadScript.exe");
//saving file like .au3 


}
