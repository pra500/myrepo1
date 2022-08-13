package Stringdeepprac;

public class Arraypractice1 {
	//need to chk again:
	//duplicate numbers
//	public static void getduplicate(int[] arr)
//	{
//	    for(int i=0;i<=arr.length-1;i++)
//	    {
//	    	for(int j=i+1;j<=arr.length-1;i++)
//	    	{
//	    		if(arr[i]==arr[j])
//	    		{
//	    			System.out.println(arr[i] + " ");
//	    			break;
//	    			
//	    			
//	    		}
//	    			
//	    	}
//	    }
//		
//		
//	}
//
//	
//	
//	public static void main(String[] args) {
//		int[] a= {5, 9, 3, 6, 9, 7, 5};
//		getduplicate(a);
//		
//
//	}
	
	public static void main(String[] args) {
		
		String sthy="you shall not pass";
		
		String s[] = sthy.split(" "); 
	      String ans = ""; 
	      for (int i = s.length - 1; i >= 0; i--) { 
	        ans += s[i] + " "; 
	      } 
	      System.out.println("Reversed String: " + ans); 
		
		
	}

}
