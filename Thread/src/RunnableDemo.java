
public class RunnableDemo implements Runnable{
	Thread t;
	public RunnableDemo(String name){
		t= new Thread(this, name);
		t.start();
	}
	
	public void run() {
		for(int i = 0 ;i<100;i++)
			System.out.println(t.getName()+" : Number "+i);
	}

	public static void main(String[] args) {
		new RunnableDemo("Thread1"); //不產生start 使用建構子使用start
		new RunnableDemo("Thread2");
		
		
	}

}
