import java.util.Scanner;

public class Stars2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("­n±Æ´X¼h:");
		int num = scanner.nextInt();
		scanner.close(); // scanner use
		
		for(int i =num;i>=1;i--) {
			for(int j =1; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		

	}

}
