package datastructure;

import java.util.Stack;

public class Stackprac {

	public static void main(String[] args) {		

		Stack st1=new Stack();
		st1.push(1);
		st1.push(5.8);
		st1.push("prachi");
		st1.push(6.9);
		st1.push('k');
		System.out.println(st1);  //[1, 5.8, prachi, 6.9, k]
		
		st1.pop();
		System.out.println(st1); //[1, 5.8, prachi, 6.9]
		st1.pop();
		System.out.println(st1); //[1, 5.8, prachi]
		st1.peek();
		System.out.println(st1); //[1, 5.8, prachi]
		Boolean b=st1.empty();
		System.out.println(b); //false
		
		int y=st1.search("prachi");
		System.out.println(y);  //1    //it ll consider [1, 5.8, prachi], now 1,2,3 .... index frm top 
		
		
		int y1=st1.search(5.8);
		System.out.println(y1); //2
		
		int y2=st1.search(1);
		System.out.println(y2); //3
		
		
		Stack<String> st2=new Stack<String>();
		st2.push("ab");
		st2.push("cd");
		st2.push("cd1");
		st2.push("cd2");
		st2.push("cd3");		
		System.out.println(st2);  //[ab, cd, cd1, cd2, cd3]			
		
		
	}

}
