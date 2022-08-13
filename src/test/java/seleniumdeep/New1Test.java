package seleniumdeep;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New1Test {
	
	WebDriver driver=null;
	
  @Test
  public void fTest() {
	  
	     
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.jdoodle.com/online-java-compiler/");
		//Thread.sleep(6000);			
		
		/*
		try
		{
	driver.findElement(By.xpath("//div[@class='level execute-section is-hidden-print']//span[1]")).getText();
	
		}
		catch (NoSuchElementException e) {
			
		}
		  
catch (ElementNotVisibleException e) {
			
		}
		
catch (ElementNotInteractableException e) {
			
		}
		
		catch(WebDriverException e)
		{
			
		}
		
		
		catch(RuntimeException e)
		{
			
		}
		
		catch(Exception e)
		{
			
		}
		*/
		  
		
		
		//88888888888888
//error will be coming here becoz of sequence disorder, always sub to super we ve to write down, otherwise it will throw unreachable catch blk 
		try
		{
	driver.findElement(By.xpath("//div[@class='level execute-section is-hidden-print']//span[1]")).getText();
	
		}
		catch (NoSuchElementException e) {
			
		}
		  
catch (ElementNotVisibleException e) {
			
		}
		
		catch(RuntimeException e)
		{
			
		}
		
catch (ElementNotInteractableException e) {
			
		}
		
		catch(WebDriverException e)
		{
			
		}
		
		
		
		
		catch(Exception e)
		{
			
		}
  }
}
