package test0615;

class ThreadWithClass extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(getName()); // ���� ���� ���� �������� �̸��� ��ȯ��.

			try {
				Thread.sleep(10); // 0.01�ʰ� �����带 ����.

			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}
}
class ThreadWithRunnable implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {

			System.out.println(Thread.currentThread().getName()); // ���� ���� ���� �������� �̸��� ��ȯ��.

			try {

				Thread.sleep(10);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

		}

	}

}

public class ThreadTest2Sol {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		ThreadWithClass thread1 = new ThreadWithClass(); // Thread Ŭ������ ��ӹ޴� ���
		Thread thread2 = new Thread(new ThreadWithRunnable()); // Runnable �������̽��� �����ϴ� ���

		thread1.start(); // �������� ����
		thread2.start(); // �������� ����
	}

}