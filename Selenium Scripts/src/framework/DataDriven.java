package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Automation\\data files\\SquadInfotech.xlsx");
		
		XSSFWorkbook w=new XSSFWorkbook(file);
		
		XSSFSheet s=w.getSheet("DataDriven");
		
		int size=s.getLastRowNum();
		System.out.println("No of username and password are: "+size);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Automation\\Browser Files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		DataDrivenPom a=new DataDrivenPom();
		
		for(int i=1; i<=size; i++)
		{
			String usn=s.getRow(i).getCell(0).getStringCellValue();
			String pwd=s.getRow(i).getCell(1).getStringCellValue();
			System.out.println(usn+"\t\t"+pwd);
			
			try
			{
				a.url(driver);
				a.username(driver, usn);
				a.password(driver, pwd);
				a.login(driver);
				a.logout(driver);
				System.out.println("Valid Username & Password: ");
				s.getRow(i).createCell(2).setCellValue("Valid Username & Password: ");
				
			
			}
			catch(Exception e)
			{
				System.out.println("Invalid Username & Password: ");
				s.getRow(i).createCell(2).setCellValue("Valid Username & Password: ");
				
			}
			
			
			
			
			
			
			
			
		}
		FileOutputStream out=new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\Automation\\data files\\SquadInfotech.xlsx");
		w.write(out);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
