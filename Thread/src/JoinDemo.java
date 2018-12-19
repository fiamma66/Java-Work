
public class JoinDemo {

	public static void main(String[] args) {
		RunnableDemo t1 = new RunnableDemo("Thread1");
		RunnableDemo t2 = new RunnableDemo("Thread2");
		System.out.println(t1.t.getName()+" : "+t1.t.isAlive());
		System.out.println(t2.t.getName()+" : "+t2.t.isAlive());
		try {
			t1.t.join();
			t2.t.join();
			} catch (InterruptedException e) {} //直到做完 才接續做下面
		System.out.println(t1.t.getName()+" : "+t1.t.isAlive());
		System.out.println(t2.t.getName()+" : "+t2.t.isAlive());
	}

}
