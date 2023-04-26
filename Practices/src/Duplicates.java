public class Duplicates
{
	
	public static void main(String[] args) {
	/*	int[] arr= {12, 0,13,0,-11,14,15,-22,25,31,0,-35,60};
		int[] arr2=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			//if(arr[i].equals())
			if(arr[i]!=0 ||  arr[i]==0)
			{
				arr2[i]=arr[i];
				System.out.print(arr2[i]+"     ");
			}
			
			/*else
			{
				arr2[i]=arr[i];
				System.out.print(arr2[i]+"     ");
			}
			
		
			
		}
		
		/*
		int arr[]= {10,20,30,50,50,50,10,10,20,20,30,30,40,40,50,10};
		int freq[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int no=arr[i];
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(no==arr[j])
				{
					count++;
					freq[j]=-1;
				}
			}
			if(freq[i]!=-1)
			{
				freq[i]=count;
			}
		}
	int countofDuplicates=0;
		
		//int unique=0;
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]>1)
			{
				countofDuplicates++;
				 // unique++;  
				  System.out.println(arr[i]+" = "+freq[i]);
			}
		   
		}

		 //System.out.println("Total no.of unique elements are  "+unique);
		 System.out.println("Total no.of Duplicates "
		 		+ "are ::"+countofDuplicates);
		    
		
		*/
		
		//This mehod is not working
		/*
		 int ar[]= {1,2,1,2,2,2,1,1,1,1,3,5,6,7,9,3,2,2,2,4,5,2,3};
	     
		 for(int i=0;i<ar.length;i++)
		 {
			 for(int j=i+1;j<ar.length;j++)
			 {
				 if(ar[i]==ar[j])
				 {
					 System.out.println(ar[j]);
					
					 break;
				 }
				 
 
			 }
			 System.out.println("duplicate values are::"+ar[i]);

		 }
		 System.out.println();
		 
	*/
		//This method is also not good
		
		
		int[] arr = {1, 2, 1, 2, 3, 4, 2, 1, 5, 4, 3, 2, 1, 5, 3};
		boolean duplicatesFound = false;

		for (int i = 0; i < arr.length; i++) {
		  for (int j = i + 1; j < arr.length; j++) {
		    if (arr[i] == arr[j]) {
		      duplicatesFound = true;
		      System.out.println("Duplicate found: " + arr[j]);
		      break;
		    }
		  }
		}

		if (!duplicatesFound) {
		  System.out.println("No duplicates found in the array.");
		}

	
	
	
		 /*
	void duplicates(int index ,int num,int[] ar)
	{
		int count=1;
		for(int i=index;i<ar.length;i++)
		{
			if(num==ar[i]&&num!=0)
			{
				ar[i]=0;
				System.out.println(num +" is used "+count+" times at index "+i);
				count++;
			}
		}
	}
	public static void main(String[] args) {
		Duplicates d=new Duplicates();
		int[] arr= {5,4,3,2,2,1,3,4,5,5,1};
		for(int i=0;i<arr.length;i++)
		{
			int a=arr[i];
			d.duplicates(i,a,arr);	
		}
	
	*/
}
}