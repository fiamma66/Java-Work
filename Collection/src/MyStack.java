import java.util.*;
@SuppressWarnings("serial")
public class MyStack<T> {
	List<T> list= new ArrayList<>();
	public void push(T val) { //�ݶ�T����� val
		list.add(val);
	}
	public T pop() {
		return list.remove(list.size()-1); //��2�ӼƦr�� �̫᪺�� 2-1=1
	}
	
	

}
