package seleniumdeep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario1Test {
	
	WebDriver driver;
	
  @Test
  public void f1Test() {
	  
	  
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	  driver.manage().window().maximize();	 
	  driver.get("https://www.programsbuzz.com/article/normalize-space-xpath-selenium");
	  
	   	 	
	  //tutorials 
	  WebElement wb=driver.findElement(By.xpath("//a[normalize-space(text())='Tutorials']"));  
	  Actions act=new Actions(driver);
	  act.moveToElement(wb).perform();
	  
	  driver.findElement(By.xpath("//a[normalize-space(text())='Pandas']")).click();
	  
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(150, 125)", "");
	  
	  driver.findElement(By.xpath("//a[contains(text(), 'Benefits of Python Pandas')]")).click();
	  
	  
	  //MCQ: //need to chk
	  WebElement wb1=driver.findElement(By.xpath("//a[normalize-space(text())='MCQ']"));  
	  Actions act1=new Actions(driver);
	  act1.moveToElement(wb1).perform();
	 
	  driver.findElement(By.xpath("//a[normalize-space(text())='Database']")).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  //@Test
  public void f2Test() {
  }
  
  
  
  //@Test
  public void f3Test() {
  }
  
  
  
}
