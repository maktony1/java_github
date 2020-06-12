package test0612;

import java.util.HashMap;
import java.util.Set;

public class hashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");

		Set<Integer> ks = map.keySet();

		for (Integer n : ks) {
			System.out.print(n.toString() + '\t');
		}
		System.out.println();
		for (Integer n : ks) {
			System.out.print(map.get(n) + '\t');
		}
	}

}
//public Set<K> keySet() {
//    Set<K> ks = keySet;
//    if (ks == null) {
//        ks = new KeySet();
//        keySet = ks;
//    }
//    return ks;
//}
