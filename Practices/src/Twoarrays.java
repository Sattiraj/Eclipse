import java.util.Arrays;
public class Twoarrays {
	public static void main(String[] args) {
     // how to Sort an array in using loops
      
		//int[] a= {1,4,6,3,5,2,8,9,15,7};
		int a[]= {5,3,1,6,2,10,8,4};
		//int i=0,j=1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
    				for(int el:a)
					{
						System.out.print(el+" ");
					}
				}
				System.out.print("    ");
			}
			System.out.println();
		}
	
	
	/*	
		int ar[]= {22,44,1,35,13,25,9,5,10};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=1;j<ar.length-i;j++)
			{
				if(ar[j]<ar[j-1])
				{
					int temp=ar[j];
					ar[j]=ar[j-1];
					ar[j-1]=temp;
					
				}
				
			}
		}
		for (int elem:ar)
		{
			System.out.println(elem +" ");
		}
		*/
	/*	
   //using  inbuilt methods
		
		int ar[]= {20,15,25,30,10,5,35,1};;
		Arrays.sort(ar);
		System.out.println("Sorted array is ::"+Arrays.toString(ar));
	
	*/	
		
	
	}
}