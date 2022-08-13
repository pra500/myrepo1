package datastructure;

public class BTinordertraverse {	
	
	public static class Node
	 {
		int data;
	  Node left;
	  Node right;
	  Node(int d)
	  {
		  this.data=d;
	  }	  
		
	}
	
	public static Node getinorder()
	{
		Node rt=new Node(10);
		
		Node n1=new Node(20);
		Node n2=new Node(40);
		Node n3=new Node(50);
		Node n4=new Node(30);
		Node n5=new Node(60);
		Node n6=new Node(70);
		 
		rt.left=n1;
		rt.right=n4;
		
		n1.left=n2;
		n1.right=n3;
		
		n4.left=n5;
		n4.right=n6;
		
		return rt;		
			
	}
	
	
	public void intraverse(Node nr)
	{		
		if(nr!=null)
		{
			intraverse(nr.left);
			System.out.println(nr.data);
			intraverse(nr.right);
		}		
		
	}
	

	public static void main(String[] args) {
		
		BTinordertraverse bti=new BTinordertraverse();
		Node nx=getinorder();
		bti.intraverse(nx);	
		
	}
	
	

}
