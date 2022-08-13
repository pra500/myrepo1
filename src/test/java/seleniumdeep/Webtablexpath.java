package seleniumdeep;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtablexpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=null;
		 WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			//driver.get("https://cosmocode.io/automation-practice-webtable/");
			
			driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
			
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 900)","");
		
		
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.pre
//			
			
			//algeria checkbox will be checked
			//driver.findElement(By.xpath("(//td//strong[text()='Algeria']//preceding::td//input)[3]")).click();
			
			
			
//		String str=driver.findElement(By.xpath("(//td//strong[text()='Belgium']/following::td)[2]")).getText();
//		System.out.println(str);//EURO
			
			//total no of everything ?
			
			
		//driver.findElement(By.xpath("//td[contains(text(),'Tirane')]//parent::tr//preceding::tr//input")).click();
		/*
		(//td[contains(text(),'Algiers')]//parent::tr//preceding-sibling::tr//td//input)[2]
		*/
		
	
		
		boolean flag=false;
		List<WebElement> lst=driver.findElements(By.xpath("//table[@summary='Sample Table']//tr"));		
		//List<WebElement> lst=driver.findElements(By.xpath("//table[@summary='Sample Table']//tr//td"));
		for(int i=0;i<=lst.size()-1;i++)
		{
			
			if(lst.get(i).getText().contains("China"))
			{
				flag=true;
				break;				
				
			}
		}		
		Assert.assertTrue(flag, "value not matched");
		
		
		
		
	}

}
