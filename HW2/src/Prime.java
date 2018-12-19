import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input num:");
		int num = scanner.nextInt();
		scanner.close();//scanner use
		
		int i = 1;
		while(i <= num) {
			int sum = 0;
			for(int j = 1 ; j <= i ; j++) {
				
				if(i % j ==0) {
					sum+=j;
				}//i因數總和
				
				
			}
			if(sum == i+1) {
				System.out.println(i);
			}
			i++;
			
		}//end of while
		

	}

}
