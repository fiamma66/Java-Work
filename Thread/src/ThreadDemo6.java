
public class ThreadDemo6 extends Thread{
	public ThreadDemo6(String name){
		super(name);
	}
	
	public static void main(String[] args) {
		new ThreadDemo6("Thread1") {//Anonymous class 匿名類別寫法 
			public void run() {
				for(int i = 0 ;i<100;i++)
					System.out.println(getName()+" : Number "+i);
			}
		}.start();//不產生參用 精簡化
		new ThreadDemo6("Thread2") {
			public void run() {
				for(int i = 0 ;i<50;i++)
					System.out.println(getName()+" : Number "+i);
			}
		}.start();

	}

}
