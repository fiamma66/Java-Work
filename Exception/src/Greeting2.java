
public class Greeting2 { //使用物件導向 解法
	 String[] greeting = {"Hello","Moto","Yeh"};

	public  void printGreetings(int i) throws Exception {
		System.out.println(greeting[i]);
	}

	public static void main(String[] args) {
		Greeting2 g2 = new Greeting2();
		try {
			for(int i =0;i<=g2.greeting.length;i++)
				g2.printGreetings(i);
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Index out of bounds!");
		}
		catch(Exception e1) {
			System.err.println("Exception happened!");
		} 
		finally {
			System.out.println("Thanks!");
		}
		
		System.out.println("program end");	
		
	}

}
