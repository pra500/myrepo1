package Javapractice;

class Studen1t{  
	 int rollno;  
	 String name;  
	 String city;  
	  
	 Studen1t(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	 
	 
	 public String toString()   	
	 {
		 return rollno+" "+name+" "+city;  
		 
	 }
}

public class Tostringmtdprac {

	public static void main(String[] args) {
		
		
		Studen1t s1=new Studen1t(101,"Raj","lucknow");  
		//System.out.println(s1); //Javapractice.Studen1t@2a139a55 without overriding 
		
		System.out.println(s1); //101 Raj lucknow
		
		 //return type always string	

	}


}

