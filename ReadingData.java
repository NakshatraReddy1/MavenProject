package Pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.*;


public class ReadingData {
	private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;
    private static XSSFCell cell;
    

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\HP\\Documents\\SampleData.xlsx");
		 FileInputStream fis = new FileInputStream(file);
		   workbook=new XSSFWorkbook(fis);
		 Sheet sheet=workbook.getSheet("Sheet1");
		 int rowCount=sheet.getLastRowNum();
		 int colCount=sheet.getRow(0).getLastCellNum();
		 
		 for(int i=0;i<rowCount;i++)
		 {
			 Row currentRow=sheet.getRow(i);
			 
			 for( int j=0;j<colCount;j++)
			 {
				 String value=currentRow.getCell(j).toString();
				 System.out.print("                      "+value);
			 }
			 System.out.println();
		 }
		 

	}

	
}
