package WindowHandling;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ParallelExecutionTest {
	
	private static WebDriver driver;
	
 
  
  @Test
  @Parameters("browser1")
  public void fTest(String bname) {
	  
	  if(bname.equalsIgnoreCase("chrome"))
			  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver= new ChromeDriver();		
			  }
	  
	  else if(bname.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }	 
	  
	    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://www.toolsqa.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
	  
	  
  }
  
  //in testng.xml, u can mention thread-count="2" or not, parallel="tests" must, one thread ll b running, sec thread ll be running and so on
  //if u don't write parallel="tests" then sequencially they ll be going on 
  
  
  
  
  
  
  

}
