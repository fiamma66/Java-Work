
public class StaticDemo {
	int x;
	static int y=10;
/*	
	static {
		y = 10; //��ȸ��������ɨϥ�
	}
*/
	public static void main(String[] args) {
		// x++; //compiler error �L�k�s��non-static
		StaticDemo sd = new StaticDemo();//new ����� int ��0
		sd.x ++;
		//StaticDemo sd2;
		
		// sd2.x++; //compiler error �L��� �L�k++
		System.out.println(sd.x);
		y++;
		System.out.println(y);
		sd.y++; //warning : should be accessed in static way
		System.out.println(y);
		StaticDemo.y++;
		System.out.println(y);



	
	
	}

}
