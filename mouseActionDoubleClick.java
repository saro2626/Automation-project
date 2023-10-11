package automationFramework;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mouseActionDoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement doubleClickButton=driver.findElement(By.xpath("//button[contains(text(),'See')]"));
		
		Actions abc=new Actions(driver);
		abc.doubleClick(doubleClickButton).build().perform();
		
		Alert xyz=driver.switchTo().alert();
		String popuptext=xyz.getText();
		System.out.println(popuptext);
		xyz.accept();
		
	}
}