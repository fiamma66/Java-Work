import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,String> tel = new HashMap<>();
		tel.put("John", "0921852401");
		tel.put("Marry", "0921884721");
		tel.put("Ock", "0921884721"); //無順序
	//	tel.put("Marry", "0921846806");//不會重複輸入 會蓋過舊資料
		tel.put("Jojo", "0987465412");
		
		String tel1 = tel.get("Marry");
		System.out.println(tel1);
		for(String key : tel.keySet()) //Key為自訂參用
			System.out.println(key+","+tel.get(key));
		for(String V : tel.values()) //V為自訂參用
			System.out.println(V);

	}

}
