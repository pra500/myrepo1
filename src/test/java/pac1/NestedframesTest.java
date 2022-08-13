package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedframesTest {
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  
	  
//nested frames not working, need to check 
		 WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			
			
			/*
	       driver.get("https://demoqa.com/nestedframes");
	       
	       WebElement child1=driver.findElement(By.xpath("//p[text()='Child Iframe']"));
	      
	       driver.switchTo().frame("frame1").switchTo().frame(child1);
	       
	       System.out.println(driver.getPageSource());
	       
	       System.out.println("-------------------");
	       driver.switchTo().parentFrame();
	       System.out.println(driver.getPageSource());
	       
	       driver.switchTo().defaultContent();
	       driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();         
	    	*/
	       
	       
	    //will try on this : https://chercher.tech/practice/frames-example-selenium-webdriver  
			
			System.out.println("-----------");
	       
	       
	       
	       
	    
  }
}
