
public class SecondManage extends Casual{
	public static final double lunchsup = 1800;
	public static final double commission=3000.0;
	
	

	public SecondManage(int empno, String name, String gender, String workdate, String phonenum, String liveplace,
			double salary) {
		super(empno, name, gender, workdate, phonenum, liveplace,salary);
		
		
	}
	
	public double paySalary(double t) {
		return super.paySalary(t) + lunchsup + commission;
		

	}

	public void display() {
		super.display();
		System.out.println("lunchsup= "+lunchsup);
		System.out.println("commission= "+commission);

	}
}
