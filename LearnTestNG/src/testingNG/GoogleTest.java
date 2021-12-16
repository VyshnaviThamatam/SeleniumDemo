package testingNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.ActualMain;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openurl() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void checktitle() {

		String currenttitle=driver.getTitle();
		System.out.println(currenttitle);
		Assert.assertEquals(currenttitle, "Google");
		
		
	}
	
	@Test(priority = 1)
	public void checklogo() {
		
	Boolean view=driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
	Assert.assertTrue(view);
		
	}
	
	@AfterMethod
	public void closeurl() {
		driver.close();
	}

}
