package test0601;

public class TwoD {

	public static void main(String[] args) {
		int[][] arr= {{11,22,33},{44,55,66},{77,88,99}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}

}
