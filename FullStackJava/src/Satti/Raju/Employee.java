package Satti.Raju;

public class Employee {
	/*private String eid;
	private String ename;
	private String eaddr;
	
	Account account;

	public Employee(String eid, String ename, String eaddr, Account account) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddr = eaddr;
		this.account = account;
	}
	public void getEmployeedetails() {
		System.out.println("Employee Details are  ::  ");
		System.out.println("Employee id  :: "+eid);
		System.out.println("Employee name  :: "+ename);
		System.out.println("Employee addr  :: "+eaddr);
		System.out.println("==========================");
		System.out.println("Account Details are ::  ");
		System.out.println("Accno  ::  "+account.accno);
		System.out.println("Accname :: "+account.accname);
		System.out.println("Acctype  ::  "+account.acctype);
		
		
	}
	
	
	private String empid;
	private String empname;
	private String empadder;
	Account account;
	public Employee(String empid, String empname, String empadder, Account account) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empadder = empadder;
		this.account = account;
	}
	public void getEmployeedetails()
	{
		System.out.println("Employee Details are :: ");
		System.out.println("Employee id ::"+empid);
		System.out.println("Employee name ::"+empname);
		System.out.println("Employee adder ::"+empadder);
		System.out.println("============================");
		System.out.println("Account Details are ::");
		System.out.println("Account no ::"+account.Accno);
		System.out.println("Account name ::"+account.Accname);
		System.out.println("Account type ::"+account.Acctype);
	}
	*/
	/*String eid;
	String ename;
	String eaddr;
	Account account;
	public Employee(String eid, String ename, String eaddr, Account account) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddr = eaddr;
		this.account = account;
	}
	public void getEmployeedetails()
	{
		System.out.println("Employee details are ::");
		System.out.println("employee id  ::"+eid);
		System.out.println("employee name ::"+ename);
		System.out.println("employee addr ::"+eaddr);
		System.out.println("Account details are ::");
		System.out.println("Account no ::"+account.Accno);
		System.out.println("Account name ::"+account.Accname);
		System.out.println("Account type ::"+account.Acctype);
	}

	*/
	
	String empid;
	String empname;
	String empaddr;
	private Account account;
	
	public Employee(String empid, String empname, String empaddr, Account account) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empaddr = empaddr;
		this.account = account;
	}

	public void getEmployeedetails()
	{
		System.out.println("Employee Details are ::");
		System.out.println("Employee id ::"+empid);
		System.out.println("EMployee name ::"+empname);
		System.out.println("Employee addr ::"+empaddr);
		System.out.println();
		System.out.println("Accounr details are ::");
		System.out.println("Account no ::"+account.accno);
		System.out.println("Account name ::"+account.accname);
		System.out.println("Account type ::"+account.acctype);
	}

}
