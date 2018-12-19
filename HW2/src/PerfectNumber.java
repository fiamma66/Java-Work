

public class PerfectNumber {

	public static void main(String[] args) {

		for (int i = 1; i <= 500; i++) {
			int sum = 0, j = 1;
			
			while(j<=i) {
				if(i%j==0 && i!=j) {
					sum+=j;
				}
				j++;
			}
			
			
			if (sum == i) {
				System.out.println(i);
			}

		} // 1到100所有整數
		
		
		

	}

}
