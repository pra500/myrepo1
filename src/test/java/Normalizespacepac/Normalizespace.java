package Normalizespacepac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Normalizespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = null;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		// driver.findElement(By.xpath("//a[normalize-space(text())='Thomas Cook
		// (I)']/parent::td/following-sibling::td[2]"));
		String str = driver.findElement(By.xpath("//a[normalize-space(text())='Indo Count Inds.']")).getText();
		System.out.println(str);
		
	//It removes all the trailing and leading spaces from the string.
		

	}

}
