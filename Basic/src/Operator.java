
public class Operator {

	public static void main(String[] args) {
		System.out.println(9/4);
		System.out.println(9%2);
		System.out.println(9.0/4);
		
		int n = 200;
		System.out.println(n + "��=" + n/60 + "��" + n%60 + "��");
		n = 852;
		System.out.println(n + "��=" + n/60 + "��" + n%60 + "��");
		System.out.printf("%d��=%d��%d��%n" ,n,  n/60, n%60);
		System.out.println("3" + 8 + 5);
		System.out.println(3 + 8 + 5);
		System.out.println(3 + "8" + 5);
		System.out.println(3 + 8 + "5");
		
		int x = 3 , y = 4, z;
		//z = ++x * y; Answer 4, 4, 16
		//z = x++ * y; Answer 4, 4, 12 ++��m ���⧹Z �A��X
		//z = (x++) * y; Answer 4, 4, 12
		//z = x+++y; Answer 4, 4, 7
		//z = x+(++y); Answer 3, 5, 8
		
		//System.out.println("x =" + x + ", y = " + y + ", z = " + z);
		
		

	}

}
