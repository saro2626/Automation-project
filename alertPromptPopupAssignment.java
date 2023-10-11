package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPromptPopupAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')] ")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]")).click();
		Alert abc=driver.switchTo().alert();
		String PopUpText=abc.getText();
		System.out.println(PopUpText);
		abc.sendKeys("saro");
		abc.accept();
		String Finalresult=driver.findElement(By.id("demo1")).getText();
		System.out.println(Finalresult);
		
	}
}