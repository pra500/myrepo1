package Stringdeepprac;

public class Class1 {
	
	
	
	
	public static void getreversewords(char[] a)
	{
		StringBuilder sb=new StringBuilder();
		for(int i=a.length-1;i>=0;i--)
		{
			sb.append(a[i]);
			sb.append(" ");
			
		}
		
		System.out.println(sb.toString().trim());
		
		
		
	}

	public static void main(String[] args) {
		
		String str="india is gud";
		char[] arr=str.toCharArray();
		getreversewords(arr);   //d u g   s i   a i d n i
		

	}

}
