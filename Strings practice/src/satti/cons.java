package satti;

class Student extends Throwable 
{
	String s;
	int a;
	String d;
	public Student(String s,int a)
	{
		this.s=s;
		this.a=a;
		
	}
	public void disp()
	{
		System.out.println("sattiraju");
	}
	public String getS()
	{
		return s;
	}
	public int getA()
	{
		return a;
	}
}
class Student2 extends Student
{
	
	
	public void disp()
	{
		super.disp();
		System.out.println("Sattiraju Yarramsetti");
	}
	public Student2(String s,int a,String d)
	{
		super(s,a); 
		
		this.s=s;
		this.a=a;
		this.d=d;
		
		
		
		System.out.println("this is second constructor");
	}
	
}
public class cons {
	public static void main(String[] args) {
		Student s1=new Student("Satti",22);
		s1.disp();
		
		System.out.println(s1.getA());
		System.out.println(s1.getS());
		Student2 s2=new  Student2("Raju",10,"city");
		
		s2.disp();
		System.out.println(s2.getA());
		System.out.println(s2.getS());
	
	}

}
