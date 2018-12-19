
public class ThreadDemo2 extends Thread{
	public ThreadDemo2(String name){
		super(name);
	}
	public void run() {
		for(int i = 0 ;i<100;i++)
			System.out.println(getName()+" : Number "+i);
	}

	public static void main(String[] args) {
		ThreadDemo2 t = new ThreadDemo2("Thread1");
		t.start();
		ThreadDemo2 t1 = new ThreadDemo2("Thread2");
		t1.start();

	}

}
