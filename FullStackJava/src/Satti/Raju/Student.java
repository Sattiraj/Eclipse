package Satti.Raju;

public class Student {
	String sid;
	String sname;
	String saddr;
    Branch[] branch;
	public Student(String sid, String sname, String saddr, Branch[] branch) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.branch = branch;
	}
    public void getStudentDetails()
    {
    	System.out.println("Student Details Aer ::: ");
    	System.out.println("Student id ::"+sid);
    	System.out.println("Student name ::"+sname);
    	System.out.println("Struent addr ::"+saddr);
    	System.out.println();
    	for(Branch brch:branch)
    	{
    		System.out.println("Branch details are ::");
    		System.out.println("branch id ::"+brch.bid);
    		System.out.println("branch name ::"+brch.bname);
    		System.out.println("branch cost ::"+brch.ccost);
    		System.out.println();
    		
    	}
    	System.out.println("============================");
    	
    }
    
	
}
