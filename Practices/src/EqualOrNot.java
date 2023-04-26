     //Two arrays are  equal or not


public class EqualOrNot {
	
	public static void main(String[] args) {
		/*
		int a[]= {10,20,30,40,50,70,90,100};
		int b[]= {10,20,30,40,50,60};
		
		boolean result=true;

		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				
					result=false;
			}
		}
		else
		{
			result=false;
		}
		if(result==true)
		{
			System.out.println("Two arrays are equal");
		}
		else
		{
			System.out.println("two arrays are not equal");
		}
		
		*/

		
		int x[]= {20,40,60,80,100,150,200};
		int y[]= {20,30,40,80,100,150,200};
		boolean c=true;
		if(x.length==y.length)
		{
			for(int i=0;i<x.length;i++)
			{
				if(x[i]!=y[i])
				{
					c=false;
					break;
				}
			}
		}
		else
		{
			c=false;
		}
		if(c==true)
		{
			System.out.println("Two arrays are equal");
		}
		else
		{
			System.out.println("Two arrays are not equal");
		}
		
		/*
		int p[]= {10,50,80,70,100};
		int q[]={10,50,80,70,100,150,170};
		boolean result=true;
		if(p.length==q.length)
		{
			for(int i=0;i<p.length;i++)
			{
				if(p[i]!=q[i])
				{
					result=false;
					break;
				}
			}
		}
		else
		{
			result=false;
		}
		if(result==true)
		{
			System.out.println("Two Arrays are equal");
		}
		else
		{
			System.out.println("Two arrays are not equal");
		}
		*/
	}

}

