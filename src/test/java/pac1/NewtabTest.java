package pac1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;

public class NewtabTest {
	
	WebDriver driver=null;
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();	  
	  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//driver.get("https://testproject.io/");  	
	driver.get("https://www.monsterindia.com/seeker/registration"); 
	
  }
  
  
  
  @Test(enabled = false)
  public void fTest() {
	  
	  
	  //opening a new tab alogwith a new url
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.open()");
	  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1)); 
	  driver.get("https://www.stackoverflow.com");
	 
	  
  }
  
  
  
  @Test(enabled = true)
  public void f1Test() {
	  
	  //ll gv u present window id
	  System.out.println(driver.getWindowHandle()); //CDwindow-946512D75A9C1E64BAF5B87CC4E7CC78 
	  
	  
	  //type must be file and tag: input
	  driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Admin\\Desktop\\im2.txt");
	  
	

	  
	  
	  
  }
  
  
  
}
