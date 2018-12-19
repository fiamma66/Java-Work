
public class Main {

	public static void main(String[] args) {
		Stack s = new Stack();
		try {
		
			
		s.push(5);
		s.push(7);
		s.push(81);
		
		s.pop();
		s.pop();
		s.push(51);
		s.push(62);
		s.push(85);
		s.pop();
		s.push(88);
		
		
		
		
		
		} catch (StackFullException e) {
			System.err.println("Exception happened in "+e.getE1());
		} catch (StackEmptyException e1) {
			System.err.println("Exception happened in "+e1.getE1());

		}

	}

}
