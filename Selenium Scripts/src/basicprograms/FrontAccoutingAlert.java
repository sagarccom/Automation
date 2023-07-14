package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrontAccoutingAlert 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Automation\\Browser Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		
		driver.get("http://demo.frontaccounting.eu/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[3]/td[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[3]/td[2]/input")).sendKeys("demouser");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[4]/td[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[4]/td[2]/input")).sendKeys("password");
		Thread.sleep(1000);
		
		Select s=new Select(driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[5]/td[2]/select")));
		s.selectByIndex(0);
		
		driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[2]/input")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr/td/div/a[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Sales Quotation Entry")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelOrder\"]/span")).click();
		Thread.sleep(1000);
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr[1]/td[3]/a[5]")).click();
		Thread.sleep(1000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
