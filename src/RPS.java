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
//		if (whatRPS == "����") {
//			RPS = 1;
//		} else if (whatRPS == "����") {
//			RPS = 2;
//		} else if (whatRPS == "��") {
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
//		System.out.print("����, ����, �� �� �Ѱ����� �Է����ּ��� :");
//		String RPS=sc.next();
//		if(RPS.equals("����")||RPS.equals("����")||RPS.equals("��")) {
//			result=us.userHand(RPS);
//			
//		}else {
//			System.out.println("�ٽ� �Է�");
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
//					System.out.println("���");
//				} 
//				if (co.comHand()==2) {
//					System.out.println("��");
//				} 
//				if (co.comHand()==3) {
//					System.out.println("�̱�");
//				} 
//
//			}// if Scissors
//			if (result == 2) {
//				if (co.comHand()==1) {
//					System.out.println("�̱�");
//				} 
//				if (co.comHand()==2) {
//					System.out.println("���");
//				} 
//				if (co.comHand()==3) {
//					System.out.println("��");
//				} 
//			}// if Rock
//			if (result == 3) {
//				if (co.comHand()==1) {
//					System.out.println("��");
//				} 
//				if (co.comHand()==2) {
//					System.out.println("�̱�");
//				} 
//				if (co.comHand()==3) {
//					System.out.println("���");
//				} 
//			}// if Paper
//			
//		} // end of while resulte
//	}//end of while
//	}//end of class
//
////���� �ҷ�����
//	// ���� �ҷ�����
//	// ���� �� ���
//	// �� �Ҳ���?
//
//
//public class RPS {
//	public static void main(String[] args) {
//		Game ga = new Game();
//		ga.game();
//	}
//}
