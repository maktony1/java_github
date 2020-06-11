package test0527;

import java.util.Scanner;

public class Calculator {
	double num1, num2;
	String cal;
	double result;
	String conti;

	Scanner sc = new Scanner(System.in);

	public Calculator() {
	}

	void execute() {
		loop:while (true) {

			System.out.print("첫번째 숫자를 넣으세요 : ");
			this.num1 = sc.nextInt();
			System.out.print("연산 기호를 넣으세요 : ");
			this.cal = sc.next();
			System.out.print("두번째 숫자를 넣으세요 : ");
			this.num2 = sc.nextInt();

			switch (cal) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			}// end of switch
			System.out.printf("%.0f %s %.0f = ", num1, cal, num2);

			if ((num1 % num2) != 0) {
				System.out.printf("%f\n\n", result);
			} else {
				System.out.printf("%.0f\n\n", result);
			}

			System.out.print("continue? Y or N :");
			conti = sc.next();
			if (conti == "Y" || conti == "y") {
				continue;
			}
		}
	}
}// end of execute
