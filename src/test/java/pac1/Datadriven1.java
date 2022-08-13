package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excelutility.Xls_Reader;

public class Datadriven1 {
	
	 
	
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//take data from excel sheet
		
		Xls_Reader xder=new Xls_Reader("C:\\Users\\Pragti\\workspace\\Proj1\\src\\com\\exceltestdata\\yahootestdata.xlsx");
		
		  String firstname=xder.getCellData("regsheet", "firstname", 2);
		  System.out.println(firstname);
		  
		  String lastname=xder.getCellData("regsheet", "lastname", 2);
		  System.out.println(lastname);
		  
		  String password=xder.getCellData("regsheet", "password", 2);
		  System.out.println(password);
		  	    
		  String birthmonth=xder.getCellData("regsheet", "birthmonth", 2);
		  System.out.println(birthmonth);
		  
		    
		  
		    //script part
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver= new ChromeDriver();					
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.manage().window().maximize();		
			driver.get("https://login.yahoo.com/account/create?src=noSrc&specId=yidReg");
			Thread.sleep(6000);
			
			
			driver.findElement(By.name("firstName")).sendKeys(firstname);			
			Thread.sleep(3000);
			
			driver.findElement(By.id("usernamereg-lastName")).clear();
			driver.findElement(By.id("usernamereg-lastName")).sendKeys(lastname);
			Thread.sleep(3000);
			
			driver.findElement(By.id("usernamereg-password")).clear();
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
