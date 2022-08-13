package seleniumdeep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1Test {

	WebDriver driver = null;

	@Test
	public void fTest() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.jdoodle.com/online-java-compiler/");
		WebElement wb = driver.findElement(
				By.xpath("//div[@class='select is-rounded is-small has-text-weight-bold version-dropdown']//select"));
		Select sel = new Select(wb);
		sel.selectByVisibleText("JDK 9.0.1");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200)", "");
		
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("//label[@for='interactiveMode']")).click();
		
		driver.findElement(By.xpath("//label[@for='interactiveMode']")).click();
			
		

		driver.findElement(By.cssSelector("textarea[name='stdin']")).sendKeys("x=10");
		driver.findElement(By.xpath("//div[@class='level execute-section is-hidden-print']//span[1]")).click();

		driver.quit();


		
		
	}
}
