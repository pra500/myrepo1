package Javapractice;

class Ch1{
	
	public void get()
	{		
		System.out.println("hello");
		
	}
	
	public void get(char cx)
	{		
		System.out.println(cx);
		
	}
	
	public void get(char cx1, char cf)
	{		
		System.out.println(cx1);
		System.out.println(cf);
		
	}
	
	public void get(String str)
	{		
		System.out.println(str);
		
	}
	
	
			
}


class Ch2 extends Ch1{	
	

	public void get(int c, double d) {
		
		System.out.println(c);
		System.out.println(d);
		
	}	
	
}


public class Overload1 {

	public static void main(String[] args) {
		
		
//		Ch1 c1=new Ch1();
//		c1.get();
//		
		Ch2 c2=new Ch2();
		c2.get(45, 4.8);
		
		c2.get();
		c2.get('v');
		
		c2.get("prachi");
		
		
		

	}

}
