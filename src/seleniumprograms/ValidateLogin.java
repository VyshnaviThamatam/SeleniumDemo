package seleniumprograms;

import java.util.concurrent.TimeUnit;

//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class ValidateLogin {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		
		/*
		 * System.setProperty("webdriver.edge.driver",
		 * "C:\\Selenium Software\\edgedriver_win64\\msedgedriver.exe"); WebDriver
		 * driver1=new EdgeDriver();
		 * driver1.get("http://demowebshop.tricentis.com/login");
		 */
		
		driver.manage().window().maximize();
		
		
		
	    String expectedtitle="Demo Web Shop. Login";
	    String actualtitle=driver.getTitle();
	    System.out.println(actualtitle);
	    
	    if(actualtitle.equals(expectedtitle)) {
	    	
	    	System.out.println("You are on the correct page");
	    	driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("rekhab");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			//driver.findElement(By.className("ico-logout")).click();
			driver.findElement(By.linkText("Log out")).click();
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//to make the script wait 
			/*
			 * Wait wait = new FluentWait(driver) .withTimeout(30, SECONDS) .pollingEvery(5,
			 * SECONDS) .ignoring(NoSuchElementException.class); driver.close();
			 */
			
			
			
			driver.close();
	    }
	    
	    else {
	    	System.out.println("You are on the wrong page");
	    	
	    	driver.close();
	    }
		
		


	}

}
