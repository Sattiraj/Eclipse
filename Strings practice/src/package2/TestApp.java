package package2;
/*
///1:M


import package1.Department;
import package1.Employee2;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e1=new Employee2("10","Satti","Rjy");
		Employee2 e2=new Employee2("22","Raju","HYD");
		Employee2 e3=new Employee2("25","Satti Raju","Bengaluru");
		
		Employee2 []emps =new Employee2[3];
		emps[0]=e1;
		emps[1]=e2;
		emps[2]=e3;
		
		///constructor Injection
		
		Department department=new Department("IPL16","BCCI",emps);
		department.getDepartmentDetails();
		
	}
}
*/



/*
//M:1
import package1.Branch;
import package1.Student1234;

public class TestApp
{
	public static void main(String[] args) {
		
		Branch branch=new Branch();
		branch.setBid("IND100");
		branch.setBname("Bengaluru");
		
		Student1234 s1=new Student1234();
		s1.setSid("10");
		s1.setSname("sachin");
		s1.setSaddr("MI");
		s1.setBranch(branch);
		
		Student1234 s2=new Student1234();
		s2.setSid("18");
		s2.setSname("kohli");
		s2.setSaddr("Rcb");
		s2.setBranch(branch);
		
		Student1234 s3=new Student1234();
		s3.setSid("7");
		s3.setSname("Dhoni");
		s3.setSaddr("CSK");
		s3.setBranch(branch);
		
		System.out.println("Student Details are :::");
		System.out.println("ID    :: "+s1.getSid());
		System.out.println("Name  :: "+s1.getSname());
		System.out.println("ADDR  :: "+s1.getSaddr());
		System.out.println("BID   :: "+s1.getBranch().getBid());
		System.out.println("BNAME :: "+s1.getBranch().getBid());
		System.out.println("=========================================");
		System.out.println("ID    :: "+s2.getSid());
		System.out.println("Name  :: "+s2.getSname());
		System.out.println("ADDR  :: "+s2.getSaddr());
		System.out.println("BID   :: "+s2.getBranch().getBid());
		System.out.println("BNAME :: "+s2.getBranch().getBid());
		System.out.println("================================================");
		
		System.out.println("ID    :: "+s3.getSid());
		System.out.println("Name  :: "+s3.getSname());
		System.out.println("ADDR  :: "+s3.getSaddr());
		System.out.println("BID   :: "+s3.getBranch().getBid());
		System.out.println("BNAME :: "+s3.getBranch().getBid());
		
		
	}
}
*/


