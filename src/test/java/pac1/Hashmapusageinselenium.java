package pac1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

public class Hashmapusageinselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HashMap<String, Integer> Table = new HashMap<String, Integer>();
		    Table.put("JAN", 1);    
		    Table.put("FEB", 2);    
		    Table.put("MAR", 3);    
		    Table.put("APR", 4);    
		    Table.put("MAY", 5);    
		    Table.put("JUN", 6);    

		    String testdata="MAR";		    
		    Integer curMon = Table.get(testdata);
		    System.out.println(curMon);
		    
		    
		    
		
		
		 



	 


	}

}
