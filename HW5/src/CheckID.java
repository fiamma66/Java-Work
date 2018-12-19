import java.util.Scanner;

public class CheckID {
	static int checkArea(String A) {
		int result=0;
		if(A.equals("A")) {
			result= 1*1+0*9;
		} else if(A.equals("B")) {
			result=1*1+1*9;
		} else if(A.equals("C")) {
			result = 1*1+2*9;
		} else if(A.equals("D")) {
			result = 1*1+3*9;
		} else if(A.equals("E")) {
			result = 1*1+4*9;
		} else if(A.equals("F")) {
			result = 1*1+5*9;
		} else if(A.equals("G")) {
			result = 1*1+6*9;
		} else if(A.equals("H")) {
			result = 1*1+7*9;
		} else if(A.equals("I")) {
			result = 3*1+4*9;
		} else if(A.equals("J")) {
			result = 1*1+8*9;
		} else if(A.equals("K")) {
			result = 1*1+9*9;
		} else if(A.equals("M")) {
			result = 2*1+1*9;
		} else if(A.equals("N")) {
			result = 2*1+2*9;
		} else if(A.equals("O")) {
			result = 3*1+5*9;
		} else if(A.equals("P")) {
			result = 2*1+3*9;
		} else if(A.equals("R")) {
			result = 2*1+5*9;
		} else if(A.equals("S")) {
			result = 2*1+6*9;
		} else if(A.equals("T")) {
			result = 2*1+7*9;
		} else if(A.equals("U")) {
			result = 2*1+8*9;
		} else if(A.equals("V")) {
			result = 2*1+9*9;
		} else if(A.equals("W")) {
			result = 3*1+2*9;
		} else if(A.equals("X")) {
			result = 3*1+0*9;
		} else if(A.equals("Z")) {
			result = 3*1+3*9;
		} else if(A.equals("L")) {
			result = 2*1+0*9;
		} else if(A.equals("Y")) {
			result = 3*1+1*9;
		}
		return result;
	}
	static boolean isID(String id) {
		boolean result = false ;
		String Pattern = "^[A-Z]{1}[12]{1}[0-9]{8}";
		if(id.matches(Pattern)) {
			int sum1 =checkArea(String.valueOf(id.charAt(0))) +
					Character.getNumericValue(id.charAt(1))*8 + 
					Character.getNumericValue(id.charAt(2))*7 +
					Character.getNumericValue(id.charAt(3))*6 +
					Character.getNumericValue(id.charAt(4))*5 +
					Character.getNumericValue(id.charAt(5))*4 +
					Character.getNumericValue(id.charAt(6))*3 +
					Character.getNumericValue(id.charAt(7))*2 +
					Character.getNumericValue(id.charAt(8))*1 +
					Character.getNumericValue(id.charAt(9))*1;
			System.out.println(sum1);
			if(sum1%10==0) {
				result = true;
			}
				
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input your ID:");
		String ID = scanner.next();
		System.out.println(isID(ID));
		scanner.close();

		
	}

}
