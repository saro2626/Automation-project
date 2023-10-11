package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class satvat {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://hrpanel.satvatinfosol.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("sub_username")).sendKeys("TR1182");
		driver.findElement(By.id("sub_password")).sendKeys("pandiy@4v");
		driver.findElement(By.id("sub_login")).click();
		Thread.sleep(20000);
		
		Alert abc=driver.switchTo().alert();
		String PopUpText=abc.getText();
		System.out.println(PopUpText);
		abc.dismiss();
		
		driver.findElement(By.xpath("//a[text()='Attendance']"));
		driver.findElement(By.xpath("//a[text()='Attendance Status && Punch Details']")).click();
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//a[text()='PUNCH DETAILS']")).click();
		
		
	}
}