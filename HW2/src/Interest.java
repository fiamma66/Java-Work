
public class Interest {

	public static void main(String[] args) {
		int P = 100000, n, n2 ;
		double r1 = 0.1, r2 = 0.05,  sum2 =0, sum1 = 0;
		for (n = 1; n <= 27; n++) // ��Q
			sum1 = P +(P* r1* n);
		System.out.printf("%s%10.2f%n", "���르�����Q�M:", sum1);
		for (n2 = 1; n2 <= 27; (n2)++) {

			sum2=P*(Math.pow(1+r2, n));

		} // �ƧQ

		System.out.printf("%s%10.2f%n", "�q�Ӻ⪺���Q�M:", sum2);
		

	}

}
