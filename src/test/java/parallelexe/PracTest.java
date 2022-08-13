package parallelexe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracTest {
	
	WebDriver driver=null; 
	
  @Test
  public void fTest() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	driver.manage().window().maximize();
		
	  driver.get("http://automationpractice.com/index.php");
	 System.out.println(driver.getTitle());
	 Thread.sleep(4000);
	 driver.close();
  }
  
  
  
  @Test
  public void f1Test() throws InterruptedException { 
	  
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	driver.manage().window().maximize();
		
	  driver.get("https://www.guru99.com/");
	  System.out.println(driver.getTitle());
	  Thread.sleep(4000);
	  driver.close();
  }
  
  
}
