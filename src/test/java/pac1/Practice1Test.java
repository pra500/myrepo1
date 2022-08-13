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

public class Practice1Test {
  @Test
  public void f() {
	  System.out.println("1");
  }
  
  @Test
  public void f1() {
	  System.out.println("2");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("a");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("a1");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("aa");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("bb");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("aaa");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("bbb");
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("aaaa");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("bbbb");
  }

}
