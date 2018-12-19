
public class Convert {
	static void toBinary(int n) {
		int num = n;
		
		if(num==1 || num==0) {
			System.out.print(num);
		}
		else {
			int r = num%2;
			toBinary(num/2);
			System.out.print(r);
		}
	}
	
	static void toHexidecimal(int n) {
		int num = n;
		if(num<=9 || num==0) {
			System.out.print(num);

		}
		else {
			int r = num%16;
			toHexidecimal(num/16);
			switch(r) {
			default: System.out.print(r); break;
			case 10: System.out.print("a"); break;
			case 11: System.out.print("b"); break;
			case 12: System.out.print("c"); break;
			case 13: System.out.print("d"); break;
			case 14: System.out.print("e"); break;
			case 15: System.out.print("f"); break;
			}
			
		}
		
	}

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println(Integer.toBinaryString(num));
		toBinary(num);
		System.out.print("\n"+"==============="+"\n"); 
		System.out.println(Integer.toHexString(num));
		toHexidecimal(num);



	}

}
