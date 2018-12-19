
public class ThreadDemo5 extends Thread{
	public ThreadDemo5(String name){
		super(name);
	}
	
	public static void main(String[] args) {
		ThreadDemo5 t = new ThreadDemo5("Thread1") {//Anonymous class 匿名類別寫法
			public void run() {
				for(int i = 0 ;i<100;i++)
					System.out.println(getName()+" : Number "+i);
			}
		};
		t.start();
		ThreadDemo5 t1 = new ThreadDemo5("Thread2") {
			public void run() {
				for(int i = 0 ;i<50;i++)
					System.out.println(getName()+" : Number "+i);
			}
		};
		t1.start();

	}

}
