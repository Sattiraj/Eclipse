package package2;
import static java.lang.System.out;
interface ISample
{
	void m1();
	void m2();
}

//class SampleImpl implements ISample
abstract class SampleImpl implements ISample
{
	public void m1()
	{
		System.out.println("Its  working m1 method  ");
	}
	/*
	public void m2()
	{
		System.out.println("Its working m2 method   ");
	}
	*/
}
class SubsampleImpl extends SampleImpl
{
	 public void m2()
	{
		System.out.println("Its Perfectly working m2 method  ");
	}
	
}

public class Interface1 {
	public static void main(String[] args) {
		/*
		ISample sample=new SampleImpl();
		sample.m1();
		sample.m2();
		*/
		
		//Good Approach
		ISample sample1=new SubsampleImpl();
		sample1.m1();
		sample1.m2();
		/// Not a Good Approach
		SampleImpl s1=new SubsampleImpl();
		s1.m1();
		s1.m2();
		
		
		out.println("Satti Raju");
		
	}

}
