
import java.util.*;

public class HashSetDemo2 {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
	//	List<Integer> list1 = new ArrayList<>(); //�᭱<>�i�H�۰�
		list.add(new Integer (12)); //NEW Reference
		list.add(35);//Auto-Boxing �ϥ�
		list.add(35);//duplicate List�i����
		list.add(39);
		list.add(11);
	//	set.add("Hello"); //compiler error
		System.out.println(list);
		System.out.println(list.size());
		
		for(int i = 0;i<list.size();i++)
			System.out.println(list.get(i));
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); //hasnext �ϥ� unboxing
		}
		
		for(Integer i : list) //ForEach�Ϊk 
			System.out.println(i); //�`�N��Integer �ѥ�
		
		

		
	}

}
