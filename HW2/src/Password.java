import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		String passwd,Passwd="0000";
		do {

			System.out.println("Please input your password:" + "\n" + "Default 0000");
			passwd = scanner.next();

			if (passwd.equals(Passwd)) {
				System.out.println("�w��ϥΨt��!");
			}
				
			else  {
				count++;
				System.out.println("��J���~�A�Э���" + "\n" + "�w���~:" + count);
			}

		} while (count < 3);
		
			System.out.println("�W�L����");
		
		scanner.close();

	}

}
