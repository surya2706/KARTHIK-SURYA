package exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Collections {

	public static void arrayList() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(5);
		al.add(4);
		al.add(9);
		al.add(5);
		for (Integer i : al) {
			System.out.println(i);
		}
		System.out.println("ArrayList maintains insertion order. \nIt allows duplicate values.");
	}

	public static void hashMap() {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "One");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(2, "two");
		for (Map.Entry<Integer, String> m1 : hm.entrySet()) {
			System.out.println(m1.getKey() + " " + m1.getValue());
		}
		System.out.println("HashMap has only unique values. \nIt maintains no order.");
	}

	public static void hashTable() {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "one");
		ht.put(2, "two");
		ht.put(3, "three");
		ht.put(2, "two");
		for (Map.Entry<Integer, String> m1 : ht.entrySet()) {
			System.out.println(m1.getKey() + " " + m1.getValue());
		}
		System.out.println("HashTable also has only unique values. \nIt synchronizes itself in the reverse order.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ArrayList");
		arrayList();
		System.out.println("\n");
		hashMap();
		System.out.println("\n");
		hashTable();

	}

}
