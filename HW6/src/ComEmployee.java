
public abstract class ComEmployee {
	private int empno;
	private String name;
	private String gender;
	private String workdate;
	private String phonenum;
	private String liveplace;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getWorkdate() {
		return workdate;
	}
	public void setWorkdate(String workdate) {
		this.workdate = workdate;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getLiveplace() {
		return liveplace;
	}
	public void setLiveplace(String liveplace) {
		this.liveplace = liveplace;
	}
	public ComEmployee(int empno, String name, String gender, String workdate, String phonenum, String liveplace) {
		super();
		this.empno = empno;
		this.name = name;
		this.gender = gender;
		this.workdate = workdate;
		this.phonenum = phonenum;
		this.liveplace = liveplace;
	}
	
	public void display() {
		System.out.println("empno= "+empno);
		System.out.println("name= "+name);
		System.out.println("gender= "+gender);
		System.out.println("workdate= "+workdate);
		System.out.println("phonenum= "+phonenum);
		System.out.println("liveplace= "+liveplace);



	}
	
	public abstract double paySalary(double t) ;

}


