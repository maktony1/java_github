package test0528;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		int num1,num2;
		char op;
		char YorN = 'Y';
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("ù��° ���ڸ� �������� :");
				num1=sc.nextInt();
			System.out.print("�����ȣ�� �������� :");
				op=sc.next().charAt(0);
			System.out.print("�ι�° ���ڸ� �������� :");
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
