package pac1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenlinksTest {
	
	WebDriver driver=null;
	
  @Test
  public void fTest() throws InterruptedException, IOException {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.browserstack.com/guide/how-to-find-broken-links-in-selenium");
		Thread.sleep(6000);	
		List<WebElement> links = driver.findElements(By.tagName("a")); 
		//To print the total number of links
		System.out.println("Total links are "+links.size()); 
		//used for loop to 
		for(int i=0; i<links.size(); i++)
		{
		WebElement element = links.get(i);
		//By using "href" attribute, we could get the url of the requried link
		String url=element.getAttribute("href");
		//calling verifyLink() method here. Passing the parameter as url which we collected in the above link
		//See the detailed functionality of the verifyLink(url) method below
		verifyLink(url); 
		}

		  }

		public static void verifyLink(String urlLink) throws IOException {
		  //int count =0;
			try
			{
				
		URL link = new URL(urlLink);
		// Create a connection using URL object (i.e., link)
		HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
		//Set the timeout for 2 seconds
		httpConn.setConnectTimeout(2000);
		//connect using connect method
		httpConn.connect();

		//int count=0;
		int respCode = httpConn.getResponseCode();
		if(respCode >= 400){
		    System.out.println(link+" is a broken link");
		    
		}
		else{
		    System.out.println(link+" is a valid link");
		}
		
		
			}
		
			
			catch (Exception e) {
				 e.printStackTrace();
				 }
			
			
		}
		

		//Sometimes we may face exception "java.net.MalformedURLException". Keep the code in try catch block to continue the broken link analysis
		 



	 
  
}
