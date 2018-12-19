
public class nineXnine {

	public static void main(String[] args) {
		int i , j;
		for(i = 1; i <=9 ; i++) {
			for(j = 1; j <=9; j++) {
				System.out.printf("%d%s%d%s%d%s",i,"*",j,"=",i*j,"\t");
			}
			System.out.print("\n");
		}

	}

}
