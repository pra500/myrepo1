package pac1;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;

public class AlertTest {
	
	private static WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  
//	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
//			driver= new ChromeDriver();	
	  
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  
	  
	  //System.setProperty("webdriver.ie.driver", "C:\\Users\\Admin\\Downloads\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
	  
	  //driver=new InternetExplorerDriver();
	  
	  
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			//driver.get("https://demoqa.com/alerts");			
			driver.get("http://demo.guru99.com/test/delete_customer.php");
			
  }
  
  
  @Test
  public void fTest() throws InterruptedException {
	 
	  String exp="Do you really want to delete this Customer?";
	  
	  //driver.findElement(By.xpath("(//button[text()='Click me'])[1]"));	  
	  driver.findElement(By.xpath("//input[@name='submit']")).click();  	  
	 
	 Alert alt=driver.switchTo().alert();
	
	alt.accept();
	// alt.dismiss();
	 
//	String act=alt.getText();
//	System.out.println(act);
//	
//	if(exp.equalsIgnoreCase(act))
//	{
//		System.out.println("msg has been matched");
//	}
//	else
//	{
//		System.out.println("msg has not been not matched");
//	}
//	alt.accept();
//	
//	
//	
	
	
	
	
	
	 
	 																																																																																																																																																																																																																		
	 
	 
	  
	  
	  
  }

}
