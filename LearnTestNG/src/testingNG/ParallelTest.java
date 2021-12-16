package testingNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTest {

 public WebDriver driver;
 @Test
  public void EdgeTest() {	 
	
		System.out.println("Test Case One with Thread Id:- "+ Thread.currentThread().getId());

  }
 
 @Test
 public void ChromeTest()
 { 
	 System.out.println("Test Case Two with Thread Id:- "+ Thread.currentThread().getId());
 }
}