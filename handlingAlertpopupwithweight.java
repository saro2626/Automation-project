package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingAlertpopupwithweight {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(8000);
		Alert abc=driver.switchTo().alert();
		String PopUpText=abc.getText();
		System.out.println(PopUpText);
		abc.accept();
		
		
	}
}