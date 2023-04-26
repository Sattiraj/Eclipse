import java.util.Arrays;

public class first {
	public static void main(String[] args) {
		int arr[]= {2,3,1,4,3,2,2,5,6,7,8,4,6,7,3,4,6,7,8,8,2,1};
		int first=-1,last=-1;
		int x=2;
		//Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)+"    length is ==>>"+arr.length);
		for(int i=0;i<arr.length;i++)
		{
			if(x!=arr[i])
			{
				continue;
			}
			else if(first==-1)
			{
				first=i;
			}
			else
				last=i;
			
		}
		if(first!=-1)
		{
			System.out.println("first occruencce is   "+first);
			System.out.println("last occrucnce is    "+last);
		}
		else
			System.out.println("not found");
	}

}
