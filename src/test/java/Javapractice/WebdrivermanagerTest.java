package Javapractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager; //must

public class WebdrivermanagerTest {
	
	private static WebDriver driver;
	
 @Test(enabled=true)
  public void f1Test() {
	  
	  WebDriverManager.chromedriver().setup();	  
	 driver= new ChromeDriver(); 
	 
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);	
		driver.manage().window().maximize();		
		//driver.get("https://www.javatpoint.com/");
		//driver.get("http://output.jsbin.com/osebed/2");  
		driver.get("https://www.toolsqa.com/selenium-webdriver/webdrivermanager/");
	  
	  
  }
  
  @Test(enabled=false)
  public void f2Test() {
	  
	  WebDriverManager.firefoxdriver().setup();
	  
	
	  driver=new FirefoxDriver();
	 
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);	
		driver.manage().window().maximize();		
		//driver.get("https://www.javatpoint.com/");
		driver.get("http://output.jsbin.com/osebed/2");  
	  
	  
  }
  
  @Test(enabled=true)
  public void f3Test() {
	  
	  WebDriverManager.edgedriver().setup();
	  
	 //driver= new ChromeDriver();
	  
	  driver=new EdgeDriver();
	 
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);	
		driver.manage().window().maximize();		
		//driver.get("https://www.javatpoint.com/");
		driver.get("http://output.jsbin.com/osebed/2");  
	  
	  
  }
  
  
  
//  WebDriverManager.chromedriver().setup();
//  WebDriverManager.firefoxdriver().setup();
//  WebDriverManager.edgedriver().setup();
//  WebDriverManager.operadriver().setup();
//  WebDriverManager.phantomjs().setup();
//  WebDriverManager.iedriver().setup();
//  WebDriverManager.chromiumdriver().setup();
  
}
