package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConnectmysqlTest {
	
	
  @Test
  public void fTest() throws ClassNotFoundException, SQLException, InterruptedException {
	  
	  
	  WebDriver driver=null;	     
	  //driver name rememb., every db has its own driver
	  
	//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
      String dbUrl = "jdbc:mysql://localhost:3306/seleniumdb";					

		//Database Username		
		String username = "root";	
      
		//Database Password		
		String password = "pra18@123guptaGUPTA";				

		//Query to Execute		
		String query = "select *  from tab1;";	
      
	    //Load mysql jdbc driver		
 	    Class.forName("com.mysql.jdbc.Driver");			
 
 		//Create Connection to DB		
  	Connection con = DriverManager.getConnection(dbUrl,username,password);

		//Create Statement Object		
	   Statement stmt = con.createStatement();					

			// Execute the SQL Query. Store results in ResultSet		
		ResultSet rs= stmt.executeQuery(query);							

		// While Loop to iterate through all data and print results		
		while (rs.next()){
	        		String fi = rs.getString("firstname");	
	        		System.out.println(fi);
	        		
//	        		String fii = rs.getString("lastname");	
//	        		System.out.println(fii);
	        		
	        		
	        		   		
	        		WebDriverManager.chromedriver().setup();	        		
	    			driver= new ChromeDriver();			
	    			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	    			driver.manage().window().maximize();
	    			
	    			driver.get("https://login.yahoo.com/account/create?src=noSrc&specId=yidReg");
	    			Thread.sleep(6000);	    			
	    			driver.findElement(By.name("firstName")).clear();
	    			driver.findElement(By.name("firstName")).sendKeys(fi);	
	        		
	        		
	        		
	        		
	        		
	        		
                 	
          }		
			


  }
}
