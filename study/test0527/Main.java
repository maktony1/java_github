package test0527;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int com;
		String user;

		Scanner sc = new Scanner(System.in);
		// 1亜是 2郊是 3左

		while (true) {

			System.out.print("(益幻馬獣形檎 益幻 脊径)\n亜是 郊是 左 掻拭 脊径背爽室推 :");
			user = sc.next();
			sc.nextLine();// 鯵楳庚切(殖斗) 蒸蕉爽形壱

			com = (int) (Math.random() * 3 + 1);

			if (user.equals("亜是") || user.equals("郊是") || user.equals("左")) {
				switch (com) {
				case 1:
					System.out.println("陳濃斗 : 亜是");
					break;
				case 2:
					System.out.println("陳濃斗 : 郊是");
					break;
				case 3:
					System.out.println("陳濃斗 : 左");
					break;
				}

				if (user.equals("亜是") && com == 1) {
					System.out.println("----搾医柔艦陥.----");
				} else if (user.equals("亜是") && com == 2) {
					System.out.println("ばばばば医柔艦陥.ばばばば");
				} else if (user.equals("亜是") && com == 3) {
					System.out.println("』』』』戚医柔艦陥.』』』』");
				}

				if (user.equals("郊是") && com == 1) {
					System.out.println("』』』』戚医柔艦陥.』』』』");
				} else if (user.equals("郊是") && com == 2) {
					System.out.println("----搾医柔艦陥.----");
				} else if (user.equals("郊是") && com == 3) {
					System.out.println("ばばばば医柔艦陥.ばばばば");
				}

				if (user.equals("左") && com == 1) {
					System.out.println("ばばばば医柔艦陥.ばばばば");
				} else if (user.equals("左") && com == 2) {
					System.out.println("』』』』戚医柔艦陥.』』』』");
				} else if (user.equals("左") && com == 3) {
					System.out.println("----搾医柔艦陥.----");
				}
				System.out.println();
				System.out.println();
			} // end of big if
			else if (user.equals("益幻")) {
				System.out.println("疏精 渋採心柔艦陥.(_ _)");
				break;
			} else {
				System.out.println("舛溌馬惟 脊径背爽室推;");
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
//		System.out.println("汝液精 "+me.average());
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
