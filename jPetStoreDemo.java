package automationFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class jPetStoreDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//td[text()='User ID:']/following::input[1]")).sendKeys("saro2626");
		driver.findElement(By.xpath("//td[text()='User ID:']/following::input[2]")).sendKeys("Saro@123");
		driver.findElement(By.xpath("//td[text()='User ID:']/following::input[3]")).sendKeys("Saro@123");
		driver.findElement(By.xpath("//td[text()='User ID:']/following::input[4]")).sendKeys("Saravanan");
		driver.findElement(By.xpath("//td[text()='User ID:']/following::input[5]")).sendKeys("J");
		driver.findElement(By.xpath("//td[text()='User ID:']/following::input[6]")).sendKeys("saravananindia26@gmail.com");
		driver.findElement(By.xpath("//td[text()='User ID:']/following::input[7]")).sendKeys("8667233546");
		driver.findElement(By.xpath("//td[text()='User ID:']/following::input[8]")).sendKeys("10,kurunji nagar 3rd cross st");
		driver.findElement(By.xpath("//td[text()='User ID:']/following::input[9]")).sendKeys("Perungudi");
		driver.findElement(By.xpath("//td[text()='User ID:']/following::input[10]")).sendKeys("Chennai");
		driver.findElement(By.xpath("//td[text()='User ID:']/following::input[11]")).sendKeys("Tamil Nadu");
		driver.findElement(By.xpath("//td[text()='User ID:']/following::input[12]")).sendKeys("600096");
		driver.findElement(By.xpath("//td[text()='User ID:']/following::input[13]")).sendKeys("India");
		
		Select experience1=new Select(driver.findElement(By.xpath("//select[@name='account.languagePreference']")));
		experience1.selectByVisibleText("japanese");
		
		Select experience2=new Select(driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']")));
		experience2.selectByVisibleText("DOGS");
		
		WebElement genderCheckBox1=driver.findElement(By.xpath("//td[text()='User ID:']/following::input[14]"));
		genderCheckBox1.click();
		
		WebElement genderCheckBox2=driver.findElement(By.xpath("//td[text()='User ID:']/following::input[15]"));
		genderCheckBox2.click();
		
		driver.findElement(By.xpath("//input[@name='newAccount']")).click();
		
		
	}
}
