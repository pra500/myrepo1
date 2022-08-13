package pac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class PracticeTestNgTest {
	
	//before - preconditions
	//test - general work
	//after - postconditions
	
	//beforetest  then beforeclass
	
	@BeforeSuite
	  public void beforeSuite() {
		
		System.out.println("system property chrome");
		
	  }
	
	@BeforeClass
	  public void beforeClass() {
		
		System.out.println("launching chrome");
	  }
	
	@BeforeTest
	  public void beforeTest() {
		
		System.out.println("login to app");
	  }

  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("enter url");
  }

//test mtd's..........
  @Test
  public void f() {
	  
	  //System.out.println("any app actions");
	  System.out.println("first");
  }
  
  @Test
  public void f1()
  {
	  System.out.println("second");
  }
  
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("logout frm app");
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("delete all cookies");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("close browser");
  }

    
  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("after all the reports n all things done");
  }

}
