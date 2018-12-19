
public class Main {

	public static void main(String[] args) {
		ComEmployee c = new Casual(111,"Tom","Male","2018-11-09","09XXXXX","null",30000.0);
		c.display();
		System.out.println("MonthPay = "+c.paySalary(0));
		
		System.out.println("---------------");

		SecondManage scm = new SecondManage(222,"Marry","Female","2018-11-09","09XXXXX","null",40000.0);
		scm.display();
		System.out.println("MonthPay = "+scm.paySalary(0));

		
		System.out.println("---------------");

		PrimeManage prm = new PrimeManage(333,"Jimmy","Male","2018-11-09","09XXXXX","null",50000.0);
		prm.display();
		System.out.println("MonthPay = "+prm.paySalary(0));

		System.out.println("===============");

		ComEmployee[] e = new ComEmployee[3];
		e[0] = new Casual(444,"Tony","Male","2018-11-09","09XXXXX","null",35000.0) ;
		e[1] = new SecondManage(555,"Monday","Female","2018-11-09","09XXXXX","null",45000.0);
		e[2] = new PrimeManage(666,"Tuesday","Female","2018-11-09","09XXXXX","null",50000.0);
		for(int i=0;i<e.length;i++) {
			e[i].display();
			System.out.println("MonthPay = "+e[i].paySalary(20));
			System.out.println("-------------");
		}
		
		
		
		
		
	}

}
