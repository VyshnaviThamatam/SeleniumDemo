package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyProductDemo {
	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("vyshu89@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("pass$12");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.findElement(By.xpath("//*[@id='small-searchterms']")).sendKeys("laptop");
		driver.findElement(By.xpath("//input[@value='Search' and @class='button-1 search-box-button']")).click();
		driver.findElement(By.xpath("//*[@value='Add to cart']")).click();		
		//driver.findElement(By.xpath("//*[@id='add-to-cart-button-31']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		//driver.findElement(By.xpath("//*[@value='2098971']")).click();
		driver.findElement(By.xpath("//*[@id='termsofservice']")).click();
		driver.findElement(By.xpath("//*[@id='checkout']")).click();
		driver.findElement(By.xpath("//*[@value='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@onclick='Shipping.save()']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@onclick='ShippingMethod.save()']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@onclick='PaymentMethod.save()']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@onclick='PaymentInfo.save()']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@onclick='ConfirmOrder.save()']")).click();
		
		
	}

}
