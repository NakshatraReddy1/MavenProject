package Pack;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writtingdata {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("emp info");
		
ArrayList<Object[]>empdata=new ArrayList<Object[]>();
		empdata.add(new Object[]{"empid","EmpName","Address"});
		empdata.add(new Object[] {101,"Pramee","Nellore"});
	     empdata.add(new Object[]{102,"Raman","hyderabad"});
		                           
		 int rowcount =0;
		 for(Object emp[]:empdata)
		 {
			 XSSFRow row=sheet.createRow(rowcount++);
			 int colCount=0;
			  for (Object value:emp)
			  {
				  XSSFCell cell=row.createCell(colCount++);
				  if(value instanceof String)
				  
					  cell.setCellValue((String)value);
				  if(value instanceof Integer)
					  cell.setCellValue((Integer)value);
				  if(value instanceof Boolean)
					  cell.setCellValue((Boolean)value);
				  }
			  }
			  String filepath="C:\\Users\\HP\\eclipse-workspace\\Demo\\ExcelData\\WriteData.xlsx";
			  FileOutputStream fis=new FileOutputStream(filepath);
			  workbook.write(fis);
			  fis.close();
		 }
		}
	


