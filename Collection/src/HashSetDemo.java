
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> set =new HashSet<Integer>();
	//	Set<Integer> set1 = new HashSet<>(); //�᭱<>�i�H�۰�
		set.add(new Integer (12)); //NEW Reference
		set.add(35);//Auto-Boxing �ϥ�
		set.add(35);//duplicate Set���|���ƿ�J
		set.add(39);
		set.add(200);
		set.add(new Integer (209));
		set.add(new Integer (15));
	//	set.add("Hello"); //compiler error
		System.out.println(set);
		System.out.println(set.size());
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); //hasnext �ϥ�
		}
		
		for(Integer i : set) //ForEach�Ϊk 
			System.out.println(i); //�`�N��Integer �ѥ�
		
		

		
	}

}
