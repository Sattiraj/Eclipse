package Satti.Raju;

public class Department {
	String depid;
	String depname;
	Employee2[] emp;
	public Department(String depid, String depname, Employee2[] emp) {
		super();
		this.depid = depid;
		this.depname = depname;
		this.emp = emp;
	}
	public void getDepartmentdetails()
	{
		System.out.println("Demartment Details are ::");
		System.out.println("--------------------------");
		System.out.println("department id :: "+depid);
		System.out.println("department name :: "+depname);
		System.out.println();
		System.out.println("Employee details are ::::");
		System.out.println("===========================");
		for(Employee2 employee:emp)
		{
			System.out.println("Employee id ::"+employee.empid);
			System.out.println("Employee name ::"+employee.empname);
			System.out.println("Employee addr ::"+employee.empaddr);
			System.out.println();
		}
		
		
	}
	
}
