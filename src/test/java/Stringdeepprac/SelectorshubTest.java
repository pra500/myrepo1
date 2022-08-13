package Stringdeepprac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.internal.AbstractParallelWorker.Arguments;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectorshubTest {
	
	WebDriver driver=null;
	
  @Test
  public void fTest() throws InterruptedException {
	  
		
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
		  /*
		  driver.get("https://selectorshub.com/how-to-install-selectorshub/");
		  String str=driver.findElement(By.xpath("//a[normalize-space()='TestCase Studio']")).getText();
		  System.out.println(str);		  
		  driver.findElement(By.xpath("//p[@id='bddb']")).click();
		  String stg=driver.findElement(By.xpath("//p[contains(text(),'t tried any developer tools')]")).getText();
		  System.out.println(stg);
		  driver.findElement(By.xpath("//a[@aria-label='Reply to Kavya']")).click();
		  driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("the reply is");	
		  */
		  
		  //note: jsexecutor scrollto
		  
		  driver.get("http://automationpractice.com/index.php");
		  driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("tshirts", Keys.ENTER);
		  Thread.sleep(2000);
		  
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0, 200)","");
		  
		  
		  
		  driver.findElement(By.xpath("//a[normalize-space()='Faded Short Sleeve T-shirts']")).click();
		  
		  
		  JavascriptExecutor js1=(JavascriptExecutor) driver;
		  js1.executeScript("window.scrollBy(0, 200)","");
		  
		 //WebDriverWait wait=new WebDriverWait(driver, 15);
		 //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[@class='icon-plus']")));	 
		  
		  JavascriptExecutor js2=(JavascriptExecutor) driver;
		  //js2.executeScript(document.getelementByxpath("//i[@class='icon-plus']"));
		  
		  
		  
		  
		  
		  //quantity
		  WebElement wb=driver.findElement(By.xpath("(//i[@class='icon-plus'])[1]"));	
		  wb.clear();		  
		  Actions act=new Actions(driver);
		  act.moveToElement(wb).doubleClick().perform();
		  
		  //size
		  WebElement wb1=driver.findElement(By.xpath("//select[@id='group_1']"));
		  Select sel=new Select(wb1);
		  sel.selectByVisibleText("M");
		  
		  driver.findElement(By.xpath("//button[@name='Submit']")).click();
		  driver.findElement(By.xpath("//span[@title='Continue shopping']//span[1]")).click();
		  
		  
		  
		  driver.findElement(By.xpath("//a[@id='send_friend_button']")).click();
		  
		  //javascriptexecutor practice:
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
			
		  
		  
		  
	  
	  
  }
}
