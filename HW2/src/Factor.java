import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input num:");
		double num = scanner.nextDouble();
		scanner.close(); // scanner use
		
		int i = 1;
		while(i<=num) {
			if(num % i ==0) {
			System.out.printf("%d%n",i);	
			}//end of ¦]¼ÆÀË¬d
			
			
			i++;
		}//end of while
		
		
		


	}

}
