class Parentt
{
	int a, b;
	
	Parentt()
	{
		
		a=10;
		b=20;
		System.out.println("Parentt Const");
	}
	Parentt(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Parentt para Const");
	}
	
}

class Childd extends Parentt
{
	
	int x, y;
	
	Childd()
	{
		this(111,222);
		x=100;
		y=200;
	}
	Childd(int x, int y)
	{
		
		this.x=x;
		this.y=y;
	}
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
		
	}
}
public class Inheritance{

	public static void main(String[] args) {
			Childd ch=new Childd(20,30);
			ch.disp();
			
			
			String A="Sattiraju yarramsetti";
			String B="";
			String [] C=A.split(" ");
			for(int i=C.length-1;i>=0;i--)
				{
					B=B+C[i]+" ";
				}
			System.out.println(A);
			System.out.println(B);
			
			String AA="Sattiraju yarramsetti";
			String BB="";
			String[] CC=AA.split(" ");
			for(String AB:CC)
			{
				for(int i=AB.length()-1;i>=0;i--)
				{
					BB=BB+AB.charAt(i);
				}
				BB=BB+" ";
			}
			System.out.println(AA);
			System.out.println(BB);
	}

}

