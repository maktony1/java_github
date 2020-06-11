package test0528;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		int num1,num2;
		char op;
		char YorN = 'Y';
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫번째 숫자를 넣으세요 :");
				num1=sc.nextInt();
			System.out.print("연산기호를 넣으세요 :");
				op=sc.next().charAt(0);
			System.out.print("두번째 숫자를 넣으세요 :");
				num2=sc.nextInt();
				
			System.out.printf("%d %c %d = ",num1,op,num2);
			
			switch (op) {
			case '+':
				System.out.println(num1+num2);
				break;
			case '-':
				System.out.println(num1-num2);
				break;
			case '*':
				System.out.println(num1*num2);
				break;
			case '/':
				System.out.println(num1/num2);
				break;
			}//end of switch
			
			System.out.print("continue? Y or N : ");
			YorN=sc.next().charAt(0);
			
			if(YorN=='N') {
				break;
			}
			
		}//end of while
		
	}//end of main
}//end of class
