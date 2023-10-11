package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoGuru
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("firstName")).sendKeys("saravanan");
		driver.findElement(By.name("lastName")).sendKeys("j");
		driver.findElement(By.name("phone")).sendKeys("8667233546");
		driver.findElement(By.id("userName")).sendKeys("saravananindia26@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("2/568A subramaniyar koil st,Arni");
		driver.findElement(By.name("city")).sendKeys("chennai");
		driver.findElement(By.name("state")).sendKeys("Tamil Nadu");
		driver.findElement(By.name("postalCode")).sendKeys("632317");
		driver.findElement(By.id("email")).sendKeys("saravanan2626");
		driver.findElement(By.name("password")).sendKeys("saro2626");
		driver.findElement(By.name("confirmPassword")).sendKeys("saro2626");
		driver.findElement(By.name("submit")).click();		
	}
}