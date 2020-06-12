package test0612;

import java.util.HashSet;
import java.util.Iterator;

public class hashLottoTest {

	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<>();
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random()*45)+1);
		}
		
		Iterator<Integer> it = lotto.iterator();
		while(it.hasNext()) {
			System.out.print (it.next()+" ");
		}
	}
}
//6월 10일 5번 로또문제