
public class Interest {

	public static void main(String[] args) {
		int P = 100000, n, n2 ;
		double r1 = 0.1, r2 = 0.05,  sum2 =0, sum1 = 0;
		for (n = 1; n <= 27; n++) // 單利
			sum1 = P +(P* r1* n);
		System.out.printf("%s%10.2f%n", "錢精打的本利和:", sum1);
		for (n2 = 1; n2 <= 27; (n2)++) {

			sum2=P*(Math.pow(1+r2, n));

		} // 複利

		System.out.printf("%s%10.2f%n", "郝細算的本利和:", sum2);
		

	}

}
