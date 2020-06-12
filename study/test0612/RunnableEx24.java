package test0612;

class Account{
	int balance = 1000;
	
	public void withdraw(int money) {
		if(balance >= money) {
			try {  } catch(Exception e) {}
			balance -= money;
		}
	}
}

public class RunnableEx24 implements Runnable {

	Account acc = new Account();
	@Override
	public void run() {
		while(acc.balance > 0 ) {
			int money = (int)(Math.random()*3+1)*100;
			acc.withdraw(money);
			System.out.println("balance:"+acc.balance);
		}
	}
	public static void main(String[] args) {
		
		Runnable r = new RunnableEx24();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		
	}
		
		
		

}
