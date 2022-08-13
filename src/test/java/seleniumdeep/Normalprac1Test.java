package seleniumdeep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Normalprac1Test {
	
	WebDriver driver;
	
  //@Test
  public void fTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	  
	  String text=driver.findElement(By.xpath("(//a[text()='Java'])[1]")).getText();
	  System.out.println(text);
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(170,0)", "");
	  
	  driver.findElement(By.xpath("//a[text()='50+ Selenium Webdriver Interview Questions']")).click();
	  
	  driver.close();
	  
	  
	  
  }
  
  
  
  @Test
  public void f1Test() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
		/*
		 * driver.get("https://login.yahoo.com/?.intl=in");
		 * 
		 * WebElement
		 * phoenno=driver.findElement(By.xpath("//input[@class='phone-no '] ")); Actions
		 * act=new Actions(driver); act.keyDown(phoenno,
		 * Keys.SHIFT).sendKeys("pgj1233@gmail.com").perform();
		 */
	  
	  	  
	  	  
	  
	  driver.get("http://automationpractice.com/index.php");
	  WebElement searchbox=driver.findElement(By.cssSelector("input#search_query_top"));
	  
	  
	  Actions act1=new Actions(driver);
	  act1.keyDown(searchbox, Keys.SHIFT).sendKeys("tshirts").perform();
	  
	  
	  
	  
	  
	  
	  
	  	  
	  
	  
	 
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
}
