package test0611;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class p591 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		Set<Integer> ks = map.keySet();
		
		for (Integer n : ks) {
			System.out.print(n.toString()+'\t');
		}
		System.out.println();
		
		for (Integer n : ks) {
			System.out.println(map.get(n).toString() + '\t');
		}
		System.out.println();
		
		for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();) {
			System.out.println(map.get(itr.next())+ '\t');
		}
		System.out.println();
	}
}
