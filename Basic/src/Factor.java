
public class Factor {
	
	static int fatorial(int i) {
		int j =1,sum=1;
		while(j<=i) {
			sum=sum*j;
			
			j++;
		}
		return sum;
	}

	public static void main(String[] args) {
		int a ;
		a=fatorial(8);
		System.out.print(a);
		

	}

}
