package test0528;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		int[] recommendNumber=new int[6];
		
		for (int i = 0; i < recommendNumber.length; i++) {
			
			recommendNumber[i]=(int) (Math.random()*45+1); //1�̻� 45�̸��Ǽ� +1�� 0�� �����°� ���� 
			
			for (int j = 0; j < i; j++) {
				if(recommendNumber[i]==recommendNumber[j]) {
					i--;
				}
			}//end for j
		}//end for i
		System.out.println
		(Arrays.toString(recommendNumber)); // �� �� �� �� 
		System.out.println("�� �� ÷ ��");
	}

}
