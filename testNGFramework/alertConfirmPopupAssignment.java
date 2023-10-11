package testNGFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alertConfirmPopupAssignment {
	WebDriver driver;
	@Test
	public void a_pageload() {
	
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	}
	@Test
	public void b_clickingTheLink() {
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
		
	}
	@Test
	public void c_popupPage() {
		Alert abc=driver.switchTo().alert();
		String PopUpText=abc.getText();
		System.out.println(PopUpText);
		abc.accept();
		String Finalresult=driver.findElement(By.id("demo")).getText();
		System.out.println(Finalresult);
		
	}
}