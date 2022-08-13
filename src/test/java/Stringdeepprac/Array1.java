package Stringdeepprac;

public class Array1 {
	
	//how to find 3rd highest number in a array
	
	//first sort the array and then print 4th char 
	public static void getdata(int[] arr)
	{
		int temp;
		for(int i=0;i<=arr.length-1;i++)
		{
			
			for(int j=i+1;j<=arr.length-1;j++)
			{
				
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;				
					
					
				}
				
				
			}
		}				
	
		System.out.println(arr[2]);
		
	}
	
	
	
	
	public static void main(String[] args) {		
		
		int[] a= {1, 8, 3, 6, 7};
		getdata(a); //6
		
		

	}

	
	
	/*
	public static void main(String[] args) {	
		
		
		int temp, size;
		   int array[] = {10, 20, 25, 63, 96, 57};
		   size = array.length;
		   
		   for(int i = 0; i<size; i++ ){
		      for(int j = i+1; j<size; j++){
		         if(array[i]>array[j]){
		            temp = array[i];
		            array[i] = array[j];
		            array[j] = temp;
		         }
		      }
		   }
		   System.out.println("Third largest number is:: "+array[size-3]);
	}
	
	*/
}
