
public class SumOfTwoArrays {
	public static void main(String[] args) {
		int sum=0,sum2=0;
		
		//int a[]={10,30,50,70,80,90};
		//int b[]={100,200,300};
		
		int a[]= {10,-30,500,-70,100,90};
		int b[]= {50,100,200,-300,500};
		
		//int a[]= {40,70,-500,150,-400,90};
		//int b[]= {150,-100,-200,250,-300,500,-600};
		
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("sum of a is  ::"+sum);
		for(int i=0;i<b.length;i++)
		{
			sum2+=b[i];
		}
		System.out.println("sum of b is  ::"+sum2);
		
		int result=sum+sum2;
		System.out.println("The result is  ::"+result);
		
	}
	 
	
	
	

}
