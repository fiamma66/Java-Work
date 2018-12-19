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
				System.out.println("歡迎使用系統!");
			}
				
			else  {
				count++;
				System.out.println("輸入錯誤，請重試" + "\n" + "已錯誤:" + count);
			}

		} while (count < 3);
		
			System.out.println("超過次數");
		
		scanner.close();

	}

}
