package test0527;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int com;
		String user;

		Scanner sc = new Scanner(System.in);
		// 1���� 2���� 3��

		while (true) {

			System.out.print("(�׸��Ͻ÷��� �׸� �Է�)\n���� ���� �� �߿� �Է����ּ��� :");
			user = sc.next();
			sc.nextLine();// ���๮��(����) �����ַ���

			com = (int) (Math.random() * 3 + 1);

			if (user.equals("����") || user.equals("����") || user.equals("��")) {
				switch (com) {
				case 1:
					System.out.println("��ǻ�� : ����");
					break;
				case 2:
					System.out.println("��ǻ�� : ����");
					break;
				case 3:
					System.out.println("��ǻ�� : ��");
					break;
				}

				if (user.equals("����") && com == 1) {
					System.out.println("----�����ϴ�.----");
				} else if (user.equals("����") && com == 2) {
					System.out.println("�ФФФа���ϴ�.�ФФФ�");
				} else if (user.equals("����") && com == 3) {
					System.out.println("�١١١��̰���ϴ�.�١١١�");
				}

				if (user.equals("����") && com == 1) {
					System.out.println("�١١١��̰���ϴ�.�١١١�");
				} else if (user.equals("����") && com == 2) {
					System.out.println("----�����ϴ�.----");
				} else if (user.equals("����") && com == 3) {
					System.out.println("�ФФФа���ϴ�.�ФФФ�");
				}

				if (user.equals("��") && com == 1) {
					System.out.println("�ФФФа���ϴ�.�ФФФ�");
				} else if (user.equals("��") && com == 2) {
					System.out.println("�١١١��̰���ϴ�.�١١١�");
				} else if (user.equals("��") && com == 3) {
					System.out.println("----�����ϴ�.----");
				}
				System.out.println();
				System.out.println();
			} // end of big if
			else if (user.equals("�׸�")) {
				System.out.println("���� �ºο����ϴ�.(_ _)");
				break;
			} else {
				System.out.println("��Ȯ�ϰ� �Է����ּ���;");
			}
		} // end of while
	}
}
//		int[] lotto = new int[6];
//		Random ran = new Random();
//
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = ran.nextInt(45) + 1;
//			for (int j = 0; j < i; j++) {
//				if (lotto[i] == lotto[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		Arrays.sort(lotto);
//		System.out.println(Arrays.toString(lotto));
//	}
//}
////////////////////////////////////////////////////////		
//		Scanner sc =new Scanner(System.in);
//		int math=sc.nextInt();
//		int science=sc.nextInt();
//		int english=sc.nextInt();
//		
//		
//		Grade me = new Grade(math, science, english);
//		
//		System.out.println("����� "+me.average());
//		
//		
//////////////////////////////////////////////////////////
//		Rectangle r1 = new Rectangle(5, 6);
//		Rectangle r2 = new Rectangle(7, 9);
//
//		Rectangle r3 = Rectangle.compareRect(r1, r2);
//		
//		System.out.println(r3.getHeight()+" : "+r3.getWidth());
//
//
//////////////////////////////////////////////////////////
//		String str = "ABCDEFG";
//		String result = str.substring(4);
//		System.out.println(result);
////////////////////////////////////////////////////////////
//		Circle c1 = new Circle(6);
//		Circle c2 = new Circle(7);
//		Circle c3 = new Circle(8);
//		
//		Circle max = Circle.maxCircle(c1,c2,c3);
//		
//		System.out.println(max.radius);
/////////////////////////////////////////////////////////////
//		Triangle t1 = new Triangle(10, 20);
//		Triangle t2 = new Triangle(10, 20);
//		Triangle t3 = new Triangle(10, 10);
//		
//		t1.equalTriangle(t2);
//		t1.equalTriangle(t3);
////////////////////////////////////////////////////////////
