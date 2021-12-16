package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckRegister {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name='radiooptions' and @value='FeMale']")).click();
		
		WebElement year=driver.findElement(By.xpath("//*[@placeholder='Year']"));
		Select yr=new Select(year);
		yr.selectByValue("2000");
		
		WebElement month=driver.findElement(By.xpath("//*[@placeholder='Month']"));
		Select mth=new Select(month);
		List<WebElement> monthcount=mth.getOptions();
		System.out.println(monthcount.size());
		for(int i=0;i<monthcount.size();i++) {
			System.out.println(monthcount.get(i).getText());
		}
		mth.selectByIndex(6);
		
		WebElement day=driver.findElement(By.xpath("//*[@placeholder='Day']"));
		Select dy=new Select(day);
		dy.selectByVisibleText("4");
		
		//driver.close();
		

	}

}
