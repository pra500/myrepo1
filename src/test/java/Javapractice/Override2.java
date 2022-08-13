package Javapractice;

class Bank
{
	protected void  getintrest(int a, double b)
	{
	System.out.println(a);
	System.out.println(b);
	}
	
}

class Axis extends Bank
{
	private void getintrest(int v, char v1)
	{
		
		int t=v+v;
		System.out.println(t);	
		System.out.println(v1);
		
		
	}
}



public class Override2 {

	public static void main(String[] args) {
		
		Bank b1=new Bank();
		b1.getintrest(3, 4.7);
		
				
		Axis a1=new Axis();
		a1.getintrest(5, 5.8);
		
		
		
		
		

	}

}
