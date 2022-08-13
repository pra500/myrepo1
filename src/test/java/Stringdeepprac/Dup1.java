package Stringdeepprac;

import java.util.HashSet;
import java.util.Set;

public class Dup1 {
	
    //ashu logic
	public static void duplicateWord(String str){
        int n = str.length();
        Set<Character> ch = new HashSet<Character>();

        for(int i=0; i<n; i++){
            if(!ch.add(str.charAt(i))){
                System.out.println(str.charAt(i));
            }
        }
    }

	public static void main(String[] args) {
		String s = "beautiful beach";
        duplicateWord(s); //u b e a
	}
	
	

}
