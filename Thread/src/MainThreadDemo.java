
public class MainThreadDemo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Before : "+t.getName());
		t.setName("Yeh!");
		System.out.println("After : "+t.getName());

	}

}
