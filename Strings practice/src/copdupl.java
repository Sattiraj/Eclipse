
public class copdupl {
	public static void main(String[] args) {
		/*
		int arr[]= {10,20,30,40,20,50,50,30,20,10,30,40,70,90,100};
		int arr2[]=new int[arr.length];
		int arr3[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr2[j]=-1;
					count++;
				}

			}
			if(arr2[i]!=-1) 
			{
				arr2[i]=count;
			}
		}
		int duplcount=0;
	
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]>1)
			{
				System.out.println(arr[i]+" = "+arr2[i]);
				duplcount++;
			}
		
		}
		System.out.println("Total Duplicate is  = "+duplcount);
		System.out.println();
	int j=0;
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]>1)
				arr3[i]=arr[i];
			j++;	
			
		}
		System.out.println("Coping Duplicate elements");
		for(int i=0;i<arr3.length;i++)
		{
			if(arr3[i]>1)
			{
				System.out.println(arr3[i]);
			}
		}
		*/
		
		
		
		String s1="@ satti raju yarramsetti 2000 @gmail.com";
		char ch[]=s1.toCharArray();
		int arr[]=new int[127];
		for(int i=0;i<ch.length;i++)
		{
			arr[ch[i]]++;
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>1)
			{
				count++;
				System.out.println("Duplicate charactor is [ "+i+" ] ==>>[ "+(char)i+" ] count = "+arr[i]);
			}
		}
		System.out.println("Total duplicate charactors is "+count);
		
		
		
	}

}
