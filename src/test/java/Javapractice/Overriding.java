package Javapractice;

class Run11{
	
	public void mi()
	{
		int t =9;		
		System.out.println(t);
	}
	

}

class Run21 extends Run11{
	
	public void mi()
	{
		String str1="pragti";		
		System.out.println(str1);
	}
	

}

class  Overriding
{
	public static void main(String[] args)
	{
		Run11 r1=new Run11();
		r1.mi();
		
		Run21 r2=new Run21();
		r2.mi();
		
		
		
	}
}