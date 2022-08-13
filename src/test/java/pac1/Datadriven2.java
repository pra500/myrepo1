package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excelutility.Xls_Reader;

public class Datadriven2 {
	
	private static WebDriver driver;

	public static void main(String[] args) {		
		
		
		Xls_Reader xdr=new Xls_Reader("C:\\Users\\Admin\\Desktop\\Book1.xlsx");
		
		String fn=xdr.getCellData("regsheet", "firstname", 2);
		
		String ln=xdr.getCellData("regsheet", "lastname", 2);
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver= new ChromeDriver();			
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://login.yahoo.com/account/create?src=noSrc&specId=yidReg");
			
			driver.findElement(By.id("usernamereg-firstName")).clear();
			driver.findElement(By.id("usernamereg-firstName")).sendKeys(fn);
			
			driver.findElement(By.id("usernamereg-lastName")).clear();
			driver.findElement(By.id("usernamereg-lastName")).sendKeys(ln);
			
			driver.quit();
			
			
	
		

	}

}
