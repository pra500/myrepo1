package Javapractice;

public class Stringprac {

	public static void main(String[] args) {
		
		
//		String s1="prag";
//		String s2="pRag";
//		
//		System.out.println(s1.equals(s2)); //false
//		System.out.println(s1.equalsIgnoreCase(s2)); //true 
		
		//exactly shld b  - true  - for equals, even single letter changed false 		
		
		//doesn't matter, content shold b same - for equalsignorecase
		
		
		
		
		//---------------
		//reverse
//		String str1="pragti";
//		String str2="";
//		
//		for(int i=str1.length()-1;i>=0;i--)
//		{
//			str2=str2+str1.charAt(i);
//			
//		}
//		System.out.println(str2);
		
		//----------
		//palin
		
//		String str1="madam";
//		String str2="";
//		
//		for(int i=str1.length()-1;i>=0;i--)
//		{
//			str2=str2+str1.charAt(i);
//			
//		}
//		if(str1.equalsIgnoreCase(str2))
//		System.out.println("palin");
//		else
//		System.out.println("not palin");	
//			
	//--------------------------		
	//split:
//		String str = "Javatpointis";  
//        System.out.println("Returning words:");  
//        String[] arr = str.split("t", 0);  
//        for (String w : arr) {  
//            System.out.println(w);  
//        }  
//        System.out.println("Split array length: "+arr.length);  
//		
		
		
//	//print char of a string
//        String str1="pragti";
//        for(int i=0;i<=str1.length()-1;i++)
//        {      
//
//        	
//        	System.out.println(str1.charAt(i));
//        	
//        }
//                 
//        
//			
//        System.out.println("-----------------------");
//
//        int[] a= {12, 13, 14};
//        for(int i=0;i<=a.length-1;i++)
//        {
//         System.out.println(a[i]);
//        }
        
        
   
//		String str1="pragtiajgh";
//		String[] a=str1.split("a");
//		 for(int i=0;i<=a.length-1;i++)
//		 {
//			 System.out.println(a[i]);
//		 }
//		 
		 
		 
//		 
//		 String str12="pragt ia3 jg 4h";
//			String[] a22=str12.split("\\s");  //whitespace/space called
//			 for(int i=0;i<=a22.length-1;i++)
//			 {
//				 System.out.println(a22[i]);
//			 }
		 
//		o/p: pragt
//			 ia3
//			 jg
//			 4h
			 
			 
		
//			 String str1="java is easy";
//			  String[] arr=str1.split(" ");
//			  for(int i=0;i)
//			 
		
		
		
		//String tr1="parg";
		
//		char co=tr1.charAt(2);
//		System.out.println(co); 
		
		//System.out.println(tr1.charAt(2));
//		String tr12="carg";
//		
//		System.out.println(tr1.equals(tr12));
//		
//		
//		System.out.println(tr12.compareTo(tr1)); //-13 alway pick first and then think = and - , always diff ll come 
//		
		
		//
		
		
		
		//string will not be changed that interviewer told so -1 ll come in sec loop also
		
		
		//duplicate char's in string
		
		/*
		String st5="pppthhi";	
		
		
		char[] ax=st5.toCharArray();
		
		//int count=0;
		for(int i=0; i<=ax.length-1; i++)
		{
			for(int j=i+1; j<=ax.length-1; j++)
			{				
				
				if(ax[i]==ax[j])
				{
					
					System.out.print(ax[j] + " ");
					
					break;
					
					
				}
				
				
			}
		}
		*/
		
		
		//need to chk below both pgm's
		
		String str= "This#string%contains^special*characters&.";
		str = str.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(str);
			 
			 

		
		String str1= "tyop9066j";
		String tt=str1.replaceAll("[0-9]", " ");
		System.out.println(tt);    //tyop    j
		
		
		
		
		
		 
//		
//		
//
//    
//		String str5="pragti";
//		char[] arr=str5.toCharArray();
//		for(char i=0;i<=arr.length-1;i++)
//		{
//			System.out.println(arr[i]);
//		}
//		
//		
		
//		int[] a=new int[4];
//		a[0]=12;
//		a[1]=14;		
//		a[2]=15;
//		
//		for(int i=0;i<=a.length-1;i++)
//		{
//			System.out.println(a[i]);
//		}
		//o/p:12, 14, 15, 0
		
			
		
//		
//		int[] a=new int[4];		
//		try
//		{
//			a[5]=45;
//			a[3]=55;
//			
//	
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			System.out.println(("invalid"));
//			//System.out.println(a[3]);
//			
//		}


//		int ar=12, b=13, temp;
//		temp=ar;
//		b=ar;
//		b=temp;
//		System.out.println(ar);
//		System.out.println(b);
//		
//		
//		
		//String str="pragti is good";
		
		
		
		
       
        
	}

}
