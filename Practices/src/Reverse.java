import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
	/*	int a[]= {1,2,3,4,5};
		System.out.println("Given Array is ::"+Arrays.toString(a));
		for(int i=0;i<a.length/2;i++)
		{
			int c=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=c;
			System.out.println("After swappig Array is ::"+Arrays.toString(a));
			
		}
		
		
		/*int ar[]={10,20,40,60,80,100};
		for(int i=0;i<ar.length/2;i++)
		{
			int c=ar[i];
			ar[i]=ar[ar.length-1-i];
			ar[ar.length-1-i]=c;
			System.out.println(Arrays.toString(ar));
		}
		*/
	
		int arr[]= {1,3,5,7,9,11,17,13,15};
		for (int i=0;i<arr.length/2;i++)
		{
			int b=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=b;
			//System.out.println(Arrays.toString(arr));
			for(int elem:arr)
			{
				System.out.print(elem  +" ");
			}
		System.out.println();
		}
				
	}
}
