package Satti.Raju;

public class Test1 {
    public static void main(String[] args) {
    /*	Employee2 e1=new Employee2("Satti1234","Raju","Choppella");
    	Employee2 e2=new Employee2("Raju1234","Satti","Rajahmundry");
    	Employee2 e3=new Employee2("Santha1234","Raju","Bengaluru");
    	Employee2[] emp=new Employee2[3];
    	emp[0]=e1;
    	emp[1]=e2;
    	emp[2]=e3;
    	Department dep=new Department("cse05","btech",emp);
    	dep.getDepartmentdetails();
    	System.out.println("=================================================");
    	System.out.println("   ");
    	
    
    	
    	
    	Branch branch=new Branch();
    	branch.setBid("IND123");
    	branch.setBname("Hyderbad");
    	Student s1=new Student();
    	s1.setSid("22");
    	s1.setSname("Satti");
    	s1.setSaddr("choppella");
    	s1.setBranch(branch);
    	
    	s1.setSid("32");
    	s1.setSname("Santha");
    	s1.setSaddr("Rajahmunder");
    	s1.setBranch(branch);
 
    	s1.setSid("222");
    	s1.setSname("Raju");
    	s1.setSaddr("vizag");
    	s1.setBranch(branch);
    	
    	System.out.println("Student details are :: ");
		System.out.println("ID    :: " + s1.getSid());
		System.out.println("NAME  :: " + s1.getSname());
		System.out.println("ADDR  :: " + s1.getSaddr());
		System.out.println("BID   :: " + s1.getBranch().getBid());
		System.out.println("BNAME :: " + s1.getBranch().getBname());
		System.out.println("========================================");
		
		System.out.println("Student details are :: ");
		System.out.println("ID    :: " + s1.getSid());
		System.out.println("NAME  :: " + s1.getSname());
		System.out.println("ADDR  :: " + s1.getSaddr());
		System.out.println("BID   :: " + s1.getBranch().getBid());
		System.out.println("BNAME :: " + s1.getBranch().getBname());
		System.out.println("========================================");

		System.out.println("Student details are :: ");
		System.out.println("ID    :: " + s1.getSid());
		System.out.println("NAME  :: " + s1.getSname());
		System.out.println("ADDR  :: " + s1.getSaddr());
		System.out.println("BID   :: " + s1.getBranch().getBid());
		System.out.println("BNAME :: " + s1.getBranch().getBname());
		*/
    	
    	
    	Branch b1=new Branch("A11","C++",1000);
    	Branch b2=new Branch("B11","JAVA",2000);
    	Branch b3=new Branch("C11","PYTHON",3000);
    	Branch[] b=new Branch[3];
    	b[0]=b1;
    	b[1]=b2;
    	b[2]=b3;
    	Student s1 = new Student("IND10", "sachin", "MI", b);
		Student s2 = new Student("IND7", "dhoni", "CSK", b);
		Student s3 = new Student("IND18", "kohli", "RCB", b);

		s1.getStudentDetails();
		s2.getStudentDetails();
		s3.getStudentDetails();

    	


 
 
}
}
