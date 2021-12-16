package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		
		driver.findElement(By.xpath("//input[@value='F']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Vyshnavi");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Thamatam");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vyshu189@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("pass$12");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("pass$12");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
	}

}
