package test0529;

import java.util.Arrays;

public class MAX {

	public MAX() {

	}
	int[] arr=new int[10];
	void getMaxValue() {
		int max;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*100+1);
			for (int j = 0; j < i; j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}//end for
		System.out.println(Arrays.toString(arr));
		max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max=arr[i];
			}
		}//end for 
		System.out.println("max: "+max);
	}
	
}
