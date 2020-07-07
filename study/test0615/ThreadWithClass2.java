package test0615;

class ThreadWithRunnable2{
	
}
public class ThreadWithClass2 {
		public static void main(String[] args) {
			ThreadWithClass thread1 = new ThreadWithClass();
			Thread thread2=new Thread(new ThreadWithRunnable());
			thread1.start();
			thread2.start();
		}
	}

