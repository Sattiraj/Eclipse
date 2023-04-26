import java.util.Arrays;

public class SecondMaxValue {

	public static void main(String[] args) {

		
		
		 int temp, size;
	      int ar[] = {10, 205, 2065, 6366, 96, 5557};
	      size = ar.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(ar[i]>ar[j]){
	               temp = ar[i];
	               ar[i] = ar[j];
	               ar[j] = temp;
	            }
	         }
	      }
	      System.out.println("Second largest number is:: "+ar[size-2]);
	  
	      System.out.println("  ");
	      
	      
	      
	      int arr[] = {10, 20, 25, 63, 96, 57};
	     
	      Arrays.sort(arr);
	      System.out.println("sorted Array ::"+Arrays.toString(arr));
	      int res = arr[arr.length-2];
	      int a=arr[0];
	      int b=arr[arr.length-1];
	      int c=arr[1];
	      System.out.println("largest value is  "+ b);
	      
	      System.out.println("2nd largest element is ::"+res);
	   
	      System.out.println("Smallest value is  :" +a);
	      
	      System.out.println("Second smallest value is  "+ c);
	      
	     
	}

}

