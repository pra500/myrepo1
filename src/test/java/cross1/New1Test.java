package cross1;

import org.testng.annotations.Test;

public class New1Test {
	
  @Test(priority = 1)
  public void f1Test() {
	  
	  System.out.println("mtd1");
  }
  
  @Test(priority = 2)
  public void f2Test() {
	  
	  System.out.println("mtd2");
  }
  
  
  
  
}
