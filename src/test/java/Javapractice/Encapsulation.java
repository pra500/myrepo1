package Javapractice;


public class Encapsulation {
	
	private int rollno;
	private String name;
	private String fname;
	
	

	public static void main(String[] args) {
		
		Encapsulation e1=new Encapsulation();
		e1.setRollno(56);
		e1.setName("pragti");
		e1.setFname("pradeep");
		
		int t =e1.getRollno();
		System.out.println(t);
		
		
		String str1=e1.getName();
		System.out.println(str1);
		
		String str2=e1.getFname();
		System.out.println(str2);

	}
	

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public String getFname() {
		return fname;
	}



}
