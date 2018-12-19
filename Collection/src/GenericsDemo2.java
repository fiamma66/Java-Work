import java.util.*;
public class GenericsDemo2 {
	public static void print(List<? extends Number>list) {
		Iterator<?> i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		}

	public static void main(String[] args) { //List�����ǩ� !!
		List<Integer> list = new ArrayList<>();
		list.add(15);list.add(20);
		print(list);
		
	/*	List<String> list1 = new ArrayList<>();
		list1.add("Hello");list1.add("Moto");
		print(list1);*/ //�L�k�B�z�r�����O compiler error
		
		List<Double> list2 = new ArrayList<>();
		list2.add(5.5); list2.add(5.5);
		print(list2);

	}

}
