import java.io.*;
public class SerializeDemo2 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	String s;
	transient int n;
	
	
	
	public SerializeDemo2(String s, int n) {
		this.s = s;
		this.n = n; 
	}
	public static void main(String[] args) {
		try {
			SerializeDemo2 st = new SerializeDemo2("Hellow World!",20);
			System.out.printf("s = %s , n = %d", st.s,st.n);
	//		FileOutputStream fos = new FileOutputStream("res/test.ser");
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("res/test1.ser"));
			oos.writeObject(st);
	//		FileInputStream fis = new FileInputStream("res/test.ser");
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("res/test1.ser"));
			SerializeDemo2 st1 = (SerializeDemo2)ois.readObject();
			System.out.printf("%ns = %s , n = %d", st1.s,st1.n);
			oos.close();
			ois.close();
			
			
			
		} catch (Exception e) {e.printStackTrace();}
		

	}

}
