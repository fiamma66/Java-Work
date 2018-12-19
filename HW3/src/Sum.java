
public class Sum {
	static int sum(int n) {
		if(n>1) {
			return 2*n + sum(n-1);
		}
		else {
			return 2;
		}
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println(sum(n));

	}

}
