
public class MathDemo {

	public static void main(String[] args) {
		System.out.println(Math.rint(3.8));
		System.out.println(Math.rint(3.5));
		System.out.println(Math.rint(2.5));//傳回偶數 故為2
		System.out.println(Math.rint(-3.8));
		System.out.println(Math.rint(-2.5));
		System.out.println(Math.floor(3.8));
		System.out.println(Math.floor(-3.8));
		System.out.println((int)(Math.random()*101));
		
		int low=1,high=3;
		
		System.out.println((int)(Math.random()*(high-low+1)+low));







	}

}
