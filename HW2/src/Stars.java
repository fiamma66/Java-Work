import java.util.Scanner;

public class Stars {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("­n±Æ´X¼h:");
		int num = scanner.nextInt();
		scanner.close(); // scanner use
		
		for(int i =1;i<=num;i++) {
			for(int j =1; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		

	}

}
