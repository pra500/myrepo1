package seleniumdeep;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Stringprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		/*
		String str="madam";
		String str1="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
						
		}
		
	
		if(str.equalsIgnoreCase(str1))
		{
			
			System.out.println("palin");
		}
		else
		{
			System.out.println("not palin");
		}
			*/	
		
		/*
			
		//duplicate words 
	   	String str2="I girl m a good girl good girl";
         String[] words1=str2.split(" ");	         
         Map<String, Integer> map1=new HashMap<String, Integer>();
         
         for(String s:words1)
         {        	 
        	 if(map1.containsKey(s))
        	 {
        		 map1.put(s, map1.get(s)+1);
        		 
        	 }
        	 
        	 else
        	 {
        		 map1.put(s, 1);
        		 
        		 
        	 }        	 
        	 
         }
        
                  
        	 
         Set<Map.Entry<String, Integer>> set1=map1.entrySet();
         
         for(Map.Entry<String, Integer> a:set1)
         {
        	 if(a.getValue()>1)
        	 {
        		 System.out.println(a.getKey() + ":" +a.getValue());
        	 }  	 
        	     	 
    	            	 
         }
         
         */
	
		
		//replace - char, replaceAll - String
		
		
		String str="this is java this";
		
		System.out.println(str.replaceAll("this", "these"));
		
		
		String str1="amit";
		
		System.out.println(str1.replace('a', 'b'));
		
		
	String sths="this is java language";
	System.out.println(sths.replaceAll("java", "python"));
	
	
	String s2="meerut";
	System.out.println(s2.replace('m', 'n'));
	
		
		
	     
	     
     
	
                
         
         
         
         
         
         
        
		
		
		

	}

}
