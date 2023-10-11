
package automationFramework;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingTabs
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[contains(text(),'Services')]")).click();
		ArrayList <String> NaukriTabs =new ArrayList <String>(driver.getWindowHandles());
		
		driver.switchTo().window(NaukriTabs.get(1));
	    Thread.sleep(5000);
		driver.close();
	}
}
		