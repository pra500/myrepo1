package pac1;

import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class NoselecttagbootstrapddTest {
  
	private static WebDriver driver;
	
  @BeforeClass
  public void beforeClass() {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver= new ChromeDriver();			
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
  }

  
  @Test
  public void fTest() {
	  
	  driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
	  driver.findElement(By.xpath("(//button[contains(@class, 'btn btn-primary')])[1]")).click();
	 
	 List<WebElement> lst=driver.findElements(By.xpath("//ul[contains(@class, 'dropdown')]//li//a"));	
	 System.out.println(lst.size());
	 
	 for(int i=0; i<=lst.size()-1; i++)
	 {
		 System.out.println(lst.get(i).getText());
		// if((lst.get(i).getText()).contains("CSS"))
			 if((lst.get(i).getText()).equals("CSS"))
		 {
			       break;
		 }
	 	
		 
	 }
	  driver.close();
	  
	  
	  
	  
	  
  }
}
