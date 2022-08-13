package Javapractice;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class NewTest 
{
	
	//u can run tc frm any annotation but der must be a @Test annot. in dat class
  @Test
  public void f() {
  }
//  @BeforeMethod
//  public void beforeMethod() {
//	  
//	  System.out.println("kk");
//  }
  
  
//  
//  @AfterClass
//  public void n()
//  {
//	  System.out.println("k");
//  }
  
//  @AfterMethod
//  public void n1()
//  {
//	  System.out.println("k");
//  }
  
  @BeforeSuite
  public void n1()
  {
	  System.out.println("k");
  }

}
