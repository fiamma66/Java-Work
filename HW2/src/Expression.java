
public class Expression {

	public static void main(String[] args) {
		int sum=0 ,square;
		for(int i=1;i<=50;i++) {
			if(i % 2 !=0) {
				square = i * i;
				sum+=square;
			}//end of 機數檢查
			else {
				square = -1 * i *i;
				sum+=square;		
			}//end of 偶數檢查
			
		}//end of for
		System.out.printf("%d",sum);
 
	}

}
