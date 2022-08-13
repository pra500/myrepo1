	package Grouping;

import org.testng.annotations.Test;

public class New1Test {
	
  @Test(priority= 1, groups = {"SmokeTest"})
  public void f1Test() {
	  System.out.println("hello1");
  }
  
  @Test(priority= 3, groups = {"RegressionTest"})
  public void f2Test() {
	  System.out.println("hello2");
  }
  
  @Test(priority= 2, groups = {"SmokeTest"})
  public void f3Test() {
	  System.out.println("hello3");
  }
  
  
  @Test(priority= 4, groups = {"RegressionTest"})
  public void f4Test() {
	  System.out.println("hello4");
  }
  
  @Test(priority =6, groups = {"SanityTest"})
  public void f5Test() {
  
	  System.out.println("7");
  }
  
  @Test(priority =5, groups = {"SanityTest"})
  public void f6Test() {
  
	  System.out.println("8");
  }
  
  @Test(priority =7, groups = {"SanityTest"})
  public void f7Test() {
  
	  System.out.println("9");
  }
  
}
