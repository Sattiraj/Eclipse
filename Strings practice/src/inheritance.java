class parent
{
	int age=22;
	String name="SattiRaju";
	void Disp()
	{
		System.out.println("parent class    "+age+"   "  +name);
		
	}
}
class child extends parent
{
	
}
public class inheritance {
	public static void main(String[] args) {
		parent pa=new parent();
		pa.Disp();
		child ch=new child();
		ch.Disp();
	}

}
