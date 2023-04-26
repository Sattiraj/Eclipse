import java.util.Scanner;

class farmer
{
	float pa,td,si;
	static float ri;
	static 
	{
		ri=2.5f;
	}
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter thd particular amount ");
		pa=scan.nextFloat();
		System.out.println("Enter the time duration");
		td=scan.nextFloat();
	}
	void computer()
	{
		si=(pa*td*ri)/100;
	}
	void disp()
	{
		System.out.println(si);
	}
	

	
/*	
	float pa,td,si;
	private static float ri;
	static 
	{
		ri=2.5f;
	}
	public void input()
	{
		Scanner scan=new Scanner(System.in); 
		System.out.println("Kindhley enter the principlr amount");
		pa=scan.nextFloat();
		System.out.println( "kindhley enter the duration time ");
		td=scan.nextFloat();
	}
	void computer()
	{
		si=(pa*td*ri)/100;
		
	}
	void disp()
	{
		System.out.println("simple instreat is "+si);
	}
	*/
}
public class simpleinst {
    public static void main(String[] args) {
		farmer f1=new farmer();
		f1.input();
		f1.computer();
		f1.disp();
		farmer f2=new farmer();
		f2.input();
		f2.computer();
		f2.disp();
	}
}
