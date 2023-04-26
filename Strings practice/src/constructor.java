
public class constructor {
	private String name;
	private int age;
	private String city;
	public constructor(String name,int age,String city)
	{
		this();
		this.name=name;
		this.age=age;
		this.city=city;
	}
   /////////constructor chaining
	public constructor()
	{
		 this("Bablu");
		//name="Balu";
		//age=25;
		city="rjy";
		
		
	}
	public constructor(String name)
	{
		this(28);
		this.name=name;
	}
	public constructor(int age)
	{
		
		this.age=age;
	}
	/*
	 * public void setName(String name) { this.name=name; }
	 */public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getCity()
	{
		return city;
	}
	
	public static void main(String[] args) {
		constructor std=new constructor("Yarramsetti",22,"kkd");
		//std.setName("Raju");
		
		System.out.println(std.getAge());
		System.out.println(std.getName());
		System.out.println(std.getCity());
		
		System.out.println();
		constructor std2=new constructor();
		
		System.out.println(std2.getAge());
		System.out.println(std2.getName());
		System.out.println(std2.getCity());
		System.out.println();
		constructor std3=new constructor(90);
		System.out.println(std3.getAge());
		//System.out.println(std3.getName());
		//System.out.println(std3.getCity());
		
			
	}

}
