package Normalizespacepac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	
	WebDriver driver=null;
  @Test
  public void fTest() {
	  
	  
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.guru99.com/");
	  System.out.println(driver.getTitle());
	  
  }
  
  
  
  
}
