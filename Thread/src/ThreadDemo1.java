
public class ThreadDemo1 extends Thread{
	public void run() {
		for(int i = 0 ;i<100;i++)
			System.out.println(getName()+" : Number "+i);
	}

	public static void main(String[] args) {
		ThreadDemo1 t = new ThreadDemo1();
		t.setName("Thread1");
		t.start();
		ThreadDemo1 t1 = new ThreadDemo1();
		t1.setName("Thread2");
		t1.start();

	}

}
