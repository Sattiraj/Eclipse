import java.util.Arrays;

public class FirstAndLast {
/*	 public static void findFirstAndLast(int arr[], int x)
	    {
	        int n = arr.length;
	        int first = -1, last = -1;
	        for (int i = 0; i < n; i++) {
	            if (x != arr[i])
	                continue;
	            if (first == -1)
	                first = i;
	            last = i;
	        }
	        if (first != -1) {
	            System.out.println("First Occurrence = "
	                               + first);
	            System.out.println("Last Occurrence = " + last);
	        }
	        else
	            System.out.println("Not Found");
	    }
	 
	    public static void main(String[] args)
	    {
	        int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
	        int x = 2;
	        findFirstAndLast(arr, x);
	    }
	    
	    */
	    
	 public static void main(String[] args)
	    {
	        int arr[] = {1,8,2,2,8,8,3,4,8,7,8,8,2,3,4,5,8};
	        for(int elem:arr)
	        {
	        	System.out.print(elem+" ");
	        }
	        /*   Arrays.sort(arr);
	        System.out.println("sortes array is ::"+Arrays.toString(arr));
	        int x = 8;
	         int n = arr.length;
	        int first = -1, last = -1;
	        for (int i = 0; i < n; i++) {
	            if (x != arr[i])
	                continue;
	            if (first == -1)
	            
	            	first = i;
	            else
	             last = i;
	        }
	        if (first != -1) {
	            System.out.println("First Occurrence = " + first);
	            System.out.println("Last Occurrence = " + last);
	        }
	        else
	            System.out.println("Not Found");
	    
	 */
	    }
}
