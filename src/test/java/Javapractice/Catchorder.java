package Javapractice;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Catchorder {

	public static void main(String[] args){
		//throws always in mtd signa.	
		//all non checked r in java.lang		
		//all checked r in java.io		
		
		
		try {	
			
			int a=6/0;			
			
		}				
		
		catch(ArithmeticException e )
		{
			
			e.printStackTrace();
			System.out.println("1");
			
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("2");		
			
			
		}
		
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("3");	
		}
		
		catch(Exception e)
		{
			e.printStackTrace(); 
			System.out.println("4");	
		}
		
		
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//			
//		}
		
		//get message(); - used also to print the exception, always return type string, directly u can use like dat System.out.println(e.getMessage());
	}

}
