package Stringdeepprac;

public class Arraysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		  int[] a={1, 8, 4, 6};
//		   System.out.println(a[2]); //4
//		   
//		   int[] a1={1, 8, 4, 6};
//		   System.out.println(a1[2]); //4
//		   
//		   
//		   
//		   String str="prag67k";
//		   
//		   char[] arr1=str.toCharArray();
//		   
//		   for(int i=0;i<=arr1.length-1;i++)
//		   {
//			   for(int j=1;j<=arr1.length-1;j++)
//			   {
//                   if(arr1[j]>=48 && arr1[j]<=57)
//                   {
//                	   System.out.println(arr1[j]);
//                	   break;
//                	   
//                   }
//				   
//				   
//				   
//				   
//	}
//
//		   }
		
		
		
		System.out.println("---------------");
		System.out.println("---------------");
		String stg1="";
		String stg="pra13";
		int digits = 0;
		for (int i = 0; i < stg.length(); i++) {
		    if (stg.charAt(i) >= 48 && stg.charAt(i) <= 57)
		    {
		    	System.out.print(stg.charAt(i));
		        digits++;
		}
		
		}
		
		System.out.println("Total number of Digits = "
                + digits);

	}
}
