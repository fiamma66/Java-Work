
public class StaticDemo {
	int x;
	static int y=10;
/*	
	static {
		y = 10; //初值較為複雜時使用
	}
*/
	public static void main(String[] args) {
		// x++; //compiler error 無法存取non-static
		StaticDemo sd = new StaticDemo();//new 給初值 int 為0
		sd.x ++;
		//StaticDemo sd2;
		
		// sd2.x++; //compiler error 無初值 無法++
		System.out.println(sd.x);
		y++;
		System.out.println(y);
		sd.y++; //warning : should be accessed in static way
		System.out.println(y);
		StaticDemo.y++;
		System.out.println(y);



	
	
	}

}
