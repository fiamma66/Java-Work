
public class SyncDemo implements Runnable {
	private Thread t;
	private int[] num;
	static SumArrary sa = new SumArrary();
	public SyncDemo(String name , int[] num) {
		t = new Thread(this,name);
		this.num = num;
		t.start();
	}
	public void run() {
		int ans = sa.sumArr(num);
		System.out.println(t.getName()+" : sum = "+ans);
	}

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		new SyncDemo("Thread1",num);
		new SyncDemo("Thread2",num);

	}

}

class SumArrary{
	int sum;
	public synchronized int sumArr(int[] num) {
		sum=0;
		for(int i = 0 ; i < num.length ; i++) {
			sum+=num[i];
			System.out.println(Thread.currentThread().getName()+" : total = "+sum);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		return sum;
	}
}

