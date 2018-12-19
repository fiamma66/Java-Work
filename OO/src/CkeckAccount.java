
public class CkeckAccount extends Account{
	int checkCount;
	CkeckAccount(String accountNo, double balance,int checkCount){
		super(accountNo,balance);
		this.checkCount = checkCount;
		}
	void printAccData() {
		super.printAccData();
		System.out.println("CheckCount = "+checkCount);
	}

}
