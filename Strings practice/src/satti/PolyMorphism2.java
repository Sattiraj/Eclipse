package satti;

class Parent1 
{
	public void cry()
	{
		System.out.println("Parent is crying");
	}
}
class Child11 extends Parent1
{
	public void cry()
	{
		System.out.println("Child 1 is Crying");
	}
	public void eat()
	{
		System.out.println("Child 1 is eat less");
	}
}
class Child22 extends Parent1
{
	public void cry()
	{
		System.out.println("Child 2 is Crying");
	}
	public void eat()
	{
		System.out.println("Child 2 is eat more");
	}
}

public class PolyMorphism2 {
	public static void main(String[] args) {
		Parent1 p=new Child11();
		p.cry();
		//p.eat();
		((Child11) p).eat();
		
		Parent1 p2=new Child22();
		p2.cry();
		((Child22)p2).eat();
	}

}
