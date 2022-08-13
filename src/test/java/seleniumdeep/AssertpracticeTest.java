package seleniumdeep;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertpracticeTest {
	 WebDriver driver=null;
	 
	@BeforeClass
	public void hh()
	{
		 
			 WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				//driver.get("https://cosmocode.io/automation-practice-webtable/");
				
				driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		
	}
	
	
  @Test
  public void hTest() {
	  
	
			
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 900)","");
		
		
		boolean flag=false;
		//List<WebElement> lst=driver.findElements(By.xpath("//table[@summary='Sample Table']//tr"));		
		List<WebElement> lst=driver.findElements(By.xpath("//table[@summary='Sample Table']//tr//td"));
		for(int i=0;i<=lst.size()-1;i++)
		{
			
			if(lst.get(i).getText().contains("China"))
			{
				flag=true;
				break;				
				
			}
		}		
		Assert.assertTrue(flag, "value not matched");
		
  }
  
  
  
  
  @Test(enabled=false)
  public void h1Test()
  {
	  
	  String act="Financial Center";	  
	  List<WebElement> lst=driver.findElements(By.xpath("//table[@summary='Sample Table']//tr"));
	  
	  for(int i=0;i<=lst.size()-1;i++)
	  {
		  
		  if(lst.get(i).getText().equalsIgnoreCase("Financial Center"))
		  {
			  String exp=lst.get(i).getText();
			  break;
		  } 
		  
		  
		  
	  }
	  
	 
	  
	  
	  
	  
  }
  
  
  
  
  
  
}
