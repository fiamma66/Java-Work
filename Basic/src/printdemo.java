
public class printdemo {

	public static void main(String[] args) {
		System.out.printf("/%5d/%n", 123);
		System.out.printf("/%5d/%n", -123);
		System.out.printf("/%+5d/%n", -123);
		System.out.printf("/%+5d/%n", 123);
		System.out.printf("/%-5d/%n", 123);
		System.out.printf("/%x/%n", 123);
		System.out.printf("/%#x/%n", 123);
		System.out.printf("/%#X/%n", 123);
		System.out.printf("/%f/%n", 12345.678); //預設6位小數點
		System.out.printf("/%10.2f/%n", 12345.678);
		System.out.printf("/%-10.1f/%n", 12345.678);
		System.out.printf("/%010.2f/%n", 12345.678);
		System.out.printf("/%10.2E/%n", 12345.678);
		System.out.printf("/%,10.2f/%n", 12345.678);
		System.out.printf("/%(10.1f/%n", -12345.678);
		System.out.printf("/%10s/%n", "student");
		System.out.printf("/%10.3G/%n", 12345.678);//G的使用 位數不同於以上

	}

}
