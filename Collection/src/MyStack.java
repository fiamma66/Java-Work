import java.util.*;
@SuppressWarnings("serial")
public class MyStack<T> {
	List<T> list= new ArrayList<>();
	public void push(T val) { //需傳T型資料 val
		list.add(val);
	}
	public T pop() {
		return list.remove(list.size()-1); //有2個數字時 最後的為 2-1=1
	}
	
	

}
