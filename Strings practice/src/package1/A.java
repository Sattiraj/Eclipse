package package1;

public class A {
	  public int x=30;
	  public A()
	  {
		  System.out.println("This is constructor ");
	  }
	 public void m1()
	 {
		 System.out.println("method one");
	 }
	
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		System.out.println(a.x);
	}

}
