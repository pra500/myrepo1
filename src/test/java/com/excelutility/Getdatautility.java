package com.excelutility;

import java.util.ArrayList;

public class Getdatautility {
	
	 static Xls_Reader reader;
	
		
	public static ArrayList<Object[]> gtestdata()
	{
		
		ArrayList<Object[]> arr=new ArrayList<Object[]>();
		
		try{

	  // reader= new Xls_Reader("C:\\Users\\Pragti\\workspace\\Proj1\\src\\com\\exceltestdata\\yahootestdata.xlsx");
	   
	   reader= new Xls_Reader("H:\\dev\\proj1\\src\\com\\exceltestdata\\yahootestdata.xlsx");
			// reader= new Xls_Reader("C:\\Users\\Admin\\Desktop\\Proj1\\src\\com\\exceltestdata\\Book2.xlsx");
		
	      }
		
	catch(Exception e)
		{
		e.printStackTrace();
		}
			
		
		for(int i=2; i<=reader.getRowCount("regsheet"); i++)
		{
			
			String fname=reader.getCellData("regsheet", "firstname", i);
			String lname=reader.getCellData("regsheet", "lastname", i);
			String pwd=reader.getCellData("regsheet", "password", i);
			String bmonth=reader.getCellData("regsheet", "birthmonth", i);					
				
		//{fname, lname, pwd, bmonth};
		arr.add(new String []{fname, lname, pwd, bmonth});
			

}
		
		return arr;
		
	}
	
	
	

}
