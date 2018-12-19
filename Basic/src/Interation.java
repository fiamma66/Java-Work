
public class Interation {

	public static void main(String[] args) {
		int n = 1, sum = 0;
		
		while (n <= 10) {
			sum += n;
			++n;
		}//end of while
		System.out.printf("%d %d",sum,n);
		
		
		n = 1;
		sum = 0;
		do {
			sum +=n;
			n++;
		} while(n <= 10);//end of do
		System.out.printf("%n%d %d",sum,n);	
		
		sum = 0;
		for(n=1 ; n <= 10; n++)
			sum+=n;//end of for
		System.out.printf("%n%d %d",sum,n);	
		
		sum = 0;
		for(n = 1 ; n <=100 ; n+=2)
			sum += n;//基數相加
		System.out.printf("%n%d %d",sum,n);	
		
		sum = 0;
		for(n = 0 ; n <=100 ; n+=2) {
			sum += n;//偶數相加
		}
			
		System.out.printf("%n%d %d",sum,n);

	}

	
	

}
