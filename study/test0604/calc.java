package test0604;

import java.util.InputMismatchException;

public class calc {
	int num1, num2;
	char op;

	
	public calc(int num1, char op, int num2) {
		this.num1=num1;
		this.op=op;
		this.num2=num2;
		
	}

	void getResult() {
		try {
			if (this.op == '+') {
				System.out.printf("%d %c %d = %d\n", this.num1, this.op, this.num2, this.num1 + this.num2);
			}
			if (op == '-') {
				System.out.printf("%d %c %d = %d\n", num1, op, num2, num1 - num2);
			}
			if (op == '*') {
				System.out.printf("%d %c %d = %d\n", num1, op, num2, num1 * num2);
			}
			if (op == '/') {
				System.out.printf("%d %c %d = %d\n", num1, op, num2, num1 / num2);
			}
		} 
		catch (Exception e) {
			System.out.println("0으로 나눌 수 없음 ");
		}
			
//		catch(ArithmeticException e) {
//			
//		}
//		catch(InputMismatchException e) {
//			
//		}
	}
}
