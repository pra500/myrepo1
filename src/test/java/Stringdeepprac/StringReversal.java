package Stringdeepprac;

public class StringReversal {
	
	public static void getrev(String s)
	{
		
		String sh="";
		for(int i=s.length()-1;i>=0;i--)
		{
			sh=sh+s.charAt(i);
			
		}
		System.out.println(sh);
		
	}
	
	
	
	
	

	public static void main(String[] args) {		
		
		String str="pragti";
		getrev(str);
		

	}

}
