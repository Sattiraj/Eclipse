package package1;
////Target Object
//////1:M
public class Department {
	private String did;
	private String dname;
	
	//Has-A variable 
	private Employee2[] emp;

	public Department(String did, String dname, Employee2[] emp) {
		super();
		this.did = did;
		this.dname = dname;
		this.emp = emp;
	}
	public void getDepartmentDetails()
	{
		System.out.println("Department Details are  :::  ");
		System.out.println("-----------------------------");
		System.out.println("Department id   "+did);
		System.out.println("Department name "+dname);
		System.out.println();
		System.out.println("Employee Details are   ::: ");
		for(Employee2 employee2:emp)
		{
			System.out.println("Employee id    "+employee2.empid2);
			System.out.println("Employee name  "+employee2.empName2);
			System.out.println("Employee addr  "+employee2.empAddr2);
			System.out.println();
		}
	}

}
