
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
	}//�P�_���Method
	static int prime(int n) {
		int result,k=n,x=0;
		while(k>0) { 
			if(isPrime(x)==true) {
				k--; //���Ĥ@�ӽ�ƫ� K-1 ����0 �Y����N�ӽ��
			}
			if(k==0) break;	//k��0�� ���i��x�[�@
				
			x++;//K����0�� �~��j��
			
		}
		result = x;	//break�L���j��� x assign result	
		return result;
	}
	

	public static void main(String[] args) {
		System.out.println(prime(3));
		

	}

}
