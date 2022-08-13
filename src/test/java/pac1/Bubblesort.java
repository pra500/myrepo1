package pac1;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] args1 = { 12, 45, 89 };
//		
//		
//		
//		for (int i = 0; i <= args1.length-1; i++) {
//			
//			for (int j = 0; i <= args1.length; j++)
//			{
//				
//				if(args[j]>args[j+1])
//				
//				
//			}
//			
//			
//		}
//		

		/*
		 * int a[]= {11,6, 40}; //int temp;
		 * 
		 * for(int i=0; i<=a.length-1;i++) { for(int j=0;j<=a.length-i;j++) {
		 * 
		 * if(a[j]>a[j-1]) {
		 * 
		 * temp=a[j]; a[j]=a[j+1]; a[j+1]=temp; } } }
		 */

		System.out.println("----------");
		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };

		int n = arr.length;
		int temp = 0;
		for (int i = 0; i <= n - 1; i++) {
			for (int j = 1; j <= (n - 1); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}

		}

		for (int i : arr) {
			System.out.println(i);
		}

	}
}
