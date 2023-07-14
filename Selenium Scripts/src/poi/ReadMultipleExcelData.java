package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadMultipleExcelData 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Automation\\data files\\SquadInfotech1.xlsx");
		
        XSSFWorkbook w=new XSSFWorkbook(file);
		
		XSSFSheet s=w.getSheet("ReadMultipleData");
		
		int size=s.getLastRowNum();
		System.out.println("No of rows in excel sheet are: "+size);
		System.out.println("------------------------------------");
		
		String name1=s.getRow(0).getCell(0).getStringCellValue();
		String loc1=s.getRow(0).getCell(1).getStringCellValue();
		
		
		System.out.println(name1+"\t\t"+loc1);
		System.out.println("--------------------------");
		
		for(int i=1; i<=size; i++)
		{
			String name=s.getRow(i).getCell(0).getStringCellValue();
			String loc=s.getRow(i).getCell(1).getStringCellValue();
			
			
			System.out.println(name+"\t\t"+loc);
			System.out.println("------------------------");
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
