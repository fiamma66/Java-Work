
public class ThreadDemo4 extends Thread{
	public ThreadDemo4(String name){
		super(name);
		start();
	}
	
	public void run() {
		for(int i = 0 ;i<100;i++)
			System.out.println(getName()+" : Number "+i);
	}

	public static void main(String[] args) {
		new ThreadDemo4("Thread1"); //不產生start 使用建構子使用start
		new ThreadDemo4("Thread2");
		int i =1;
		while(i>0) {
			new ThreadDemo4(Integer.toString(i));
			
			i++;
		}

	}

}
