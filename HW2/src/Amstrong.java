
public class Amstrong {

	public static void main(String[] args) {
		for(int i =100;i<=999;i++) {
			double a=0,b=0,c=0,sum=0;
			a=i/100;
			b=i%100/10;
			c=i%10;
			sum = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);
			if(i==sum) {
				System.out.println(i);
			}
			
			
		}

	}

}
