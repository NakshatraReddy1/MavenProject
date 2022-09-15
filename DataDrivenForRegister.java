package Pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDrivenForRegister {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Demo\\ExcelData\\ReadData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rowcount=sheet.getLastRowNum();
		
		System.out.println("Total no.of Rows:"+rowcount);
		
		int colcount=sheet.getRow(0).getLastCellNum();
		
		System.out.println("Total no.of columns:"+colcount);
		
		for(int i=1;i<=rowcount;i++) {
			XSSFRow Current_Row=sheet.getRow(i);
			
			String FirstName=Current_Row.getCell(0).getStringCellValue();
			String LastName=Current_Row.getCell(1).getStringCellValue();
			String UserName=Current_Row.getCell(2).getStringCellValue();
			String Password=Current_Row.getCell(3).getStringCellValue();
			String Confirm=Current_Row.getCell(4).getStringCellValue();
			
			WebDriver driver;
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			
		driver=new FirefoxDriver(); 
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
			
			driver.findElement(By.id("firstName")).sendKeys("FirstName");
			driver.findElement(By.id("lastName")).sendKeys("LastName");
			driver.findElement(By.id("username")).sendKeys("UserName");
			driver.findElement(By.name("Passwd")).sendKeys("Password");
			driver.findElement(By.name("ConfirmPasswd")).sendKeys("Confirm");
			driver.findElement(By.className("VfPpkd-vQzf8d")).click();
			System.out.println("Account created successfully");
			System.out.println("Done!");
			
		}

	}

}
