package pac1;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;

public class Actions2Test {
	
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
	  driver.get("https://demoqa.com/text-box");
	  
	  Actions actions = new Actions(driver);
      
      
      // Enter the Full Name
      WebElement fullName = driver.findElement(By.id("userName"));
      fullName.sendKeys("Mr.Peter Haynes");
      
      //Enter the Email
//      webdriverwait wait=new webdriverwait();
//      wait.until(ExpectedConditions.visi
      
      
      WebElement email=driver.findElement(By.id("userEmail"));
      email.sendKeys("PeterHaynes@toolsqa.com");
      
      
      // Enter the Current Address
      WebElement currentAddress=driver.findElement(By.id("currentAddress"));
      
      currentAddress.sendKeys("43 School Lane London EC71 9GO");
      
      
      // Select the Current Address using CTRL + A
      actions.keyDown(Keys.CONTROL);  //keydown does not release automatically so we need keys up mtd for uping it 
      actions.sendKeys("a");
      actions.keyUp(Keys.CONTROL);
      actions.build().perform();
      
      // Copy the Current Address using CTRL + C
      actions.keyDown(Keys.CONTROL);
      actions.sendKeys("c");
      actions.keyUp(Keys.CONTROL);
      actions.build().perform();
      
      //Press the TAB Key to Switch Focus to Permanent Address
      actions.sendKeys(Keys.TAB);
      actions.build().perform();
      
      //Paste the Address in the Permanent Address field using CTRL + V
      actions.keyDown(Keys.CONTROL);
      actions.sendKeys("v");
      actions.keyUp(Keys.CONTROL);
      actions.build().perform();
      
      
  }

}
