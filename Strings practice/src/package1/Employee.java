package package1;
     ////Target Object


/////    1:1

public class Employee {
	String empid;
	String empName;
	String empAddr;
	
	//Has - A Relation;
	Account account;

	///constructor
	public Employee(String empid, String empName, String empAddr, Account account) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empAddr = empAddr;
		this.account = account;
	}
	public void getEmployeeDetails()
	{
		System.out.println("Employee Details ars :::::");
		System.out.println("EMPID  "+empid );
		System.out.println("EMPNAME   "+empName);
		System.out.println("EMPADDR   "+empAddr);
		System.out.println("====================================");
		System.out.println("Account Details are  ::");
		System.out.println("ACCNO  "+account.accNo);
		System.out.println("ACCNAME    "+account.accName);
		System.out.println("ACCTYPE   "+account.accType);
		System.out.println();
	}
	

}
