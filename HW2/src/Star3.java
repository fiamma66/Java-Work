import java.util.Scanner;

public class Star3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("­n±Æ´X¼h:");
		int num = scanner.nextInt();
		scanner.close(); // scanner use
		int x = 1;
		for (int i = 1; i <= num; i++) {
			for (int k = (num - i); k >= 1; k--) {
				System.out.print(" ");
				
			}
			for (int j = 1; j <= x; j++) {
				System.out.print("*");
			}
			
			x += 2;
			System.out.print("\n");

		}

	}
}
