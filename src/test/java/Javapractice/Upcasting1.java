package Javapractice;

class A{
	
	 public void method()
	    {
	        System.out.println("Method from Parent");
	    }
}

class B extends A
{
	
	 public void method()
	    {
	        System.out.println("Method from Child");
	    }
	
	
	
}

public class Upcasting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1=new B();
	a1.method();

	}

}
