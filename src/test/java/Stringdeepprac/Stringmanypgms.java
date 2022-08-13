package Stringdeepprac;

import java.util.Arrays;
import java.util.HashSet;

public class Stringmanypgms {

	public static void main(String[] args) {
		
		/*
		//How to convert an array to string in Java?		
		String[] a= {"a", "b", "c"};
		
		StringBuilder sb=new StringBuilder();
		
		for (int i = 0;i <=a.length-1;i++) {
			
		sb.append(a[i]);
		sb.append(" ");
			
			
		}
		String s11=sb.toString().trim();
		System.out.println(s11);  //a b c		
    
	}
	*/
	
	
	
	
	// How to print duplicate characters from the string?
	
//	String st5="pppthhi";		
//	char[] ax=st5.toCharArray();
//	//int count=0;
//	for(int i=0; i<=ax.length-1; i++)
//	{
//		for(int j=i+1; j<=ax.length-1; j++)
//		{				
//			
//			if(ax[i]==ax[j])
//			{
//				System.out.print(ax[j] + "");
//				
//				break;
//				
//				
//			}
//			
//			
//		}
//	}
//	
//	
	
	//How to count the occurrence of the given character in a string?
	
     String str1="pragtgg";
    str1= str1.replace('g','y');
    System.out.println(str1);   //praytyy
     System.out.println(str1.replace('g','y'));  //praytyy
     
     
    String str2=new String("pragtgg");
    String str3= str2.replace('g','y');
    System.out.println(str3);    //praytyy
    
    System.out.println(str2.replace('g','y'));  //praytyy
    
    //everytime new obj
    String st5="pp";
    System.out.println(st5);
    String d=st5+"l";
    System.out.println(d); 
    /*
    
    //how to sort a string
    String st="pragti";
    char[] arr=st.toCharArray();
    char temp;
    for(int i=0; i<=arr.length-1; i++)
    {  
    	for(int j=1; j<=arr.length-1; j++)
    		
    		if(arr[j-1]>arr[j])
    		{
    			
    			temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
    			
    			
    			
    		}
    }
    
    for(char c1:arr)
    {
    	//System.out.println(c1);  //o/p in standing type
    	System.out.print(c1);  //agiprt
    	
    	
    }
       */
	
    
    //how to sort a no:
    
    
    int n=253;
   String s= Integer.toString(n);   
   char[] arr1=s.toCharArray();
   char temp1;
   
   for(int i=0;i<=arr1.length-1;i++)
   {
	   for(int j=1;j<=arr1.length-1;j++)
	   {
		   
		   if(arr1[j-1]>arr1[j])
		   {
			   
			   temp1 = arr1[j - 1];
				arr1[j - 1] = arr1[j];
				arr1[j] = temp1;
   			
			   
			   
		   }
	   }
   }
   
   for(char c:arr1)
   {
	   System.out.print(c);  //235
   }
   
   
   
 
   
   
   //hetrogeneous 
   Object[] objArr = new Object[] { 1, "kk", 3.8, 4, 'c' };      
   for(Object o:objArr) //only use for each not for otherwise error
   {
	   System.out.println(o);
   }
   
   
    

 //reverse, sort,
   
   
  //converting array to string using toString();
  int[] a={1, 8, 4, 6}; 
  String stt=Arrays.toString(a);
  System.out.println(stt);  //[1, 8, 4, 6]
  
  
  
  
  int[] af= {3, 8, 4};
     String g=Arrays.toString(af);
    String g1="";
  
  for(int i=g.length()-1;i>=0;i--)
  {
	   g1=g1+g.charAt(i);   	  
	  
  }
		   
  System.out.println(g1);  //]4 ,8 ,3[
  
//  //reversal of array
//  //need to chk below
//  int [] arr = {10, 20, 30, 40, 50};
//  int n2=arr.length;
//  int[] b=new int[n2];
//  
//  int j=n2;
//  
//  
//  for (int i = 0; i < n2; i++) {
//      b[j - 1] = a[i];
//      j = j - 1;
//  }
//  
//  System.out.println("Reversed array is: \n");
//  for (int k = 0; k < n; k++) {
//      System.out.println(b[k]);
//  }
//  
  
  //print only disits in a string
  
  String a2="pr3agti56k9k";  
 String a3=a2.replaceAll("[^0-9]", "");
 System.out.print(a3);
 
 

  
 

/*
System.out.println("---------------");
System.out.println("---------------");
String stg="pra13";
int digits = 0;
for (int i = 0; i < stg.length(); i++) {
    if (stg.charAt(i) >= 48 && stg.charAt(i) <= 57)
    {
    	System.out.println(stg.charAt(i));
        digits++;
}
System.out.println("Total number of Digits = "
                   + digits);

*/

//**************************
int number=158;
int r = 0;

while(number>0)
{
	number=number/10;
	r++;
}
		
System.out.println(r);


//String str="pra123";
//int t=str.length();
//
//for (int i = 0; i < str.length(); i++) {
//	
//	Character.isDigit(str);
//	
//}


//String stg="pra13";
//int digits = 0;
//for (int i = 0; i < stg.length(); i++) {
//    if (stg.charAt(i) >= 48 && stg.charAt(i) <= 57)
//        digits++;
//}
//System.out.println("Total number of Digits = "
//                   + digits);

//1=49,3=51

/*
System.out.println("----------------");
String stg3="pragti13";
int digits3 = 0;
for (int i = 0; i < stg3.length(); i++) {
    if (stg3.charAt(i) >= 97 && stg3.charAt(i) <= 122)
    {
    	//System.out.println(stg3.charAt(i));
    	System.out.println(stg3.charAt(i));
        digits3++;
    
}
}
System.out.println("Total number of Digits = "
                   + digits3);

*/

//if asked print the disits then how many disits
//then first 
//System.out.println(stg.charAt(i));
//then
//count++;
//then at the very last print count


//
  
  
  
 
  
  //count no of words 
// String sty2="pragti gupta";



//find duplicate 
String str = "beautiful beach";
char[] carray = str.toCharArray();
for (int i = 0; i < str.length(); i++) {
   for (int j = i + 1; j < str.length(); j++) {
      if (carray[i] == carray[j]) {
         System.out.print(carray[j] + " ");
         break;
      }
   }
}
//o/p: b e a u




String st = "beautiful beach";
for (int i = 0; i < st.length(); i++) {
   for (int j = i+1; j < st.length(); j++) {
      if (st.charAt(i)== st.charAt(j)) {
         System.out.print(st.charAt(j) + " ");
         break;
      }
   }
}
//o/p: b e a u


//String st = "eautiful beach";
//int count=0;
//
//for (int i = 0; i < st.length(); i++) {
// for (int j = i+1; j < st.length(); j++) {
//    if (st.charAt(i)== st.charAt(j)) {
//       System.out.print(st.charAt(j) + " ");
//       count++;
//       break;
//       
//    }
// }
//}
//System.out.println(count);
//


//break always in the end
  
  
  //"", ', count, ssyout inside /outside , printing the o/p 



//int[] arr= {3, 5, 8, 5, 3, 9, 10};
//
//for
//

System.out.println("--------------------");

String stg="pra1366i";
int digits = 0;
for (int i = 0; i < stg.length(); i++) {
  if (stg.charAt(i) >= 48 && stg.charAt(i) <= 57)
  {
	  System.out.println(stg.charAt(i) + " ");
	  
  }
}

//1 
//3 
//6 
//6 
  
     // digits++;

//System.out.println("Total number of Digits = "
//                 + digits);

/*
System.out.println("-------------");
String sty="ghjiikgl";
int count=0;
for(int i=0;i<=sty.length()-1;i++)
{
	
	for(int j=i+1;j<=sty.length()-1;j++)
	{
		
		if(sty.charAt(i)==sty.charAt(j))
		{
			System.out.println(sty.charAt(i));
			count++;
		}
	}
	
	
}
System.out.println(count);



System.out.println("-------------");
String st9="0p67jj";
int count1 =0;
for(int i=0;i<=st9.length()-1;i++)
{
	if(st9.charAt(i)>=48 && st9.charAt(i)<=57)
	{
		System.out.println(st9.charAt(i));
		count1++;
	}
	
}
System.out.println(count1);


String sth1="praght";
char[] arr=sth1.toCharArray();
char temp2;

for(int i=0;i<=arr.length-1;i++)
{
	
	for(int j=i+1;j<=arr.length-1;j++)
	{

		if(arr[i]>arr[j])
		{
			
			
			temp2=arr[i];
			arr[i]=arr[j];
			arr[j]=temp2;		
			
		}
  }	
	
}

for(char c:arr)
{
	System.out.println(c);
}


int n3=5, fact=1;
for(int i=1;i<=n3;i++)
{
	fact=fact*i;
}

System.out.println(fact);
	}
	
	
	
//reversal of words of a string
	
*/
   System.out.println("-----");
	int x1=0, x2=1, n1=20, c;
	
	System.out.println(x1);
	System.out.println(x2);
	
	for(int i=2;i<=18;i++)
	{
		c=x1+x2;
		System.out.println(c);
		
		x1=x2;		
		x2=c;		
		
	}
	
	
	
	//prime
	int x4=13, tm=1;
	for(int i=2;i<=x4-1;i++)
	{
		if(x4%i==0)
		{
			tm=0;
			break;
		}
	}
 if(tm==1)
 {
	 System.out.println("prime");
 }
 
 else
 {
	 System.out.println("not prime");
 }
	
 
 int p=4;
 System.out.println(p++);
 //System.out.println(p);
 
 int h=9;
 System.out.println(++h);
 
 
 
 
 
 
 
 
 
	}
}
	
	
	

