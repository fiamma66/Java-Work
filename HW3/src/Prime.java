
public class Prime {
	static boolean isPrime(int n) {
		boolean result=false;
		int i=1,sum=0;
		while(i <= n) {
			if(n%i==0) {
				sum+=i;
			}
			
			i++;
		}
		if(sum==(n+1) ) {
			result = true;
			
		}
		return result;
	}//判斷質數Method
	static int prime(int n) {
		int result,k=n,x=0;
		while(k>0) { 
			if(isPrime(x)==true) {
				k--; //找到第一個質數後 K-1 直到0 即為第N個質數
			}
			if(k==0) break;	//k為0時 不可讓x加一
				
			x++;//K不為0時 繼續迴圈
			
		}
		result = x;	//break無限迴圈後 x assign result	
		return result;
	}
	

	public static void main(String[] args) {
		System.out.println(prime(3));
		

	}

}
