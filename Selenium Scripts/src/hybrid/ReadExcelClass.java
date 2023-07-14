package hybrid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ReadExcelClass 
{
	public void readExcel(WebDriver driver) throws Exception
	{
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Automation\\data files\\SquadInfotech.xlsx");
		
		XSSFWorkbook w=new XSSFWorkbook(file);
		
		XSSFSheet s=w.getSheet("Hybrid");
		
		int size=s.getLastRowNum();
		System.out.println("No of rows: "+size);
		
		OperationalClassPom o=new OperationalClassPom();
		
		for(int i=1; i<=size; i++)
		{
			String username=s.getRow(i).getCell(1).getStringCellValue();
			String password=s.getRow(i).getCell(2).getStringCellValue();
			System.out.println(username+"\t\t"+password);
			
			try
			{
				for(int j=1; i<=size; j++)
				{
					String key=s.getRow(j).getCell(0).getStringCellValue();
					System.out.println(key);
					
					if(key.equals("Open Browser"))
					{
						o.url(driver);
					}
					if(key.equals("Enter Username"))
					{
						o.username(driver, username);
					}
					if(key.equals("Enter Password"))
					{
						o.password(driver, password);
					}
					if(key.equals("Click On Login Button"))
					{
						o.login(driver);
					}
					if(key.equals("Click On Logout Button"))
					{
						o.logout(driver);
						System.out.println("Valid Username & Password: ");
						s.getRow(i).createCell(3).setCellValue("Valid Username & Password: ");
						System.out.println("");
					}
						
					
				}
			}
			catch(Exception e)
			{
				System.out.println("Invalid Username & Password: ");
				s.getRow(i).createCell(3).setCellValue("Invalid Username & Password: ");
				System.out.println("    ");
				
			}
			
		}
		FileOutputStream out=new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\Automation\\data files\\SquadInfotech.xlsx");
		w.write(out);
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
