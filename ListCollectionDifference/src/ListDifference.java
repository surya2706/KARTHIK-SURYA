
/* KARTHIK SURYA
 * 1 DEC 2016
 * ArrayList vs LinkedList
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListDifference {
	Random ran = new Random();
	int random[] = new int[100000];
	List<Integer> al = new ArrayList<Integer>();
	List<Integer> ll = new LinkedList<Integer>();

	public List<Integer> generateRandomNumbersArray() {
		// List<Integer> al = new ArrayList<Integer>();
		int min = 0;
		int max = 500;
		for (int i = 0; i < 100000; i++) {
			al.add(ran.nextInt((max - min) + 1) + min);
		}
		return al;
	}

	public List<Integer> generateRandomNumbersLinked() {
		// List<Integer> ll = new LinkedList<Integer>();
		int min = 0;
		int max = 500;
		for (int i = 0; i < 100000; i++) {
			ll.add(ran.nextInt((max - min) + 1) + min);
		}
		return ll;
	}

	public long accessNumberArray(List<Integer> list) {
		long st = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list.get(i);

		}
		return (System.currentTimeMillis() - st);
	}

	public long accessNumberList(List<Integer> list) {
		long st = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list.get(i);
		}
		return (System.currentTimeMillis() - st);
	}

	public boolean searchForNumber(List<Integer> collectionOfNumbers, int numberToBeFound) {
		Collections.sort(collectionOfNumbers);
		if ((Collections.binarySearch(collectionOfNumbers, numberToBeFound)) > 0) {
			return true;
		} else
			return false;
	}

	public long timeForArrayListSearch() {
		long st = System.currentTimeMillis();
		searchForNumber(al, 54);
		return (System.currentTimeMillis() - st);
	}

	public long timeForLinkedListSearch() {
		long st = System.currentTimeMillis();
		searchForNumber(ll, 54);
		return (System.currentTimeMillis() - st);
	}

	public String searchDifference(long a, long b) {
		if (a < b) {
			return "Thus, ArrayList is faster than LinkedList in search operation.";
		} else
			return "Thus, LinkedList is faster than ArrayList in search operation.";
	}

	public long insertRandomValuesAtRandomIndecesArrayList() {
		long st = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			random[i] = (int) (Math.random() * 500);
			Integer rand = (Integer) random[i];
			al.add(random[i], rand);
		}
		return System.currentTimeMillis() - st;
	}

	public long insertRandomValuesAtRandomIndecesLinkedList() {
		long st = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			random[i] = (int) (Math.random() * 500);
			Integer rand = (Integer) random[i];
			ll.add(random[i], rand);
		}
		return System.currentTimeMillis() - st;
	}

	public String insertionDifference(long a, long b) {
		if (a < b) {
			return "Thus, ArrayList is faster than LinkedList in insertion operation.";
		} else
			return "Thus, Linked List is faster than ArrayList in insertion operation.";
	}

	public long removeRandomValuesAtRandomIndecesArrayList() {
		long st = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			random[i] = (int) (Math.random() * 500);
			al.remove(random[i]);
		}
		return System.currentTimeMillis() - st;
	}

	public long removeRandomValuesAtRandomIndecesLinkedList() {
		long st = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			random[i] = (int) (Math.random() * 500);
			ll.remove(random[i]);
			/*
			 * if(i < 1) { System.out.
			 * println("Time taken to remove individual element from LinkedList: "
			 * + (System.currentTimeMillis() - st)); }
			 */
		}
		return System.currentTimeMillis() - st;
	}

	public String removeDifference(long a, long b) {
		if (a < b) {
			return "Thus, ArrayList is faster than Linked List in remove operation.";
		} else
			return "Thus, LinkedList is faster than Array List in remove operation.";
	}

}
