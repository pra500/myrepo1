package Javapractice;


class A{
	
	int i=12;
	
	public void mi()
	{
		System.out.println("hi");
	}
}

class B extends A
{	
	
	public void mii()
	{
		
		System.out.println(super.i);
		super.mi();		
		System.out.println("hello");
		
	}
	
	
}

public class Superprac {

	public static void main(String[] args) {
				
	B b1=new B();
	b1.mii();
	

	}

}
