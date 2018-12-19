import java.util.*;
public class GenericsDemo3 {
	

	public static void main(String[] args) {
		MyStack<Integer> l= new MyStack<>();
	//	System.out.println(l.pop()); //ArrayIndexOutOfBoundsException
		l.push(54);
		l.push(55);
		l.push(33);
		System.out.println(l.pop());
		l.push(11);
		l.push(12);
		System.out.println(l.pop());
		System.out.println(l.pop());
	
		MyStack<String> l1 = new MyStack<>();
		l1.push("Hello");
		l1.push("Moto");
		System.out.println(l1.pop());
		l1.push("Mortal");
		l1.push("Immortal");
		System.out.println(l1.pop());
		
		


		

	}

}
