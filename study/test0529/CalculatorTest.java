package test0529;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		int num1,num2;
		char op;
		char YesOrNo;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("ù ����:"); num1= sc.nextInt();
			System.out.print("�����ȣ:"); op=sc.next().charAt(0);
			System.out.print("�ι�° ����:"); num2= sc.nextInt();
			
			System.out.printf("%d %c %d = ",num1,op,num2);
			
			if(op=='+') {
				System.out.println(num1+num2);
			}
			if(op=='-') {
				System.out.println(num1-num2);
			}
			if(op=='*') {
				System.out.println(num1*num2);
			}
			if(op=='/') {
				System.out.println(num1/num2);
			}
			
			System.out.print("�ٽ�? Y or N :"); YesOrNo=sc.next().charAt(0);
			
			if(YesOrNo=='N'||YesOrNo=='n') {
				break;
			}
		}
		
	}
}
