package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.checkerframework.checker.units.qual.s;

public class ReadExcel 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Automation\\data files\\SquadInfotech1.xlsx");
		
		XSSFWorkbook w=new XSSFWorkbook(file);
		
		XSSFSheet s=w.getSheet("ReadExcel");
		
		String a=s.getRow(0).getCell(0).getStringCellValue();
		String b=s.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(a+"\t\t"+b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
