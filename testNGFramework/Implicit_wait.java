package testNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Implicit_wait {
	WebDriver driver;
	@Test 
	public void a_Page_Load () {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
	}
	
	@SuppressWarnings("deprecation")
	@Test 
	public void b_Google_Search () {
		driver.findElement(By.name("q")).sendKeys("Sachin");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//h3[contains(text(),'Wikipedia')])[1]")).click();
	}

}
