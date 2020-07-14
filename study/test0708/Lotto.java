package test0708;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto=new int[7];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=(int) (Math.random()*7+1);
			for (int j = 0; j < i ; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
}
