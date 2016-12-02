/* KARTHIK SURYA
 * 2 DEC 2016
 * Sorting Strings in a Collection
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringCollection {

	public List<String> addString() {
		List<String> al = new ArrayList<String>();
		al.add("Karthik");
		al.add("Bhasker");
		al.add("Shaik");
		al.add("Ashwin");
		al.add("Vijay");
		al.add("Dhanush");
		al.add("Zaheer");
		al.add("Surya");
		al.add("Hari");
		al.add("Kamesh");
		return al;
	}

	public List<String> shuffleList(List<String> a) {
		Collections.shuffle(a);
		return a;
	}

	public List<String> sortList(List<String> a) {
		Collections.sort(a);
		return a;
	}

}
