package automationFramework;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mouseActionRightClick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement rightClickButton=driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		Actions abc=new Actions(driver);
		abc.contextClick(rightClickButton).build().perform();
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		Alert xyz=driver.switchTo().alert();
		String popupText=xyz.getText();
		System.out.println(popupText);
		Thread.sleep(2000);
		xyz.accept();
		
	}
}
