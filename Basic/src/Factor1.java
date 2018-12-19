
public class Factor1 {
	
	static int fatorial(int i) {
		int j =1,sum=1;
		while(j<=i) {
			sum=sum*j;
			
			j++;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num =Integer.parseInt(args[0]);
		System.out.println(num+" != "+fatorial(num));
		

	}

}
