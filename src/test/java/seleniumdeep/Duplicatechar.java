package seleniumdeep;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "naveen";

		char[] arr = str.toCharArray();

		Map<Character, Integer> m1 = new HashMap<Character, Integer>();

		for (Character c : arr) {
			if (m1.containsKey(c)) {

				m1.put(c, m1.get(c) + 1);

			}

			else {
				m1.put(c, 1);

			}

		}
		
		Set<Map.Entry<Character, Integer>> set1=m1.entrySet();
		for(Map.Entry<Character, Integer> mm:set1)
		{
			System.out.println(mm.getKey()+ ":" +mm.getValue());
		}
		
		
		
		

	}

}
