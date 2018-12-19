
public abstract class Employee {
	private int empno;
	private String name;
	private static int empCount;
	
	public Employee(){
		//System.out.println("constructor 0 args");
		empCount++;
	}
	public Employee(int empno,String name){
		//System.out.println("constructor 2 args");
		empCount++;
		this.empno = empno;
		this.name = name;
	}
	
	public void setEmpno(int empno) {
		this.empno = empno;
		
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public int getEmpno() {
		return empno;
	}
	public String getName() {
		return name;
	}
	
	public static int getEmpCount() {
		return empCount;
	}
	
	public void display() {
		System.out.println("empno= "+empno);
		System.out.println("name= "+name);
	}
/*	public double paySalary() {
		return 500000;
	}
*/	
	public abstract double paySalary() ;
	public void raiseSalary(Employee e) {
		if(e instanceof Permanent) {
			Permanent p = (Permanent)e;
			// p.salary *=1.1;
			p.setSalary(p.getSalary()*1.1);
		} else if(e instanceof Temporary) {
			Temporary t = (Temporary)e;
			//t.hourpay += 20;
			t.setHourpay(t.getHourpay()+20);
		}
	}
	
	

	

}
