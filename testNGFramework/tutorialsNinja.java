package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tutorialsNinja
{
	WebDriver driver;
	@Test
	public void a_pageload() {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
	}
	@Test
	public void b_registrationPage() {
		
		
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
