class Demo1
{

	static int a;
	static int b;
	static
	{
		System.out.println("Static block ");
		a=10;
		b=20;
	}
	static void disp()
	{
		System.out.println("static method ");
		System.out.println(a);
		System.out.println(b);
	}
	 Demo1()
	{
		System.out.println("constructor");
	}
	int x;
	int y;
	{
		System.out.println("Non static block");
		x=100;
		y=200;
	}
	void disp2()
	{
		System.out.println("Non static method ");
		System.out.println(x);
		System.out.println(y);
	}
}
	public class statickey 
	{
    public static void main(String[] args) {
	Demo1.disp();
	//Demo1.disp2();
	Demo1 d=new Demo1();
	d.disp2();
    
    }
}
