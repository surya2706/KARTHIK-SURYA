/* KARTHIK SURYA
 * 2 DEC 2016
 * Sorting Strings in a Collection
 */
import java.util.ArrayList;
import java.util.List;

public class MainControler {

	public static void main(String[] args) {
		StringCollection sc = new StringCollection();
		List<String> al = new ArrayList<String>();
		al = sc.addString();
		System.out.println("Original Strings in list: " + al);
		List<String> sl = new ArrayList<String>();
		sl = sc.shuffleList(al);
		System.out.println("\nList after shuffling the original: " + sl);
		System.out.println("\nList after sorting: " + sc.sortList(sl));

	}

}
