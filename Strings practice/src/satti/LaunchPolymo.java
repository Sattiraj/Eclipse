package satti;
class Parent
{
	public void cry()
	{
		System.out.println("Parent crying ");
	}
}
class Child1 extends Parent
{
	public void cry()
	{
		System.out.println("Child1 is crying at low voice ");
	}
}
class Child2 extends Parent
{
	public void cry()
	{
		System.out.println("Child2 is crying at High voice ");
	}
}
public class LaunchPolymo {
public static void main(String[] args) {
    Child1 c1=new Child1();////This is tight coupling
	Child2 c2=new Child2();
	c1.cry();
	c2.cry();
	System.out.println();
	Parent satti=new Child1();////This is loose coupling
	satti.cry();
	System.out.println();
	Parent abc;
	abc=c1;
	abc.cry();
	abc=c2;	
	abc.cry();
}
}
