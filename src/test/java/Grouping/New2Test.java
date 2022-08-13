package Grouping;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class New2Test {
  
	private static WebDriver driver;	
	
  @BeforeMethod
  public void beforeMethod() {  
	  
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver= new ChromeDriver();			
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
						
	 
  }
  
  @Test
  public void fTest() {
	  
	  driver.get("https://demoqa.com/text-box");
	  
  }

}
