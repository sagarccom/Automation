package hybrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Automation\\Browser Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		ReadExcelClass r=new ReadExcelClass();
		r.readExcel(driver);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}