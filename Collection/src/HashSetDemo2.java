
import java.util.*;

public class HashSetDemo2 {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
	//	List<Integer> list1 = new ArrayList<>(); //後面<>可以自動
		list.add(new Integer (12)); //NEW Reference
		list.add(35);//Auto-Boxing 使用
		list.add(35);//duplicate List可重複
		list.add(39);
		list.add(11);
	//	set.add("Hello"); //compiler error
		System.out.println(list);
		System.out.println(list.size());
		
		for(int i = 0;i<list.size();i++)
			System.out.println(list.get(i));
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); //hasnext 使用 unboxing
		}
		
		for(Integer i : list) //ForEach用法 
			System.out.println(i); //注意為Integer 參用
		
		

		
	}

}
