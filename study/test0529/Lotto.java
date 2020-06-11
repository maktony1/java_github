package test0529;

import java.util.Arrays;

public class Lotto {

	public Lotto() {
	}
	
	void execute() {
		int[] lotto=new int[6];
		
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=(int) (Math.random()*45+1);
			for (int j = 0; j < i; j++) {
				if(lotto[i]==lotto[j]) {
				i--;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
}
