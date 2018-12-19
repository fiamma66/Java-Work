
public class Greeting1 { //使用static解法 全部使用static呼叫
	static String[] greeting = {"Hello","Moto","Yeh"};

	public static void printGreetings(int i) {
		System.out.println(greeting[i]);
	}

	public static void main(String[] args) {
		try {
			for(int i =0;i<=greeting.length;i++)
				printGreetings(i);
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
