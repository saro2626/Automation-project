
package testNGFramework;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handlingTabs
{
	WebDriver driver;
	@Test
	public void a_pageload() {
	    System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void b_changeTab() throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(text(),'Services')]")).click();
		ArrayList <String> NaukriTabs =new ArrayList <String>(driver.getWindowHandles());
		for(String values:NaukriTabs)
		{
		 System.out.println(values);
		
		}
		driver.switchTo().window(NaukriTabs.get(1));
	    Thread.sleep(5000);
		driver.close();
	}
}
		