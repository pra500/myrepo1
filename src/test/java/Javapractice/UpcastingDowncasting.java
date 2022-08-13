package Javapractice;


class Parent {
	
    String name; 
    
    String age;
   
   public void method()
    {
        System.out.println("Method from Parent");
    }
}
 
// Child class
class Child extends Parent {
    int id;
 
    public void method()
    {
        System.out.println("Method from Child");
    }
}
 



public class UpcastingDowncasting {

	public static void main(String[] args) {
		
		
		Parent p = new Child();
        p.name = "GeeksforGeeks";
 
        System.out.println(p.name);
       
        p.method();
 
        // Trying to Downcasting Implicitly
        // Child c = new Parent(); - > compile time error
 
        // Downcasting Explicitly
        Child c = (Child)p;
 
        c.id = 1;
        System.out.println(c.name);
        System.out.println(c.id);
        c.method();
        
        System.out.println(p.id);
    }

	}


