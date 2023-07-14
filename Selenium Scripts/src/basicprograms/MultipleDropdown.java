package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Automation\\Browser Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Select s;
		
		driver.get("https://blazedemo.com/");
		Thread.sleep(100);
		
		System.out.println("Home page title name: "+driver.getTitle());
		s=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
		s.selectByVisibleText("Boston");
		
		s=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
		s.selectByVisibleText("Berlin");
		
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		System.out.println("Reservation Page: "+driver.getTitle());
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
