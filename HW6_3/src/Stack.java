
public class Stack {
	private int[] i= new int[4];
	private  int top=0;
	public void push(int n) throws StackFullException {
		if(top>4-1) throw new StackFullException("Stack is full!");
		i[top] = n;
		top++;
	}
	public void pop() throws StackEmptyException{
		if(top==0) throw new StackEmptyException("Stack is empty");
		System.out.println(i[top-1]);
		top--;
		
		
	}

}
