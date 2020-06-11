package test0610;

import java.util.HashSet;
import java.util.Iterator;

public class morningTest {

	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>();

		set.add(new Num(7799));
		set.add(new Num(9955));
		set.add(new Num(7799));

		
		
		
		
		System.out.println("인스턴스 수"+ set.size());
		
		Object[] value = set.toArray();
		
		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i]);
		}
		
		System.out.println();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
		
		
		
//
//		while(true) {
//			set.add(new Num((int)Math.random()*45+1));
//			if(set.size()==6) {
//				break;
//			}
//		}
//		
//		System.out.println();
		
		
		
//		List<String> list = new LinkedList<>();
//		
//		list.add("AAA");
//		list.add("BBB");
//		list.add("CCC");
//		list.add("BBB");
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

	}

}
