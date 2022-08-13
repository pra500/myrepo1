package Javapractice;

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
import org.testng.annotations.Test;

public class Textboxes {	

	private static WebDriver driver;
 
  @BeforeClass
  public void beforeClass() {
	   
	     //System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");  
	    driver= new ChromeDriver();					
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);	
		driver.manage().window().maximize();		
		//driver.get("https://www.javatpoint.com/");
		//driver.get("http://output.jsbin.com/osebed/2");
		//driver.get("https://demo.guru99.com/test/web-table-element.php");
  }

  
  @Test(enabled=false)
  public void fTest() {
	  
	  List<WebElement>lst=  driver.findElements(By.xpath("//input[@type='text']")); 
	 System.out.println(lst.size());	  
	  
	  
  }
  
@Test(enabled=false)
public void f1Test() {	  
	
WebElement wb=driver.findElement(By.xpath("//select[@id='fruits']"));
Select sel=new Select(wb);
List<WebElement>lst=sel.getOptions();
System.out.println(lst.size());

	
for(int i=0;i<=lst.size()-1;i++)
	  {
		  String str=lst.get(i).getText();
		  if(str.equalsIgnoreCase("Apple"))
		  {
			  System.out.println("y");
			  System.out.println(lst.get(i).getText());
			  //lst.get(i).getText();
			  
		  }
		  
	  }
	  

	  }

@Test(enabled=false)
public void f5Test() {	 
	
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	//js.executeScript(document.get
	
	
	
}

//dynamic table

@Test(enabled=false)
public void f53Test() {	 
	
	//driver.findElement(By.xpath("//div[@id='leftcontainer']/table[@class='dataTable']//tbody//tr[6]//td[text()='493.5']"));
	List<WebElement> lst=driver.findElements(By.xpath("//div[@id='leftcontainer']/table[@class='dataTable']//tbody//tr"));
	System.out.println(lst.size());  //26
	
	List<WebElement> lst1=driver.findElements(By.xpath("//div[@id='leftcontainer']/table[@class='dataTable']//tbody//td"));
	System.out.println(lst1.size());  //130
	
	
	String sr=driver.findElement(By.xpath("//div[@id='leftcontainer']/table[@class='dataTable']//tbody//tr[2]//td[3]")).getText();
	System.out.println(sr);
	
}


  
	  
  
  @AfterClass
   public void afterClass() {
	  
	  driver.quit();
  }
  
  

}
