
public class MersennePrime {
	static boolean isPrime(int n) {
		boolean result = false;
		int i = 1, sum = 0;
		while (i <= n) {
			if (n % i == 0) {
				sum += i;
			}

			i++;
		}
		if (sum == (n + 1)) {
			result = true;

		}
		return result;
	}// §PÂ_½è¼ÆMethod
	static int power(int a,int b) {
		int result=1;
		for(int i=1;i<=b;i++)
			result *=a;
		
		return result;
		
	}//Power
	
	
	static boolean mersennePrime (int n) {
		boolean result=false;
		int i=1,j;
		while (i>0) {
			j=power(2, i) - 1;
			
			if(isPrime(j)==true && j==n) {
				result = true;
				break;
			}
			if(j>=n) break;
			i++;
			
		}
		return result;
	}

	public static void main(String[] args) {
		int k=8,i=1;
		while(k>0) {
			if(mersennePrime(i)==true) {
				System.out.println(i);
				k--;
			}
			
			i++;
		}
		
		

	}

}
