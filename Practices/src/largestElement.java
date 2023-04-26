
public class largestElement {
     public static void main(String[] args) {
	 /*   
    	 //Find largest number of array
    	 
    	 
	     //int arr[]= {1,5,3,7,10,4,8,6};
	     
	     int arr[]= {-100,-10,-2,-3,-16,-9,-5,-80};
	     int max=arr[0];
	     for(int i=0;i<arr.length;i++)
	     {
	    	 if(max < arr[i])
	    	 {
	    		 max=arr[i];
	    	 }  
	    	 System.out.println("maxvalue is ::"+max);
	     }
	     System.out.println("Largest element is ::"+max);
    
	     
    	
    	 //Find Second largest element of an array
    	 
    	/* int ar[]= {10,5,80,4,17,33,100,15,95,50};
    	//   int ar[]= {5,10,8,15,20,18};
    	   
    	   
    	 //int ar[]= {1,3,6,2,9,5};
    	 int max=0,max2=0;
    	 for(int i=0;i<ar.length;i++)
    	 {
    		 if(max<ar[i])
    		 {
    			 max2=max;
    			 max=ar[i];
    			 System.out.println("max value is ::"+max);
    		 }
    		 if(max>ar[i])
    		 {
    			 if(max2<ar[i])
    			 {
    			     max2=ar[i];
    			     System.out.println("max2 value is ::"+max2);
    		     }
    		 }
    		 
    	 }
    	 
    	 System.out.println("Second largest element is ::"+max2);
    	 
    */	 
    	 
    	 /*
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
	  */
    
    	 
    	 //Find Smallest element of an array
    	 
    	 //int ar[]= {10,50,80,5,20,3,15,1,2};
    	
    	 int ar[]= {200,400,100,150,50,250,20,5,30,10};
    	 int min=ar[0];
    	 for(int i=0;i<ar.length;i++)
    	 {
    		 if(ar[i]<min)
    		 {
    			 min=ar[i];
    		 }
    		 System.out.println("min value is ::"+min);
    	 }
	     System.out.println("Smallest value is ::"+min);
       
    /*	 
    	 
  // Find second smallest element of an array
    	
    	 //int ar[]= {10,8,6,2,1};
    	 
    	 //int ar[]= {50,30,60,40,10,20};
    	 
    	 int ar[]= {-4,-8,-1,-10,-5,-2,-6};
    	 int min=ar[0],min2=ar[0];
    	 for(int i=0;i<ar.length;i++)
    	 {
    		 if(min>ar[i])
    		 {
    			 min2=min;
    			 min=ar[i];
    			 System.out.println("min value is ::"+min);
    		 }
    		 else if(min<ar[i])
    		 {
    			 if(min2>ar[i])
    			 {
    				 min2=ar[i];
    				 System.out.println("min2 value is ::"+min2);
    		    	    
    			 }
    		 }
    	
    	     
    	 }
    	 System.out.println("Second smallest element is ::"+min2);
    	 
    	*/ 
     }
}
