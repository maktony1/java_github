package test0528;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		int[] recommendNumber=new int[6];
		
		for (int i = 0; i < recommendNumber.length; i++) {
			
			recommendNumber[i]=(int) (Math.random()*45+1); //1이상 45미만의수 +1은 0이 나오는걸 방지 
			
			for (int j = 0; j < i; j++) {
				if(recommendNumber[i]==recommendNumber[j]) {
					i--;
				}
			}//end for j
		}//end for i
		System.out.println
		(Arrays.toString(recommendNumber)); // 최 종 출 력 
		System.out.println("☆ 당 첨 ☆");
	}

}
