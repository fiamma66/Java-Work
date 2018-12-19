
public class Rabbit {

	public static void main(String[] args) {
		int i =1;
		while(i>0) {
			
			if(i%3==1 && i%5==3 && i%7==2) break;
			
			i++;
		}
		System.out.print(i);

	}

}
