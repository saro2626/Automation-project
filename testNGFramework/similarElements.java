package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class similarElements {

	WebDriver driver;
	@Test
	public void a_pageload() {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Rajinikanth");
		driver.manage().window().maximize();
	}
	@Test
	public void b_counts() {
		int LinksCount=driver.findElements(By.tagName("a")).size();
		System.out.println(LinksCount);
		
		int imagescount=driver.findElements(By.tagName("img")).size();
		System.out.println(imagescount);
		


	}

}
