package seleniumdeep;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LaunchTest {
	
	WebDriver driver;
  //@Test
  public void Launchbrowser() throws InterruptedException {
	  
	  //try to take search text in id, xpath
	  // most porbably it will start from input tag dat search bar
	  
	  
	  
	   

		 WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			/*
			//amazon
			driver.get("https://www.amazon.in/");
			
			
			//driver.findElement(By.xpath("//form[@id='nav-search-bar-form']")).sendKeys("cap");
			
			driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("shoes");
			//driver.wait(2);
			driver.findElement(By.xpath("//div[@aria-label='shoes for men']")).click();
			*/
			
			
			
		
			 
			 //make my trip
			/*
			driver.get("https://www.makemytrip.com/");
			driver.findElement(By.xpath("//input[@placeholder='Enter City']")).sendKeys("delhi");
			driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();
			*/
			
			
			
			
			//searching python on google		
			
			//driver.get("https://www.google.com/");
			
			
			/*
			 * driver.findElement(By.name("q")).sendKeys("bangalore"); Thread.sleep(2000);
			 * 
			 * List<WebElement>
			 * list=driver.findElements(By.xpath("//ul[@role='listbox']//li")); for(int
			 * i=0;i<=list.size()-1;i++) {
			 * 
			 * if(list.get(i).getText().equalsIgnoreCase("bangalore metro map")) {
			 * list.get(i).click(); break;
			 * 
			 * }
			 * 
			 * 
			 * }
			 */
			
			
			
			
			//python trial
			
			/*
			 * driver.findElement(By.name("q")).sendKeys("python"); List<WebElement>
			 * lst1=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
			 * 
			 * 
			 * for(int i=0;i<=lst1.size()-1;i++) {
			 * if(lst1.get(i).getText().equalsIgnoreCase("python download")) {
			 * 
			 * lst1.get(i).click(); }
			 * 
			 * }
			 */
			
			
			/*
			 * //get the location of an element:
			 * 
			 * //search text box driver.get("http://automationpractice.com/index.php");
			 * Point
			 * p=driver.findElement(By.cssSelector("input#search_query_top")).getLocation();
			 * 
			 * int a1=p.getX(); System.out.println(a1); //489
			 * 
			 * int a2=p.getY(); System.out.println(a2); //153
			 */
			
			
			
			
						
			
			
			
			
			
			
			
			
			
			
			//for handling random pop up
			//WebDriverWait wait=new WebDriverWait(driver, 8);
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='modal-close']"))).click();
			
			
			
			
			//amazon search: need to chk again
					
			
			//div[@id='nav-flyout-searchAjax']//div//div//div[@class='s-suggestion s-suggestion-ellipsis-direction']
			
			driver.get("https://www.amazon.in/");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
			Thread.sleep(3000);
			
			//List<WebElement> li=driver.findElements(By.xpath("//div[@id='nav-flyout-searchAjax']//div//div//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
			
			List<WebElement> li=driver.findElements(By.xpath("//div[@id='nav-flyout-searchAjax']"));
			
			
			for(int i=0;i<=li.size()-1;i++)
			{
				if(li.get(i).getText()=="books under 100")
					
				{
					System.out.println(li.get(i).getText());
					li.get(i).click();
					break;
					
				}

			}			
		
		
			
  }
   
  
  @Test
  public void Launchbrowser1(){
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
	  
	
	  //total links
	  List<WebElement> l1i=driver.findElements(By.tagName("a"));
	  System.out.println(l1i.size());
	  
	  //total images
	  List<WebElement> l2i=driver.findElements(By.tagName("img"));
	  System.out.println(l2i.size());
	  
	  //total textboxes
	  List<WebElement> l3i=driver.findElements(By.tagName("input"));
	  System.out.println(l3i.size());
	  
	  
  }
}
