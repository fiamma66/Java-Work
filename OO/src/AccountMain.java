
public class AccountMain {
	public static void main(String[] args) {
	/*	Account A1 = new Account();
		A1.accountNo = "124654";
		A1.balance = 50000.0;
		A1.printAccData();
		
		Account A2 = new Account("124654",50000.0);
		A2.printAccData();
	*/	
		Account A3 = new Account("127333",57730.0);
		A3.printAccData();
		
		CkeckAccount c = new CkeckAccount("837444",18730.0,20);
		c.printAccData();
		System.out.println("=========");
		
		Account[] a = new Account[2];
		a[0]= new Account("127333",57730.0);
		a[1]= new CkeckAccount("837444",18730.0,20);
		for(int i = 0;i<a.length;i++)
			a[i].printAccData();
		

	}

}


