
public class Temporary extends Employee {
	
	private double hourpay;
	private int workHour;
	
	public double getHourpay() {
		return hourpay;
	}
	public void setHourpay(double hourpay) {
		this.hourpay = hourpay;
	}
	public int getWorkHour() {
		return workHour;
	}
	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}
	public Temporary(int empno,String name,double hourpay,int workHour){//¤l«Øºc
		super(empno,name);
		this.hourpay = hourpay;
		this.workHour = workHour;
	}
	public void display() {//Override display
		super.display();
		System.out.println("hourPay = "+hourpay);
		System.out.println("workHour = "+workHour);

	}
	
	public double paySalary() {
		return hourpay * workHour;
	}

}
