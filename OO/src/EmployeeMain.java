
public class EmployeeMain {
	public static void main(String[] args) {
/*		Employee e = new Employee();
		//e.empno = 1001;
		//e.name = "Jeff";
		e.setEmpno(111);
		e.setName("Jeff");
		
		// System.out.println("empno = "+e.empno);
		// System.out.println("name = "+e.name);
		// e.display();
		System.out.println("empno = "+e.getEmpno());
		System.out.println("name = "+e.getName());

		Employee e2 = new Employee(1002, "Tommy");

		e2.display();

		Permanent p = new Permanent();
		p.setEmpno(333);
		p.setName("Timmy");
		p.setSalary(45000.0);
		// p.empno = 333;
		//p.name = "Timmy";
		//p.salary = 45000.0;
		p.display();
*/
		
		
	/*	
		Permanent p2 = new Permanent(444, "Tony", 54000.0);
		p2.display();
		
		Temporary t = new Temporary(555,"Jinx",150,80);
		t.display();
		
		Sales s = new Sales(666,"Lux",30000.0,23000.0);
		s.display();
	*/	
		Permanent p1 = new Permanent(444, "Tony", 54000.0);
		Temporary t1 = new Temporary(555, "Jinx", 150, 80);
		Sales s1 = new Sales(666, "Lux", 30000.0, 23000.0);
		System.out.println(p1.paySalary());
		System.out.println(t1.paySalary());
		System.out.println(s1.paySalary());
		
		System.out.println("==============");
		
		
		
		Employee[]e1 = new Employee[3];
		e1[0] = new Permanent(444, "Tony", 54000.0);
		e1[1] = new Temporary(555, "Jinx", 150, 80);
		e1[2] = new Sales(666, "Lux", 30000.0, 23000.0);
		for(int i=0;i<e1.length;i++) {
			System.out.println(e1[i].paySalary());

		}
		
		System.out.println("==============");
		
		for(int i=0;i<e1.length;i++) {
			e1[0].raiseSalary(e1[i]);

		}
		for(int i=0;i<e1.length;i++) {
			System.out.println(e1[i].paySalary());

		}
		System.out.println("employee count = "+Employee.getEmpCount());




	}

}
