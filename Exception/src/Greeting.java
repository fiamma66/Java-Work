
public class Greeting {

	public static void main(String[] args) {
		String[] greeting = {"Hello","Moto","Yeh"};
		try {
			for(int i =0;i<=greeting.length;i++)
				System.out.println(greeting[i]);
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
