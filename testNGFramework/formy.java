package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class formy {
	WebDriver driver;
	@Test
	public void a_pageload() {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
}
	@Test
	public void b_registrationPage() {
		driver.findElement(By.id("first-name")).sendKeys("Saravanan");
		driver.findElement(By.id("last-name")).sendKeys("J");
		driver.findElement(By.id("job-title")).sendKeys("selenium");
		
		
		//driver.findElement(By.id("radio-button-2"));.click();
		WebElement collegeRadioButton=driver.findElement(By.id("radio-button-2"));
		collegeRadioButton.click();
		
		WebElement genderCheckBox=driver.findElement(By.id("checkbox-3"));
		genderCheckBox.click();
		
		
		Select experience=new Select(driver.findElement(By.id("select-menu")));
		experience.selectByVisibleText("2-4");
		//experience.selectByValue("4");
	
		driver.findElement(By.id("datepicker")).sendKeys("06/03/2000");
		driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
	}
}