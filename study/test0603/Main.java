package test0603;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1, num2;
		char op;
		char YorN;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("첫번째 숫자를 넣으세요:");
			num1 = sc.nextInt();
			System.out.print("연산 기호를 넣으세요:");
			op = sc.next().charAt(0);
			System.out.print("두번째 숫자를 넣으세요:");
			num2 = sc.nextInt();

			try {
				if (op == '+') {
					System.out.printf("%d %c %d = ", num1, op, num2);
					System.out.println(num1 + num2);
				}
				if (op == '-') {
					System.out.printf("%d %c %d = ", num1, op, num2);
					System.out.println(num1 - num2);
				}
				if (op == '*') {
					System.out.printf("%d %c %d = ", num1, op, num2);
					System.out.println(num1 * num2);
				}
				if (op == '/') {
					System.out.printf("%d %c %d = ", num1, op, num2);
					System.out.println(num1 / num2);
				}

			} // end try
			catch (Exception e) {
				System.out.println("계산불가^^");
			}
			System.out.print("continue? Y or N:");
			YorN = sc.next().charAt(0);
			if (YorN == 'N' || YorN == 'n') {
				break;
			}
		}
	}
}
