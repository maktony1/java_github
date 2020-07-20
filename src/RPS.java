//import java.util.Scanner;
//
//class User {
//	String whatRPS;
//
//	public User() {
//	}
//
//	public int userHand(String whatRPS) {
//		int RPS = 0;
//		 
//		if (whatRPS == "가위") {
//			RPS = 1;
//		} else if (whatRPS == "바위") {
//			RPS = 2;
//		} else if (whatRPS == "보") {
//			RPS = 3;
//		} 
//
//		return RPS;
//
//	}
//}
//
//class Com {
//	int whatRPS;
//
//	public Com() {
//
//	}
//
//	int comHand() {
//		this.whatRPS = (int) Math.random() * 3 + 1;
//
//		return whatRPS;
//	}
//}
//
//class Game {
//	public void game() {
//		Scanner sc = new Scanner(System.in);
//		User us = new User();
//		Com co = new Com();
//		int result;
//while(true) {
//		System.out.print("가위, 바위, 보 중 한가지를 입력해주세요 :");
//		String RPS=sc.next();
//		if(RPS.equals("가위")||RPS.equals("바위")||RPS.equals("보")) {
//			result=us.userHand(RPS);
//			
//		}else {
//			System.out.println("다시 입력");
//		}
//}
//		
//		
////		String whatRPS;
//		
//		while (true) {
//				
//			if (result == 1) {
//				if (co.comHand()==1) {
//					System.out.println("비김");
//				} 
//				if (co.comHand()==2) {
//					System.out.println("짐");
//				} 
//				if (co.comHand()==3) {
//					System.out.println("이김");
//				} 
//
//			}// if Scissors
//			if (result == 2) {
//				if (co.comHand()==1) {
//					System.out.println("이김");
//				} 
//				if (co.comHand()==2) {
//					System.out.println("비김");
//				} 
//				if (co.comHand()==3) {
//					System.out.println("짐");
//				} 
//			}// if Rock
//			if (result == 3) {
//				if (co.comHand()==1) {
//					System.out.println("짐");
//				} 
//				if (co.comHand()==2) {
//					System.out.println("이김");
//				} 
//				if (co.comHand()==3) {
//					System.out.println("비김");
//				} 
//			}// if Paper
//			
//		} // end of while resulte
//	}//end of while
//	}//end of class
//
////유저 불러오기
//	// 컴터 불러오기
//	// 승패 값 출력
//	// 더 할꺼니?
//
//
//public class RPS {
//	public static void main(String[] args) {
//		Game ga = new Game();
//		ga.game();
//	}
//}
