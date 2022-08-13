package seleniumdeep;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BrokenlinkTest {
	WebDriver driver=null;
	
 
	
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
		//broken link practice
//		 WebDriverManager.chromedriver().setup();
//		  driver=new ChromeDriver();
//		  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
//			driver.manage().window().maximize();
//			driver.get("https://www.browserstack.com/guide/how-to-find-broken-links-in-selenium");
//			Thread.sleep(6000);	
//			List<WebElement>list=driver.findElements(By.tagName("a"));
			
			
			
			
			 WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.jdoodle.com/online-java-compiler/");
				Thread.sleep(6000);	
			driver.findElement(By.xpath("//div[@class='level execute-section is-hidden-print']//span[1]"));
			
			
		
			
			
			
			
			
			
			
			
			
	  
	  
	  
  }
  
  
  @Test
  public void fTest() {
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
	  
  }

}
