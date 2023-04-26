import java.util.Scanner;
class UnderAgeException extends Exception
{
	public UnderAgeException(String massage)
	{	
		super(massage);
    }
}

class OverAgeException extends Exception
{
	public OverAgeException(String massage)
	{	
		super(massage);
    }
}
class applicant
{
	int age;
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter  your age");
		age=scan.nextInt();
		
	}
	void verify() throws UnderAgeException,OverAgeException
	{
		if(age<18)
		{
			UnderAgeException uae=new UnderAgeException("hay dudu! your time will come");
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>80)
		{
			OverAgeException oae=new OverAgeException("hay dudu! your time is over");
			System.out.println(oae.getMessage());
			throw oae;
		}
		else
			System.out.println("you are eligible");
	}
}
class rto
{
	public void initiate()
	{
		applicant a=new applicant();
		try
		{
		a.input();
		a.verify();
		}
		catch(Exception e)
		{
			try
			{
			a.input();
			a.verify();
			}
			catch(Exception e1)
			{
				try
				{
				a.input();
				a.verify();
				}
				catch(Exception e2)
				{
					try
					{
					a.input();
					a.verify();
					}
					catch(Exception e3)
					{
						System.out.println("Dont try again,Reed the rules");
						System.exit(0);
					}
				}
			}
		}
	}
}
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rto r=new rto();
		r.initiate();

	}

}
