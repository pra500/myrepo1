package parallelexe;

import org.testng.annotations.Test;

//import Normalizespacepac.Allbrowsers1;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class PracticeTest{
	
	
	WebDriver driver=null; 
  
  @Test
  public void fTest() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("http://automationpractice.com/index.php");
	 System.out.println(driver.getTitle());
	 Thread.sleep(10000);
	 driver.close();
	  
  }
  
  
  
  @Test
  public void f2Test() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.guru99.com/");
	  System.out.println(driver.getTitle());
	  Thread.sleep(10000);
	  driver.close();
	  
	  
  }
  
  @Test
  public void f3Test() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.toolsqa.com/");
	  System.out.println(driver.getTitle());
	  Thread.sleep(10000);
	  driver.close();
	  
	  
  }
 
 

}
