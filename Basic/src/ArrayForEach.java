
public class ArrayForEach {

	public static void main(String[] args) {
		int sum=0;
		int[] oneDim= {2,6,1,4,3,5};
		for(int n : oneDim) {
			sum+=n;
			
		}//for each sum
		System.out.println(sum);
		
		sum=0;
		int[][] twoDim= {{2,6,1},{4,3,5}};
		for(int[] k :twoDim)
			for(int n : k)
				sum+=n;
		System.out.println(sum);
		
		sum=0;
		int[][][] threeDim= { {{2,6,1},{4,3,5}},
                {{2,6,1},{4,3,5}},
                {{2,6,1},{4,3,5}} 
                };  //3X2X3
		for(int[][]j : threeDim)
			for(int[]k : j)
				for(int n : k)
					sum+=n;
		System.out.println(sum);


	}

}
