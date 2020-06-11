package test0527;

import java.util.Arrays;

class Box {
	private String conts;

	Box(String cont) {
		this.conts = cont;
	}

	public String toString() {
		return conts;
	}
}

public class ArrayTest {

	public static void main(String[] args) {
		int[] ar1 = new int[10];
		int[] ar2 = new int[10];

		Arrays.fill(ar1, 7); // 배열 ar1을 7로 초기화
		System.arraycopy(ar1, 0, ar2, 3, 4); // 배열 ar1을 ar2로 부분 복사
		//전송원 배열
		//소스 배열의 게시 위치
		//전송처 배열
		//전송처 데이터내의 게시 위치
		//카피되는 배열 요수의 수
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + " ");
		}

	}

}
