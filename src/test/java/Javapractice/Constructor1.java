package Javapractice;


class Stud1
{
	int length;
	int breadth;
	
	Stud1(int l, int b)
	{
		length=l;
		breadth=b;
	}
	
	public void get2Data()
	{
		System.out.println("length is: "+length);
		System.out.println("breadth is: "+breadth);
	}	
	
}



public class Constructor1 {

	public static void main(String[] args) {
		
		Stud1 s1=new Stud1(12, 14);
		s1.get2Data();		
			

	}

}
