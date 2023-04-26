package satti;

import java.util.Scanner;

////using oops concepts
abstract class Shapes
{
	float area;
	abstract public void input();
	abstract public void compute();
	public void display()
	{
		System.out.println("The area is  "+area);
	}
}

class Rectangle1 extends Shapes
{
	float length;
	float breadth;
	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Rectangle1");
		length=scan.nextFloat();
		System.out.println("Enter the breadth of Rectangle1");
		breadth=scan.nextFloat();
	}
	public void compute()
	{
		area=length*breadth;
	}
		
}
class Square1 extends Shapes
{
	float length;

	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Square");
		length=scan.nextFloat();
		
	}
		
	public void compute()
	{
		area=length*length;
	}
	
}
class Circle1 extends Shapes
{
	float radius;

	final float pi=3.14f;
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius of circle is ");
		radius=scan.nextFloat();
	}
	public void compute()
	{
		area=pi*radius*radius;
	}
	
}

class Geometry
{
	public void permit(Shapes sh )
	{
		sh.input();
		sh.compute();
		sh.display();
	}
}
public class Project1 {
	public static void main(String[] args) {
		Rectangle1 r=new Rectangle1();
		Shapes sq=new Square1();
		Circle1 c=new Circle1();
		Geometry g=new Geometry();
		g.permit(r);
		g.permit(sq);
		g.permit(c);
	}

}
