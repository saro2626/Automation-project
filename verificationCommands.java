package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verificationCommands
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		
		WebElement CollegeRadiobutton=driver.findElement(By.id("radio-button-2"));
		CollegeRadiobutton.click();
		System.out.println(CollegeRadiobutton.isEnabled());
		
		WebElement GenderCheckbox=driver.findElement(By.id("checkbox-3"));
		GenderCheckbox.click();
		System.out.println(GenderCheckbox.isSelected());
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Complete')]")).isDisplayed());
	}
}
