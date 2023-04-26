package satti;

class Animals
{
	int num=50;
	String name="Forest";
	public void run()
	{
		System.out.println(num+"    Animals is running  on the   "+name);
	}
}
class Dog extends Animals
{
	int num=100;
	public void run()
	{
		super.run();
		System.out.println(super.num);
		System.out.println(num+"  Dogs is Shouting on the road");
	}
}
public class Superkey {
public static void main(String[] args) {
	Animals abc=new Dog();
	abc.run();
}
}
