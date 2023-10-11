package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumPracticeform {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		driver.manage().window().maximize();
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Saravanan");
		driver.findElement(By.name("RESULT_TextField-2")).sendKeys("J");
		driver.findElement(By.name("RESULT_TextField-3")).sendKeys("8667233546");
		driver.findElement(By.name("RESULT_TextField-4")).sendKeys("India");
		driver.findElement(By.name("RESULT_TextField-5")).sendKeys("vellore");
		driver.findElement(By.name("RESULT_TextField-6")).sendKeys("saravananindia26@gmail.com");
	
		
	}

}

