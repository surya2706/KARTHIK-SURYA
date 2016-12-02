package exercises;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ListSetMap {

	public static void list() {
		List<Integer> list1 = new LinkedList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);

		for (Integer i : list1) {
			System.out.println(i);
		}
	}

	public static void set() {
		Set<String> set1 = new HashSet<String>();
		set1.add("Dog");
		set1.add("Cat");
		set1.add("Bear");

		set1.add("Dog");

		for (String s : set1) {
			System.out.println(s);

		}
		System.out.println("Set does not allows duplicates");
	}

	public static void map() {
		Map<Integer, String> map1 = new TreeMap<Integer, String>();
		map1.put(1, "Dog");
		map1.put(3, "Cat");
		map1.put(5, "Bear");

		for (Map.Entry<Integer, String> entry : map1.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list();
		System.out.println("\n");
		set();
		System.out.println("\n");
		System.out.println("Map uses keys as reference to store values. Keys are unique in map.");
		map();

	}

}
