package datastructure;

public class BTpostorder {	
		
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
		
		
		public static Node postorder1()
		{
			
			Node rt1=new Node(40);
			
			Node n1=new Node(20);
			Node n2=new Node(60);
			Node n3=new Node(10);
			Node n4=new Node(30);
			Node n5=new Node(50);
			Node n6=new Node(70);	
			
			
			rt1.left=n1;
			rt1.right=n2;
			
			n1.left=n3;
			n1.right=n4;
			
			n2.left=n5;
			n2.right=n6;				
					
			
			return rt1;			
			
			
		}
		
		
		public void traverse1(Node nc)
		{
			
			if(nc!=null)
			{
				traverse1(nc.left);
				traverse1(nc.right);
				System.out.println(nc.data);
				
			}			
			
			
		}	
		
		
		
		
		public static void main(String[] args) {			
			
			BTpostorder bt1=new BTpostorder();
			Node nb=postorder1();
			bt1.traverse1(nb);
		
		

	}

}
