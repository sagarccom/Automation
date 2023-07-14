package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Automation\\Browser Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Login")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
