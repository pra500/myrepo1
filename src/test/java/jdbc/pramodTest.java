package jdbc;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class pramodTest {
	
	WebDriver driver=null;
	
 
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {	  
		
		 WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.mailinator.com/v3/index.jsp?zone=public&query=cypresstekion#/#inboxpane");
			Thread.sleep(6000);			
			
			
	  
	  
  }
  
  
  @Test
  public void getTest() {
	  
	  driver.findElement(By.xpath("//a[normalize-space(text())='Service Estimate from BWM']")).click();		
		//WebElement wb=driver.findElement(By.xpath("//a[@href='https://prearc.tkon.io/76c88b30']"));
	  
//	  JavascriptExecutor js= (JavascriptExecutor)driver;
//	  js.executeScript(("arguments[0].scrollIntoView(true)"), wb);
		
		
		driver.switchTo().frame("msg_body");
		//WebElement wb=driver.findElement(By.xpath("//a[@href='https://prearc.tkon.io/76c88b30']"));
		WebElement wb=driver.findElement(By.partialLinkText("https://prearc.tkon.io"));
		
		
		
		//tbody/tr[2]/td[]//p//span[@id='x_x_x_x_x_x_x_x_x_x_x_x_modelName']//a
		
		
		
		//This element is in iframe - //a[normalize-space()='https://prearc.tkon.io/76c88b30']
		
		//This element is in iframe - //a[normalize-space()='https://prearc.tkon.io/76c88b30']
String str=wb.getText();
System.out.println(str);


WebElement wb=
		
  }
  
  
  
  

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}
