
public class JoinDemo {

	public static void main(String[] args) {
		RunnableDemo t1 = new RunnableDemo("Thread1");
		RunnableDemo t2 = new RunnableDemo("Thread2");
		System.out.println(t1.t.getName()+" : "+t1.t.isAlive());
		System.out.println(t2.t.getName()+" : "+t2.t.isAlive());
		try {
			t1.t.join();
			t2.t.join();
			} catch (InterruptedException e) {} //���찵�� �~���򰵤U��
		System.out.println(t1.t.getName()+" : "+t1.t.isAlive());
		System.out.println(t2.t.getName()+" : "+t2.t.isAlive());
	}

}
