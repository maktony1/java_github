package test0615;


class Account2{
	int balance = 1000;
	
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try { Thread.sleep(10); } catch(Exception e) {}
			balance -= money;
		}
	}
}

public class ThreadSyschronized implements Runnable {
	Account2 acc = new Account2();
	@Override
	public void run() {
		while(acc.balance > 0 ) {
			int money = (int)(Math.random()*3+1)*100;
			acc.withdraw(money);
			System.out.println("balance:"+acc.balance);
		}
	}
	public static void main(String[] args) {
		ThreadSyschronized r = new ThreadSyschronized();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		
	}
}
