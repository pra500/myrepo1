package Javapractice;

public class Containsprac {

	//notes: searches a string inside a string, can't search a char inside a string, matches exact string, can't gv NULL, 
	//return boolean 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="what do you know about me";		
		Boolean b=str1.contains("know about me");
		System.out.println(b);  //true
		
		
		Boolean bq=str1.contains("know about me hello");
		System.out.println(bq);   //false
					
		
		
//		Boolean bq1=str1.contains('k'); //not allowed 
//		System.out.println(bq1);
		
		
//		String str="pragti gupta is a good girl";
//		if(str.contains(null))      
//		{
//			System.out.println("hello");  
//			
//		}
//		else
//		{
//			System.out.println("wel");
//		}
		
		//will show  java.lang.NullPointerException
		
		System.out.println("------------");
		String str2="java is easy";
		System.out.println(str2.contains("JAVA IS"));  //searches exact string //false
		
		
	System.out.println("---------");
	
	String str6="pragti";
	System.out.println(str6.startsWith("p")); //true
	
	
	String str7="pragti";
	System.out.println(str7.endsWith("p"));  //false
	
	System.out.println("---------------");
	
     String str4="pragati";
     System.out.println(str4.length()-str4.replace("a", "").length());
	
	
	System.out.println(str4.replace("a","y"));
	
	
	System.out.println(str4.replace("a",""));
	
	System.out.println(str4.replace("a"," "));
	
	
	System.out.println("---------------------");	
	
	int[] arr= {12,13,14};
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]);
	}
		
	int[] arr1= {12,13,14};
	for(int i:arr1)
	{
		System.out.println(i);
	}

	String str8="pragti";
	for(int i=0;i<=str8.length()-1;i++)
	{
		System.out.println(str8.charAt(i));
	}
	
 //note: //for each: always with array, always first to last
	
	
	String st5="pragya";
	for(int i=st5.length()-1;i>=0;i--)
	{
		System.out.println(st5.charAt(i));
	}
		
	System.out.println("----------------");
	int i=8;
	String h=Integer.toString(i);
	System.out.println(h);
	
	System.out.println("----------------");
	int c = 1234;
    String str3 = String.valueOf(c);
    System.out.println("String str3 = " + str3);
	
//	String stg="praggg";
//	Integer i=new Inte
//	Integer.parseInt(stg);
//	System.out.println(stg);
//	
    System.out.println("----------------");
	int d = 1234;
    Integer obj = new Integer(d);
    String str42 = obj.toString();
    System.out.println("String str4 = " + str42);
    
    System.out.println("----------------");
    StringBuilder sb=new StringBuilder("tom");
    String b2=sb.toString();
    System.out.println(b2);
    
    
    
    
    
    
    
	
	/*
  //very extra:
	int num = 10;
    char ch = 'G';
    String str = "GeeksforGeeks";
    double d = 10.2;
    float f = 13.5f;
    boolean bool = true;
    
    System.out.println(num+1);  //11
	
System.out.println(ch+'h'); //Gh

char t=(char) (ch+'h');
System.out.println(t);	

System.out.println(), 
System.out.println(int), 
System.out.println(double), 
System.out.println(string), 
System.out.println(character), 


//PrintStream has around 10 different overloads of println() method that are invoked based on the type of parameters passed by the user.

//https://www.geeksforgeeks.org/system-out-println-in-java/
 
 //need to study again..may be whole o/p we need to chk..
 */
	
	
	
	}

}
