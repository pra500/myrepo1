package Javapractice;

class Child1{
	
	public void get(){}
		
	
}


class Child2 extends Child1{
	
	public void get()
	{
		System.out.println("wc");
		
	}	
	
}

public class Overriding1 {

	public static void main(String[] args) {
		
		Child1 c1=new Child1();
		c1.get();
		
		Child2 c2=new Child2();
		c2.get();
		

	}

}
