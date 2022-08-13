package Javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List lst=new ArrayList();
		lst.add(12);
		lst.add(45);
		lst.add(36);
		
		Collections.sort(lst);
		System.out.println(lst);
		
		
		ArrayList ar=new ArrayList();
		ar.add(23);
		ar.add(2);
		ar.add(88);
		Collections.sort(ar);
		System.out.println(ar);
		
	int[] a= {12, 22,4};
	Arrays.sort(a);
	for(int i:a)
	{
		System.out.println(i);
	}
//	
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
//		
	
	
	
	ArrayList ar1=new ArrayList();
	ar1.add(45);
	ar1.add(2);
	ar1.add(88);
	
			Iterator it=ar1.iterator();
		    while(it.hasNext())
		    {
		    	System.out.println(it.next());
		    }
		    
		    
		    for(Object o:ar1)
		    {
		    	System.out.println(o);
		    }
			
		    for(int i=0;i<ar1.size();i++)
		    {
		    	System.out.println(ar1.get(i));
		    }
		    
		   

	}

}
