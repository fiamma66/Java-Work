
public class Casual extends ComEmployee{
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	public Casual(int empno, String name, String gender, String workdate, String phonenum, String liveplace,
			double salary) {
		super(empno, name, gender, workdate, phonenum, liveplace);
		this.salary = salary;
	}

	public double paySalary(double t) {
		return salary+(salary/240*1.5*t);
	}
	
	
	
	public void display() {
		super.display();
		System.out.println("salary= "+salary);

	}
}
