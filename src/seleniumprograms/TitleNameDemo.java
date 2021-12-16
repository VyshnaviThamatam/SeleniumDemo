package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleNameDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		//int titlelength=driver.getTitle().length();
		System.out.println(title);
		System.out.println(title.length());
		
	    String expectedurl="http://demowebshop.tricentis.com/";
	    String actualurl=driver.getCurrentUrl();
		if(expectedurl.equals(actualurl))
			System.out.println("Both urls are matching");
		else
			System.out.println("Both are different urls");
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource.length());
		
		driver.close();
		

	}

}
