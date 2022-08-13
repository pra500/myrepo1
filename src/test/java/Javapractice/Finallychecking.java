package Javapractice;

public class Finallychecking {

	public static void main(String[] args) {
		
		try {			
	       //below code throws divide by zero exception  
	       int data=25/0;    
	       System.out.println(data);  	       
	      }   
	  
	      //handles the Arithmetic Exception / Divide by zero exception  
	      catch(ArithmeticException e){  
	        e.printStackTrace();
	        System.exit(0);
	      }   
	  		
	      //executes regardless of exception occured or not   
	      finally {  
	        System.out.println("logout");  
	      }    
	  
			        
	      }    
	    }  

	

	

