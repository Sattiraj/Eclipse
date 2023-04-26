package satti;

import java.util.Scanner;

///using only classes,methods and objects 

class Rectangle
{
	float length;
	float breadth;
	float area;
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Rectangle");
		length=scan.nextFloat();
		System.out.println("Enter the breadth of rectangle");
		breadth=scan.nextFloat();
	}
	public void compute()
	{
		area=length*breadth;
	}
	public void display()
	{
		System.out.println(area);
	}
}

class Square
{
	float length=25.5f;
	float area= 10.5f;
	
	public void input()
	{
		System.out.println("Length of Square is   "+length);
		System.out.println("Area of Square is   "+area);
	}
	public void compute()
	{
		area=length*length;
	}
	public void display()
	{
		System.out.println("Area is "+area);
	}
}
class Circle
{
	float radius;
	float area;
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
	public void display()
	{
		System.out.println(area);
	}
}
public class Project {
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		Square sq=new Square();
		Circle c=new Circle();
		
		
		r.input();
		r.compute();
		r.display();
		
		sq.input();
		sq.compute();
		sq.display();
		
		
		c.input();
		c.compute();
		c.display();
		
		
		
		
	}

}
