
public class ArraySumDemo {

	public static void main(String[] args) {
		int sum=0;
		int[] oneDim= {2,6,1,4,3,5};
		for(int i=0;i<oneDim.length;i++)
			sum+=oneDim[i];
		System.out.println(sum);
		
		sum=0;
		int[][] twoDim= {{2,6,1},{4,3,5}};
		for(int i=0;i<twoDim.length;i++) {
			for(int j=0;j<twoDim[i].length;j++) {
				sum+=twoDim[i][j];
			}
		}
		System.out.println(sum);
		
		
		int sum1=0;
		int[][][] threeDim= { {{2,6,1},{4,3,5}},
			                  {{2,6,1},{4,3,5}},
			                  {{2,6,1},{4,3,5}} 
			                  };  //3X2X3
		for(int i=0;i<threeDim.length;i++) {// 第i層
			for(int j=0;j<threeDim[i].length;j++) { // 第i層第j列
				for(int k=0;k<threeDim[i][j].length;k++) {// 第i層第j列第k行
					sum1 += threeDim[i][j][k];
				}
				
			}
		}
		System.out.println(sum1);	
	}

}
