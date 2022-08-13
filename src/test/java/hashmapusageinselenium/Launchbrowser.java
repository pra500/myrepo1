package hashmapusageinselenium;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Launchbrowser {

	public static void main(String[] args) throws InterruptedException {
		
	//like below we do in our script..need to chk code again
		
		WebDriver driver=null;
		 WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.browserstack.com/guide/how-to-find-broken-links-in-selenium");
			Thread.sleep(6000);			
			String str=Launchbrowser.geti().get(2);
			System.out.println(str);
		
			
		
			System.out.println(Launchbrowser.geti().get(2));

	}
	
	
	public static HashMap<Integer, String> geti()
	{
      HashMap<Integer, String> months=new HashMap<Integer, String>();		
		
      months.put(1, "jan");
      months.put(2, "feb");
      months.put(3, "march");
      months.put(4,  "april");
		
		return months;		
		
	}
	

}
