package testNGFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakingScreenshotMultiple
{
		public static WebDriver driver;
		@Test
		public void screenshot() throws Exception
		{
		    System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.name("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			
			Thread.sleep(5000);
			getscreenshot();
		}
		private static void getscreenshot() throws IOException
		{
			// TODO Auto-generated method stub
			
			File scrFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("D:\\SELENIUM\\ScreenshotDemo\\Saucedemo"+System.currentTimeMillis()+".png"));
		}
}
