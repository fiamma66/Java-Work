
public class StringDemo {

	public static void main(String[] args) {
	/*	String str = ("Hello world, welcome to java world.");
		String[] tokens = str.split(" ");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);

		}
		tokens = str.split(",");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);

		}
		
		String str1 = "Hello world",str2 = "hello world";
		System.out.println(str1.compareTo(str2));
		*/
		String s= new StringBuilder().append(8).append(9).append("Enter").append(200).append(21.5).toString();
		System.out.println(s);
		s=new StringBuffer().append(55).append(51).append(41).toString();
		System.out.println(s);
	}
}
