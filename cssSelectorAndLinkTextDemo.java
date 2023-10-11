package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorAndLinkTextDemo
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("signin_button")).click();
		//driver.findElement(By.cssSelector("#signin_button")).click();
		//driver.findElement(By.className("sign in btn btn-info")).click();
		driver.findElement(By.cssSelector(".signin btn btn-info")).click();
		//driver.findElement(By.xpath("Forgot your password ?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
		//css SelectorAndLinkTextDemo
	}
	
}

