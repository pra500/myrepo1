package hashmapusageinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathpracTest {
	
  @Test
  public void fTest() throws InterruptedException {
	  
		WebDriver driver=null;
		 WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.browserstack.com/guide/how-to-find-broken-links-in-selenium");
			Thread.sleep(6000);		
			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
  }
}
