package test0527;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int com;
		String user;

		Scanner sc = new Scanner(System.in);
		// 1가위 2바위 3보

		while (true) {

			System.out.print("(그만하시려면 그만 입력)\n가위 바위 보 중에 입력해주세요 :");
			user = sc.next();
			sc.nextLine();// 개행문자(엔터) 없애주려고

			com = (int) (Math.random() * 3 + 1);

			if (user.equals("가위") || user.equals("바위") || user.equals("보")) {
				switch (com) {
				case 1:
					System.out.println("컴퓨터 : 가위");
					break;
				case 2:
					System.out.println("컴퓨터 : 바위");
					break;
				case 3:
					System.out.println("컴퓨터 : 보");
					break;
				}

				if (user.equals("가위") && com == 1) {
					System.out.println("----비겼습니다.----");
				} else if (user.equals("가위") && com == 2) {
					System.out.println("ㅠㅠㅠㅠ겼습니다.ㅠㅠㅠㅠ");
				} else if (user.equals("가위") && com == 3) {
					System.out.println("☆☆☆☆이겼습니다.☆☆☆☆");
				}

				if (user.equals("바위") && com == 1) {
					System.out.println("☆☆☆☆이겼습니다.☆☆☆☆");
				} else if (user.equals("바위") && com == 2) {
					System.out.println("----비겼습니다.----");
				} else if (user.equals("바위") && com == 3) {
					System.out.println("ㅠㅠㅠㅠ겼습니다.ㅠㅠㅠㅠ");
				}

				if (user.equals("보") && com == 1) {
					System.out.println("ㅠㅠㅠㅠ겼습니다.ㅠㅠㅠㅠ");
				} else if (user.equals("보") && com == 2) {
					System.out.println("☆☆☆☆이겼습니다.☆☆☆☆");
				} else if (user.equals("보") && com == 3) {
					System.out.println("----비겼습니다.----");
				}
				System.out.println();
				System.out.println();
			} // end of big if
			else if (user.equals("그만")) {
				System.out.println("좋은 승부였습니다.(_ _)");
				break;
			} else {
				System.out.println("정확하게 입력해주세요;");
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
//		System.out.println("평균은 "+me.average());
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
