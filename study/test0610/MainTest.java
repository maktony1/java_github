package test0610;

interface gugudan {
	public void gugudan();
}

public class MainTest implements gugudan {

	public void gugudan() {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%d x %d = %d\t", j, i, i * j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		MainTest play = new MainTest();

		play.gugudan();
	}

}