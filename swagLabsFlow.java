package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swagLabsFlow {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
    	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    	driver.findElement(By.xpath("//div[text()='Swag Labs']/following::a[1]")).click();
    	driver.findElement(By.id("checkout")).click();
    	driver.findElement(By.id("first-name")).sendKeys("Saravanan");
		driver.findElement(By.id("last-name")).sendKeys("J");
		driver.findElement(By.id("postal-code")).sendKeys("600096");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
    	
}
}