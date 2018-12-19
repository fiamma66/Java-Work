import java.io.*;
public class SerializeDemo implements Serializable {
	private static final long serialVersionUID = 1L;
	//	private static final long serialVersionUID = 3653726666717868380L; //Runtime error 物件版本不符
	String s;
	int n;
	public SerializeDemo(String s, int n) {
		this.s = s;
		this.n = n; 
	}
	public static void main(String[] args) {
		try {
		/*	SerializeDemo st = new SerializeDemo("Hellow World!",20);
			System.out.printf("s = %s , n = %d", st.s,st.n);
	//		FileOutputStream fos = new FileOutputStream("res/test.ser");
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("res/test.ser"));
			oos.writeObject(st);
	//		FileInputStream fis = new FileInputStream("res/test.ser");*/
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("res/test.ser"));
			SerializeDemo st1 = (SerializeDemo)ois.readObject();
			System.out.printf("%ns = %s , n = %d", st1.s,st1.n);
	
	//		oos.close();
			ois.close();
			
			
			
		} catch (Exception e) {e.printStackTrace();}
		

	}

}
