package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tutorialsNinja
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("input-firstname")).sendKeys("saravanan");
		driver.findElement(By.id("input-lastname")).sendKeys("j");
		driver.findElement(By.id("input-email")).sendKeys("saravananindia26@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("8667233546");
		driver.findElement(By.id("input-password")).sendKeys("Saro@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Saro@123");
		
		WebElement genderCheckBox=driver.findElement(By.xpath("//input[@name='agree']"));
		genderCheckBox.click();
		
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();		
	}

}
