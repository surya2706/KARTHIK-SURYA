
/* KARTHIK SURYA
 * 1 DEC 2016
 * ArrayList vs LinkedList
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListDifference ld = new ListDifference();
		List<Integer> al = new ArrayList<Integer>(ld.generateRandomNumbersArray());
		List<Integer> ll = new LinkedList<Integer>(ld.generateRandomNumbersLinked());

		System.out.println("Time taken in ArrayList to access element: " + ld.accessNumberArray(al) + "ms");
		System.out.println("Time taken in LinkedList to access element: " + ld.accessNumberList(ll) + "ms");

		System.out.println("\nSearched number found ? (True/false): " + ld.searchForNumber(al, 54));

		long als = ld.timeForArrayListSearch();
		System.out.println("\nTime taken by ArrayList to search elements: " + als + "ms");

		long lls = ld.timeForLinkedListSearch();
		System.out.println("Time taken by LinkedList to search elements: " + lls + "ms");

		System.out.println(ld.searchDifference(als, lls));

		long ial = ld.insertRandomValuesAtRandomIndecesArrayList();
		System.out.println("\nTime taken for insertion by ArrayList: " + ial + "ms");

		long ill = ld.insertRandomValuesAtRandomIndecesLinkedList();
		System.out.println("Time taken for insertion by LinkedList: " + ill + "ms");

		System.out.println(ld.insertionDifference(ial, ill));

		long ral = ld.removeRandomValuesAtRandomIndecesArrayList();
		System.out.println("\nTime taken to remove elements from ArrayList: " + ral + "ms");

		long rll = ld.removeRandomValuesAtRandomIndecesLinkedList();
		System.out.println("Time taken to remove elements from LinkedList: " + rll + "ms");

		System.out.println(ld.removeDifference(ral, rll));
	}
}