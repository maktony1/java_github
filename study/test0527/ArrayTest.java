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

		Arrays.fill(ar1, 7); // �迭 ar1�� 7�� �ʱ�ȭ
		System.arraycopy(ar1, 0, ar2, 3, 4); // �迭 ar1�� ar2�� �κ� ����
		//���ۿ� �迭
		//�ҽ� �迭�� �Խ� ��ġ
		//����ó �迭
		//����ó �����ͳ��� �Խ� ��ġ
		//ī�ǵǴ� �迭 ����� ��
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + " ");
		}

	}

}
