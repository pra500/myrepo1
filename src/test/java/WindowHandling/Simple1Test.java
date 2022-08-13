package WindowHandling;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Simple1Test {
	
	private static WebDriver driver;
	
	
	 @BeforeMethod
	  public void beforeMethod() {
		 
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver= new ChromeDriver();			
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();	
						
		 
		 
	  }
	
  @Test(enabled = false)
  public void fTest() {
	  
	  driver.get("https://www.spicejet.com/");
	  driver.findElement(By.xpath("//div[text()='SpiceClub']")).click();  
	  
	  
	  Set<String> set=driver.getWindowHandles();
	  Iterator<String> itr=set.iterator();
	  String parentid=itr.next();	  
	  System.out.println(parentid);
	  
	  String childid=itr.next();
	  System.out.println(childid);
	  
	  driver.switchTo().window(childid);
	 System.out.println(driver.getTitle());
	  driver.close();
	  
	  driver.switchTo().window(parentid);
	  System.out.println(driver.getTitle());
	driver.close();
	  
	  
  }
 
  //same above can be done by below logic also    
  @Test
  public void f1Test() {
	  
	  driver.get("https://www.spicejet.com/");
	   
	  
	  driver.findElement(By.xpath("//div[text()='SpiceClub']")).click();  
	  
	 
	   String parentid =driver.getWindowHandle();
	   
	   Set<String> set=driver.getWindowHandles();
	   
	   for(String str1:set)
	   {
		   if(!(parentid.equalsIgnoreCase(str1)))
		   {
			   
			   driver.switchTo().window(str1);
			   System.out.println(driver.getTitle());			 
			   driver.close();
		   }
	   }
	   
	  driver.switchTo().window(parentid);	  
	  driver.close();
	  
	  
	  
  }
  
  
  

}
