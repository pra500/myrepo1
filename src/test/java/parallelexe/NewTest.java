package parallelexe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	
	WebDriver driver=null; 
  @Test
  public void fTest() throws InterruptedException {
	  
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("http://automationpractice.com/index.php");
	 System.out.println(driver.getTitle());
	 Thread.sleep(4000);
	 driver.close();
	 
	 
  }
  
}
