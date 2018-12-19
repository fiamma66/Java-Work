import java.util.Scanner;

public class Power {
	static int power(int a,int b) {
		int result=1;
		for(int i=1;i<=b;i++)
			result *=a;
		
		return result;
		
	}
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input base num:");
		int a = scanner.nextInt();
		System.out.println("Please input exponentail num:");
		int b = scanner.nextInt();
		scanner.close();
		System.out.println(power(a,b));
		
		
		

	}

}
