package pac1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.Get;

public class Listtrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List lst=new ArrayList();
		lst.add(12);
		lst.add(45);
		lst.add(36);
		
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i));
		}
		
		
		 for(Object o:lst)
		 {
		    	System.out.println(o);
		 }
		 

			Iterator it=lst.iterator();
		    while(it.hasNext())
		    {
		    	System.out.println(it.next());
		    }
		    
		    System.out.println("-------------------------");
		    
		    
//		    String str1=new String("java");
//		    System.out.println(str1);
//		    
//		    String str2="python";
//		    System.out.println(str2);
//		    
//		    StringBuilder sb=new StringBuilder("c++");
//		    System.out.println(sb);
//		    
//		    StringBuffer sb1=new StringBuffer("ruby");
//		    System.out.println(sb1);
		    
		    String str1="Tom";
		    String str2="Tom";
		    String str3 =new String("Tom");
		    String str4 =new String("tom");
		    
		    System.out.println(str1.equals(str2)); //true		    
		    
		    System.out.println(str1==str2); //true
		    
		    System.out.println(str1.equals(str3)); //true
		    
		    System.out.println(str1==str3); //false
		    
		    System.out.println(str1.equals(str4)); //false
		    
		    System.out.println(str1.equalsIgnoreCase(str4)); //true
		    
		    
		  
		    
		    
	}

}
