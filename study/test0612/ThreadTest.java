package test0612;

import javax.swing.JOptionPane;

/////////////////////////////////////////////////////////
//public class ThreadTest {
//	public static void main(String[] args) {
//
//		for (int i = 0; i < 300; i++) {
//			System.out.println("-");
//		}
//		for (int i = 0; i < 300; i++) {
//			System.out.println("");
//			
//		}
//	}//end of main
//}//end of class
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
//public class ThreadTest {
//
//	public static void main(String[] args) {
//
//		MyThread1 th1 = new MyThread1();
//		MyThread2 th2 = new MyThread2();
//		th1.start();
//		th2.start();
//	}// end of main
//}// end of class
//
//class MyThread1 extends Thread{
//	public void run() {
//		for (int i = 0; i < 300; i++) {
//			System.out.print("-");
//		}
//	}//end of run()
//}
//class MyThread2 extends Thread{
//	public void run() {
//		for (int i = 0; i < 300; i++) {
//			System.out.print("|");
//		}
//	}//end of run()
//}
/////////////////////////////////////////////////////////
public class ThreadTest{
	public static void main(String[] args) {
//		String th =Thread.currentThread().getName();
//		System.out.println(th);
	
		String input = JOptionPane.showInputDialog("아무값 입력:");
		System.out.println("입력하신 값은"+input+"입니다.");
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try{Thread.sleep(1000);}
		catch(Exception e) {}
			}
		}
	}
///////////////////////////////////////////////////////
