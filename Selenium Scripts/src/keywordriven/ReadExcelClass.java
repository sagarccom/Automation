package keywordriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ReadExcelClass 
{
	public void readExcel(WebDriver driver) throws Exception
	{
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Automation\\data files\\SquadInfotech.xlsx");
		
		XSSFWorkbook w=new XSSFWorkbook(file);
		
		XSSFSheet s=w.getSheet("keywordDriven");
		
		int rowsize=s.getLastRowNum();
		System.out.println("No of rows: "+rowsize);
		
		OperationalClassPom o=new OperationalClassPom();
		
		for(int i=0; i<=rowsize; i++)
		{
			String key=s.getRow(i).getCell(0).getStringCellValue();
			System.out.println(key);
			
			if(key.equals("Open Browser"))
			{
				o.url(driver);
			}
			else if(key.equals("Enter Username"))
			{
				o.username(driver, "admin@yourstore.com");
			}
			else if(key.equals("Enter Password"))
			{
				o.password(driver, "admin");
			}
			else if(key.equals("Click On Login Button"))
			{
				o.login(driver);
			}
			else if(key.equals("Click On Logout Button"))
			{
				o.logout(driver);
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
