package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginUsingCssSelector
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Automation\\Browser Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		
		driver.get("http://demo.frontaccounting.eu/index.php");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[name='user_name_entry_field']")).clear();
		driver.findElement(By.cssSelector("input[name='user_name_entry_field']")).sendKeys("demouser");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[name='password']")).clear();
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("password");
		Thread.sleep(1000);
		
		Select s=new Select(driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[5]/td[2]/select")));
		s.selectByIndex(0);
		
		driver.findElement(By.cssSelector("input[name='SubmitUser']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("a[href='./access/logout.php?']")).click();
		Thread.sleep(1000);
		
		driver.quit();
		
		
		
		
		
		
	}

}
