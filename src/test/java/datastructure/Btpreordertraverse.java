package datastructure;

public class Btpreordertraverse {
	
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
	
	
	public static Node creatBinTree()
	{
		
		Node rt1=new Node(40);
		
		Node n1=new Node(20);
		Node n2=new Node(10);
		Node n3=new Node(30);
		Node n4=new Node(60);
		Node n5=new Node(50);
		Node n6=new Node(70);		
	
		
		rt1.left=n1;
		rt1.right=n4;
		
		n1.left=n2;
		n1.right=n3;
		
		n4.left=n5;
		n4.right=n6;
		
		return rt1;
		
		
	}
	
	//preorder traversing by recursive way, der r multiple ways bt here we learn by recursive way
	
	
	public void preordertraverse(Node root1) //Nood is like a datatye	
	{
		
		if(root1!=null)
		{
			System.out.println(root1.data);
			preordertraverse(root1.left);
			preordertraverse(root1.right);
		}
		
	}	
	
	

	public static void main(String[] args) {
		
		Btpreordertraverse bt=new Btpreordertraverse();
		Node hx=creatBinTree();		
		bt.preordertraverse(hx);
		
		

	}

}
