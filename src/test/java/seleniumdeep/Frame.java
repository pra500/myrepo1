package seleniumdeep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		
		
		 WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			
			/*
			//frames 
			driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
			Thread.sleep(6000);	
			
			//WebElement wb=driver.findElement(By.xpath("//iframe[@id='frame3' and @class=' ezlazyloaded']"));
			driver.switchTo().frame("frame3");
			driver.findElement(By.xpath("//input[@id='a']")).click();
			driver.switchTo().defaultContent();
			driver.close();
			
			//iframe[@id='frame3' and @class=' ezlazyloaded']//iframe[@id='frame3' and @class=' ezlazyloaded']
			*/
			
			
			/*
			driver.get("http://seleniumpractise.blogspot.com/2021/11/broken-links-and-images.html");			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 300)", "");
			driver.switchTo().frame("comment-editor");	
//			WebElement wb= driver.findElement(By.xpath("//select[@id='identityMenu']"));
//			Select sel=new Select(wb);
//			sel.selectByVisibleText("pragtigupta18@gmail.com (Google)");
			
			driver.findElement(By.xpath("//div[@class='genericAvatar']")).click();
			Thread.sleep(3000);
			
			*/
			
			driver.get("https://www.jdoodle.com/online-java-compiler/");
			WebElement wb=driver.findElement(By.xpath("//div[@class='select is-rounded is-small has-text-weight-bold version-dropdown']//select"));
			Select sel=new Select(wb);
			sel.selectByVisibleText("JDK 9.0.1");
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 200)", "");
			
			driver.findElement(By.cssSelector("textarea[name='stdin']")).sendKeys("x=10");
			driver.findElement(By.xpath("//div[@class='level execute-section is-hidden-print']//span[1]")).click();
			
			driver.quit();
			
			
			
			
			
			
			
			
			
			
			
			
	}
	
	
	

}
