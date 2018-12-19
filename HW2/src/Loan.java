
public class Loan {

	public static void main(String[] args) {
		int P = 100000;
		double rb = 0.20 / 12, rp = 0.1, ru = 0.01;
		double sum_b = 0, sum_p = 0, sum_u = 0;
		System.out.printf("%s%n", "\t銀行      當鋪             地下錢莊");// 印出表頭

		for (int n = 1; n <= 12; n++) {
			System.out.printf("%s%d%s", "第", n, "月:");
			for (int k = 1; k <= n; k++)
				sum_b = P * (Math.pow((1 + rb), k));
			System.out.printf("%s%10.2f" ,"  ", sum_b);
			for (int j = 1; j <= n; j++)
				sum_p = P * (Math.pow((1 + rp), j));
			System.out.printf("%s%10.2f" ,"  ", sum_p);
			for (int h = 1; h <= (n * 30); h++)
				sum_u = P * (Math.pow((1 + ru), h));
			System.out.printf("%s%10.2f" ,"  ", sum_u);

			System.out.print("\n");

		} // 印出直行月份

	}

}
