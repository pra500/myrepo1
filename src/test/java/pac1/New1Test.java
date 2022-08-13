package pac1;

import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class New1Test {
 
	private static WebDriver driver;
	
	
  @BeforeClass
  public void beforeClass() {
	  
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");	  
	driver= new ChromeDriver();							
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	driver.manage().window().maximize();	
	driver.manage().deleteAllCookies();
	  
	  
  }

  
  @Test(enabled = false)
  public void fTest() {
	  
	  driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,1000)", "");
	  
	//to perform Scroll on application using Selenium
      JavascriptExecutor js1 = (JavascriptExecutor) driver;
      js1.executeScript("window.scrollBy(0,-350)", "");
	  
	  WebElement wb=driver.findElement(By.xpath("(//select[@class='spTextField'])[1]"));
	  
	  
	  Select sel =new Select(wb);
	  sel.selectByVisibleText("Agile Methodology");	  
	  
	  
	  
  }
  
  
 
  @Test(enabled = false)
  public void gTest() throws InterruptedException
  {
	  	  
//	   driver.get("https://www.guru99.com/");   
	  //link text practice:
//	   driver.findElement(By.linkText("Testing")).click();	  
//	   Thread.sleep(3000);
//	   driver.findElement(By.linkText("Must Learn")).click();
//	   Thread.sleep(3000);
//	   driver.findElement(By.linkText("Big Data")).click();	  
//	   Thread.sleep(3000);	
	  
	  driver.get("https://www.facebook.com/");	  
	  driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	  
	  
	  WebElement wb = driver.findElement(By.xpath("//select[@id ='day']"));  	  
	  Select sel = new Select(wb);
	  sel.selectByVisibleText("25");
	  
	  
	  WebElement wb1 = driver.findElement(By.xpath("//select[@id ='month']"));  	  
	  Select sel1= new Select(wb1);
	  sel1.selectByVisibleText("Jul"); 
	     
	  
	  
  }
  
  @Test(enabled = false)
  public void g1Test() throws InterruptedException
  {
	  
	  driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0, 300)", "");
	  
	  WebElement wb=driver.findElement(By.xpath("//select[@name='selenium_commands']"));	  
	  Select sel = new Select(wb);
	  
//	  if(sel.isMultiple())
//	  {
//		  sel.selectByVisibleText("Browser Commands");
//		  sel.selectByVisibleText("Navigation Commands");
//		  
//	  }
//	  else
//	  {
//		  sel.selectByVisibleText("WebElement Commands");
//	  }
	 	 
	  
	  List<WebElement> lst=sel.getOptions();
	  
	  for(int i =0; i<=lst.size()-1; i++)
	  {
		  
		  
//		  WebElement ab=lst.get(i);
//		  String str1=ab.getText();
//		  System.out.println(str1);
//		  
	      System.out.println(lst.get(i).getText());
		  
//		  String s=lst.get(i).getText();
//		  System.out.println(s);
		  
	  }
	  
	  for(int i=0;i<=lst.size()-1;i++)
	  { 
		sel.selectByIndex(i);
		Thread.sleep(2000);
		
		
	  }
	  
	  sel.deselectAll();
	  	  
  }
 
  
  @Test
  public void g2Test() throws InterruptedException
  {
	  
      driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0, 300)", "");
	  
	  WebElement wb=driver.findElement(By.xpath("//select[@name='selenium_commands']"));	  
	  
	  Select sel = new Select(wb);
	  
         List<WebElement> lst=sel.getOptions();
	  
         String exp="Wait Commands";
	  for(int i =0; i<=lst.size()-1; i++)
	  {
		  String act = lst.get(i).getText();
		  
		  if(act.equals(exp))
		  {
			  sel.selectByVisibleText(exp);
			  Thread.sleep(3000);
			  break;
		  }
		  
	  }
	  
	  
  }
  
  
  
  
  
  
  @AfterClass
  public void afterClass() {
	  
		driver.close();		
		  
		  
	  }
  
  
 
}
