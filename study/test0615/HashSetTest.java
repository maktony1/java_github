package test0615;

import java.util.HashSet;

class Num {
	private int num;

	public Num(int n) {
		num = n;
	}

	
	public String toString() {
		return String.valueOf(num);
	}
}

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>();

		set.add(new Num(7799));
		set.add(new Num(9955));
		set.add(new Num(7799));
		
		System.out.println("인스턴스 수 :" + set.size());
		
		
	}

}
