package basicprograms;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Automation\\Browser Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("admin@yourstore.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("admin");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		Thread.sleep(1000);
		
		Actions a=new Actions(driver);
		List<WebElement> ls=driver.findElements(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul"));
		
		int size=ls.size();
		
		for(int i=1; i<=size; i++)
		{
			System.out.println(driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul")).getText());
			a.moveToElement(driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul"))).click().perform();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
