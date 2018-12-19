
public class three {

	public static void main(String[] args) {
		int c = 200 , a = 500, count;
		count = a / c;
		count +=(a%c == 0)? 0:1 ;
		String unit=(count==1)? "can":"cans";
		System.out.println("Need " +count+" "+unit+" " +"to paint" );
		System.out.printf("Need %d %s to paint",count , unit);

	}

}
