package test0528;

public class ArraysGugudan {

	public static void main(String[] args) {

		int[][] gugu = { { 2, 3, 4, 5, 6, 7, 8, 9 }, 
						 { 1, 2, 3, 4, 5, 6, 7, 8, 9 } };

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(gugu[0][j] + " x " + gugu[1][i] + " = " + (gugu[0][j] * gugu[1][i])+"\t");
			}
			System.out.println();
		}

	}// end of main
}// end of class
