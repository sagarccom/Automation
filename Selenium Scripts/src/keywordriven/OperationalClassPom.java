package keywordriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OperationalClassPom 
{
	public void url(WebDriver driver) throws InterruptedException
	{
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(1000);
	}
	public void username(WebDriver driver, String username) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(username);
		Thread.sleep(1000);
	}
	public void password(WebDriver driver, String password) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(password);
		Thread.sleep(1000);
	}
	public void login(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		Thread.sleep(1000);
	}
	public void logout(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[3]/a")).click();
		Thread.sleep(1000);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
