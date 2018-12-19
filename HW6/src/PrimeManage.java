
public class PrimeManage extends Casual{
	public static final double lunchsup = 1800;
	public static final double traficsup=2000.0;
	public static final double commission_P=5000.0;
	

	PrimeManage(int empno, String name, String gender, String workdate, String phonenum, String liveplace,
			double salary){
		super(empno, name, gender, workdate, phonenum, liveplace,salary);
		
	}
	
	
	public double paySalary(double t) {
		return super.paySalary(t) + traficsup + commission_P + lunchsup;
		

	}

	public void display() {
		super.display();
		System.out.println("lunchsup= "+lunchsup);
		System.out.println("traficsup= "+traficsup);
		System.out.println("commission_p= "+commission_P);


	}

}
