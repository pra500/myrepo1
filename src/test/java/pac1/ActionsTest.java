package pac1;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

public class ActionsTest {
	
	private static WebDriver driver;
	
	 
	  @BeforeClass
	  public void beforeClass() 
	  {
		  
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver= new ChromeDriver();			
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
						
			
					}
			
		  
@Test(enabled = false)
public void fTest() throws InterruptedException {
					
	
	//other app
//	driver.get("https://demoqa.com/menu/");
//	
//	WebElement wb1=driver.findElement(By.xpath("//a[text()='Main Item 2']"));	
//	Actions act=new Actions(driver);
//	act.moveToElement(wb1).build().perform();
//	Thread.sleep(4000);
//	
//	WebElement wb2=driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
//	Actions act1=new Actions(driver);
//	act1.moveToElement(wb2).build().perform();
//	Thread.sleep(3000);
//	
//	
//	driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']")).click();
//	

	driver.get("https://www.spicejet.com/");
	
	//movetoelement
	WebElement wb =driver.findElement(By.xpath("//div[text()='Add-ons']"));
	  
	Actions act=new Actions(driver);
//	act.moveToElement(wb).build().perform();
//	
//     Thread.sleep(8000);
//     driver.findElement(By.xpath("//div[text()='Priority Check-in']")).click();
	
     //contextclick	
     WebElement wb1 =driver.findElement(By.linkText("Gift Card"));
	act.contextClick(wb1).build().perform();
	
	//doubleclick
     WebElement wb2 =driver.findElement(By.linkText("SpiceClub"));     
     act.doubleClick(wb1).build().perform();
	
	//************************
	//move to element      
     
		  

}


//sendkeys trial
@Test(enabled = false)
public void trialsendkeysTest() throws InterruptedException
{
	//IllegalArgumentException is keys is null
	//release()
	//all mtd's static mtd's ?
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	
	
	//act.sendKeys(Keys.TAB);
	//act.sendKeys(Keys.ENTER);
	
//	WebElement wb=driver.findElement(By.name("firstname"));
//	wb.sendKeys("pragti");
//	Actions act=new Actions(driver);
//	act.sendKeys(wb, Keys.chord(Keys.CONTROL+ "a"));
//	act.sendKeys(wb, Keys.chord(Keys.CONTROL+ "c"));
//	
//	WebElement wb1=driver.findElement(By.name("lastname"));
//	act.sendKeys(wb1, Keys.chord(Keys.CONTROL+ "v"));
//	
	
	
	
//	act.sendKeys(Keys.ENTER).build().perform();
//	Thread.sleep(5000);
	
//	WebElement wb=driver.findElement(By.name("firstname"));
//	
//	act.sendKeys(wb, Keys.TAB).build().perform();
//	
//	WebElement wb1=driver.findElement(By.name("lastname"));
//	act.sendKeys(wb1, Keys.)
//	build().perform();
//	
//	
//		
	
	
//driver.findElement(By.name("firstname")).sendKeys("ankur");
//Actions act=new Actions(driver);
//act.sendKeys(Keys.TAB)
//.sendKeys("gupta")
//.sendKeys(Keys.TAB)
//.sendKeys("8889090078")
//.sendKeys(Keys.TAB)
//.sendKeys("admin@123")
//.sendKeys(Keys.TAB)
//.build()
//.perform();


WebElement wb=driver.findElement(By.name("firstname"));
Actions actions=new Actions(driver);


	
	
}


@Test(enabled = false)
public void f1Test() throws InterruptedException
{
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Actions act=new Actions(driver);
	//act.sendKeys(Keys.ENTER)
	
	
	//().perform();
	Thread.sleep(4000);
	
}

//java.lang.IllegalArgumentException:
@Test(enabled = false)
public void f2Test()
{
	driver.get("https://www.google.com");
	// Typing null search keyword
//	String inputString = null;
//	driver.findElement(By.name("q")).sendKeys(inputString);
	driver.findElement(By.name("q")).sendKeys(null);
//	
	//driver.findElement(By.name("q")).sendKeys();
	
	//it's correct, no exception ll come
	//driver.findElement(By.name("q")).sendKeys("");
	
}

@Test(enabled = false)
public void jTest()
{
	driver.get("https://demoqa.com/menu/");
	
	WebElement wb1=driver.findElement(By.xpath("//a[text()='Main Item 2']"));	
	WebElement wb2=driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
	Actions act=new Actions(driver);
	act.moveToElement(wb1).moveToElement(wb2).build().perform();
	driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']")).click();	
	
}

@Test(enabled = true)
public void f21Test() throws InterruptedException
{
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	WebElement wb=driver.findElement(By.name("firstname"));
	Actions act=new Actions(driver);
	act.sendKeys(wb, Keys.chord(Keys.TAB, Keys.ENTER)).perform();
	
	//build always where two funct's are der 
	
	
	
}

}
