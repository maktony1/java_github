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

			System.out.print("ù��° ���ڸ� �������� : ");
			this.num1 = sc.nextInt();
			System.out.print("���� ��ȣ�� �������� : ");
			this.cal = sc.next();
			System.out.print("�ι�° ���ڸ� �������� : ");
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
