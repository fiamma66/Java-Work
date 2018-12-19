
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> set =new HashSet<Integer>();
	//	Set<Integer> set1 = new HashSet<>(); //後面<>可以自動
		set.add(new Integer (12)); //NEW Reference
		set.add(35);//Auto-Boxing 使用
		set.add(35);//duplicate Set不會重複輸入
		set.add(39);
		set.add(200);
		set.add(new Integer (209));
		set.add(new Integer (15));
	//	set.add("Hello"); //compiler error
		System.out.println(set);
		System.out.println(set.size());
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); //hasnext 使用
		}
		
		for(Integer i : set) //ForEach用法 
			System.out.println(i); //注意為Integer 參用
		
		

		
	}

}
