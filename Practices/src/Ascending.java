import java.util.Arrays;
import java.util.Scanner;

public class Ascending {
	public static void main(String[] args) {
		//int[] arr= {21,50,90,3,65,12,5,85,1,33,10};
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			/*if(arr[i]%2!=0)
			{
				System.out.println(i+" = "+arr[i]);
			}
			*/
		}
	System.out.println(sum);
		
		/*
		System.out.print("Given array is  ::");
		for(int elam:arr)
		{
			System.out.print(elam+"  ");
		}
		
		System.out.println();
		Arrays.sort(arr);
		System.out.println("Sorted array is ::"+Arrays.toString(arr));
		
		*/
	}

}
