class Student
{

	private String name="Raju";
	 private String city="vizag";
   public int age=25;
public void setName(String name) {
	this.name = name;
}
public void setCity(String city) {
	this.city = city;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public String getCity() {
	return city;
}
public int getAge() {
	return age;
}
	
	
}
public class encapsulation {
	public static void main(String[] args) {
		Student std=new Student();
		std.setName("YSRaju");
	  System.out.println(std.getName());
	  System.out.println(std.getCity());
	  System.out.println(std.getAge());
		
		
		/*  std.name="satti";
		std.age=22;
		std.city="Choppella";
		System.out.println(std.age);
		System.out.println(std.name);
		System.out.println(std.city);
		System.out.println();
		Student std2=new Student();
		std2.name="hyder";
		std2.age=30;
		std2.city="Benguluru";
		System.out.println(std2.name);
		System.out.println(std2.age);
		System.out.println(std2.city);
	
*/	}

}
