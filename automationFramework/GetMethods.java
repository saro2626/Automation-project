package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		String PageTitle =driver.getTitle();
		System.out.println(PageTitle);
		driver.findElement(By.id("signin_button")).click();
		String LoginPageURL=driver.getCurrentUrl();
		System.out.println(LoginPageURL);
		String LoginPageHeader=driver.findElement(By.xpath("//h3[contains(text(),'Log')]")).getText();
		System.out.println(LoginPageHeader);
		String ForgotText=driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).getText();
		System.out.println(ForgotText);
		String Tagname=driver.findElement(By.name("submit")).getTagName();
		System.out.println(Tagname);
		String AttributeValue=driver.findElement(By.name("submit")).getAttribute("value");
		System.out.println(AttributeValue);
		String CssValue=driver.findElement(By.name("submit")).getCssValue("font-size");
		System.out.println(CssValue);	
		
	}
}