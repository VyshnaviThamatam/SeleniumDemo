package seleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	
	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
		Alert alt=driver.switchTo().alert();
		String alertmessage=alt.getText();
		System.out.println(alertmessage);
		alt.accept();
		
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		//driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		Alert alt2=driver.switchTo().alert();
		String alertmessage2=alt2.getText();
		System.out.println(alertmessage2);
		Thread.sleep(4000);//for letting execution to slow down
		alt2.dismiss();
		
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
		Alert alt3=driver.switchTo().alert();
		String alertmessage3=alt3.getText();
		System.out.println(alertmessage3);
		alt3.sendKeys("Vyshnavi");
		Thread.sleep(4000);
		alt3.accept();
		
		
		
		
	}

}
