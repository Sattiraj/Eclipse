import java.util.Scanner;

class Farmer11
{
	private float pa,td,si;
	private static float ri;
	static
	{	
		ri=2.5f;
    }
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Dear,Kindely enter the amount to loan :");
		pa=scan.nextFloat();
		System.out.println("Dear,kindly enter the time to repay the amount  ");
		td=scan.nextFloat();
	}
	void compuet()
	{
		si=(pa*td*ri)/100;
	}
	void disp()
	{
		System.out.println("SI is "+si);
	}
}
public class Farmer
{
	public static void main(String[] args) {
		Farmer11 f1=new Farmer11();
		Farmer11 f2=new Farmer11();
		f1.input();
		f1.compuet();
		f1.disp();
		f2.input();
		f2.compuet();
		f2.disp();
		
	}
}