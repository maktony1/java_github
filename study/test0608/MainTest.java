package test0608;

import java.util.Scanner;

public class MainTest implements IStatPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle[] rec = new Rectangle[3];
		
		for (int i = 0; i < rec.length; i++) {
			System.out.print((i+1)+"번째 사각형의 가로와 세로를 입력");
			rec[i]=new Rectangle(sc.nextInt(), sc.nextInt());
		}
		
		Rectangle[] recSorting = Rectangle.getSortingRec(rec);
		
		for (int i = 0; i < recSorting.length; i++) {
			System.out.println(rec[i].getArea());
		}
		
//		int num1,num2;
//		char op,YorN;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.print("첫번째 숫자");
//			num1=sc.nextInt();
//			System.out.print("연산기호");
//			op=sc.next().charAt(0);
//			System.out.print("두번째 숫자");
//			num2=sc.nextInt();
//			
//			if (op=='+') {
//				System.out.println(num1+" "+op+" "+num2+" = "+num1+num2);
//			}
//			if (op=='-') {
//				System.out.println(num1+" "+op+" "+num2+" = "+num1+num2);
//			}
//			if (op=='*') {
//				System.out.println(num1+" "+op+" "+num2+" = "+num1+num2);
//			}
//			if (op=='/') {
//				System.out.println(num1+" "+op+" "+num2+" = "+num1+num2);
//			}
//			if (YorN=="N" ||YorN=="n") {
//				break;
//			}
//		}
//		calc ca = new calc(num1, num2, op);
		
		
//		int num;
//		IStatPrint st = new IStatPrint() {
//		};
		
//		Person person1 = new Person("jeong-pro", 27);
//		Person person2 = new Person("jeong-pro", 27);
//		person1=person2;
//		System.out.println(person1.equals(person2));
	}


}
