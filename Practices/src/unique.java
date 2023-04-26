
public class unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,30,10,20,5,30,20,1,2,10,1,2};
		int arr2[]=new int[arr.length];
		int uniq[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i],count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(num==arr[j])
				{
					count++;
					uniq[j]=-1;
				}
			}
			if(uniq[i]!=-1)
			{
				uniq[i]=count;
			}
		}
		//int countofeachelement=0;
      //int countOfUnique=0;
		int j=0;
      for(int i=0;i<uniq.length;i++)
      {
    	  if(uniq[i]>1)
    	  {
    		  //countofeachelement++;
    		  //countOfUnique++;
    		  arr2[j]=arr[i];
    		  j++;
    		  
    		 // System.out.println(arr[i]+" = "+uniq[i]);
    	  }
      }
      System.out.println("The total  no.of copying duplicate elements are ::");
      for(int i=0;i<arr2.length;i++)
      {
    	  if(arr2[i]>0)
    	  {
    		  System.out.print(arr2[i]+" ");
    	  }
      }
      //System.out.println("The total no.of unique elements are::"+countOfUnique);
      //System.out.println("The total no.of each element of an array::"+countofeachelement);
      
      
	}

}
