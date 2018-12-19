import java.util.Scanner;

public class Sigma {
	static double power(double a,int b) {
		double result=1;
		for(int i=1;i<=b;i++)
			result *=a;
		
		return result;
		
	}//power method
	
	static int fatorial(int n){
		int result=1;
		for(int i=n;i>=1;i--)
			result *=i;
		
		return result;
	}//fatorial method
	
	static double my_fun(double x,int n) {
		double result=0;
		for(int i =1;i<=n;i++) {
			result+= power(x,i) / fatorial(i);
		}
		
		return result;
	}//my fun method
			

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input x:");
		double x = scanner.nextDouble();
		System.out.println("Please input n:");
		int n = scanner.nextInt();
		scanner.close();
		System.out.println(my_fun(x,n));

	}

}
