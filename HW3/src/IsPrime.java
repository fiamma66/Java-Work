import java.util.Scanner;

public class IsPrime {
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
	}
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input num:");
		int num = scanner.nextInt();
		
		System.out.println(isPrime(num));
		scanner.close();
		

	}

}
