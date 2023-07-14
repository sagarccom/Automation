package pom;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=null;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1 for chrome browser...\nEnter 2 for firefox browser....");
		int choice=s.nextInt();
		
		switch(choice)
		{
		case 1:
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Automation\\Browser Files\\chromedriver.exe");
			driver=new ChromeDriver();
			Thread.sleep(1000);
			
			break;
			
		case 2:
			System.setProperty("webdriver,gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\Automation\\Browser Files\\geckodriver.exe");
			driver=new FirefoxDriver();
			Thread.sleep(1000);
			break;
			
		}
		
		OrangeHrmPom o=new OrangeHrmPom();
		o.url(driver);
		o.username(driver);
		o.password(driver);
		o.login(driver);
		o.PaulCollings(driver);
		o.logout(driver);
		o.closeBrowser(driver);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
