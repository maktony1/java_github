package test0615;

public class CurrentThreadName {

	public static void main(String[] args) {
		Thread ct = Thread.currentThread();
		System.out.println(Thread.currentThread());
		System.out.println(ct);
		String name =ct.getName();
		System.out.println(name);
		System.out.println(name);
	}

}
