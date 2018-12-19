
public class NineNine {

	public static void main(String[] args) {
		System.out.printf("%s%n%s%n","  | 1 2  3  4  5  6  7  8  9"
				,"-------------------------");
		
		for(int i = 9;i>=1;i--) {
			System.out.print(i + " | ");
			
			
			for (int j=1;j<=i;j++) {
				System.out.print(i*j+" ");
				
			}
			System.out.print("\n");
		}

	}

}
