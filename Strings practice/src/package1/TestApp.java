package package1;

import package2.Course;
import package2.Student12345;

/* 
///1:1
public class TestApp {
	public static void main(String[] args) {
		Account account=new Account("ABC123","SACHIN","Savings");
		///constructor Injection   
		Employee emp=new Employee("IND10","sachin","MI",account);
		emp.getEmployeeDetails();
	}

}
*/


public class TestApp
{
	public static void main(String[] args) {
		
		Course c1=new Course("ALL","JAVA",5000);
		Course c2=new Course("ALL","C++",1000);
		Course c3=new Course("ALL","PYTHON",2000);
		
		Course[] course=new Course[3];
		course[0]=c1;
		course[1]=c2;
		course[2]=c3;
		
		Student12345 s1=new Student12345("Ind10","Sachin","MI",course);
		Student12345 s2=new Student12345("Ind7","Dhoni","CSK",course);
		Student12345 s3=new Student12345("Ind18","Kohli","RCB",course);
		
		s1.getStudent12345Details();
		s2.getStudent12345Details();
		s3.getStudent12345Details();
		
	}
}