package satti;
/*final class Vehicle
{
	String s="satti";
	void disp()
	{
		System.out.println("It's a Vehicle     ");
	}
}
class Car extends Vehicle
{
   //////final class we cannot inherit
}
*/

class Vehicle
{
	final int a=100;
	//final Vehicle()
	{
		System.out.println("this is constructor");
	}
	final void disp()
	{
		//a=20;
		System.out.println(a);
		System.out.println("It's a Vehicle     ");
	}
	 
}
class Car extends Vehicle
{
	
	
	/*void disp()    /////final method will get inherited but cannot overvide
	{
		System.out.println("It's a Car   ");
		System.out.println(super.a);
	}
*/
}
public class LaunchFinalK {
public static void main(String[] args) {
	Vehicle c=new Car();
	c.disp();
	

}
}
