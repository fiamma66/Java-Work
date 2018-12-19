
public class Operator {

	public static void main(String[] args) {
		System.out.println(9/4);
		System.out.println(9%2);
		System.out.println(9.0/4);
		
		int n = 200;
		System.out.println(n + "秒=" + n/60 + "分" + n%60 + "秒");
		n = 852;
		System.out.println(n + "秒=" + n/60 + "分" + n%60 + "秒");
		System.out.printf("%d秒=%d分%d秒%n" ,n,  n/60, n%60);
		System.out.println("3" + 8 + 5);
		System.out.println(3 + 8 + 5);
		System.out.println(3 + "8" + 5);
		System.out.println(3 + 8 + "5");
		
		int x = 3 , y = 4, z;
		//z = ++x * y; Answer 4, 4, 16
		//z = x++ * y; Answer 4, 4, 12 ++後置 先算完Z 再算X
		//z = (x++) * y; Answer 4, 4, 12
		//z = x+++y; Answer 4, 4, 7
		//z = x+(++y); Answer 3, 5, 8
		
		//System.out.println("x =" + x + ", y = " + y + ", z = " + z);
		
		

	}

}
