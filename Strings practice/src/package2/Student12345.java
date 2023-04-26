package package2;

public class Student12345 {
	
	private String sid; 	
	private String sname;
	private String saddr;
	///Has -A variables
	private Course[] course;
	///constructor injection  
	public Student12345(String sid, String sname, String saddr, Course[] course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.course = course;
	} 
	
	
	public void getStudent12345Details()
	{
		System.out.println("Student Details are  :::::");
		System.out.println("SID   IS :: "+sid);
		System.out.println("SNAME IS :: "+sname);
		System.out.println("SADDR IS :: "+saddr);
		System.out.println("Course details are  :::");
		for(Course c:course)
		{
			System.out.println("cid   is :: "+c.cid);
			System.out.println("cname is :: " +c.cname);
			System.out.println("ccost is :: "+c.ccost);
		}
		System.out.println("-----------------------------------------------");
	}
	

}
