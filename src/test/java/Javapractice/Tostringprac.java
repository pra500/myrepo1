package Javapractice;

//class Sample1
//{
//	String name;		
//	
//}
//
//
//public class Tostringprac {	
//	
//	public static void main(String[] args) {
//		
//		
//		Sample1 s1=new Sample1();  //Javapractice.Sample1@2a139a55
//		System.out.println(s1);
//		
//		Sample1 s2=new Sample1();
//		System.out.println(s2);
//		
//		
//		
//	
//	}
//
//}
//

class Sample1
{
	String str;
	
	public Sample1(String st)
	{
		str=st;
	}
	
	public String toString()
	{
		
		return str;
	}
	
	
}


public class Tostringprac {	
	
	public static void main(String[] args) {
		
		
		Sample1 s41=new Sample1("priya");  //Javapractice.Sample1@2a139a55
		System.out.println(s41);
			
		
		
	
	}

}
