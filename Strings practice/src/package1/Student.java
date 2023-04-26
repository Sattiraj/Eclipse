package package1;

public class Student {
	private int sage;
	private String sname;
	private int sid;
	
	public Student(int sage, String sname, int sid) {
		super();
		this.sage = sage;
		this.sname = sname;
		this.sid = sid;
		
	}

	
	public int getSage() {
		return sage;
	}


	public void setSage(int sage) {
		this.sage = sage;
	}

	
	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}


	@Override
	public String toString() {
		return "Student [sage=" + sage + ", sname=" + sname + ", sid=" + sid + "]";
	}
	
	
	
	

}
