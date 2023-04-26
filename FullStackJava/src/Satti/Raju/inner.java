package Satti.Raju;
class Satti
{
	public void show()
	{
		System.out.println("It's show Satti");
	}
	class Raju
	{
		public void config()
		{
			System.out.println("it's config Raju");
		}
	}
}
class computer
{

	public void gain  () {
		// TODO Auto-generated method stub
		
	}
	
}
public class inner {

	public static void main(String[] args) {
		Satti obj=new Satti();
		obj.show();
		Satti.Raju obj1;
		obj1=obj.new Raju();
		obj1.config();
		
		
		computer com=new computer()
		{
			public void gain()
			{
				System.out.println("Its fine");
			}
		};
		com.gain  ();
	}
}
