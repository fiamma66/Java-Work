import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,String> tel = new HashMap<>();
		tel.put("John", "0921852401");
		tel.put("Marry", "0921884721");
		tel.put("Ock", "0921884721"); //�L����
	//	tel.put("Marry", "0921846806");//���|���ƿ�J �|�\�L�¸��
		tel.put("Jojo", "0987465412");
		
		String tel1 = tel.get("Marry");
		System.out.println(tel1);
		for(String key : tel.keySet()) //Key���ۭq�ѥ�
			System.out.println(key+","+tel.get(key));
		for(String V : tel.values()) //V���ۭq�ѥ�
			System.out.println(V);

	}

}
