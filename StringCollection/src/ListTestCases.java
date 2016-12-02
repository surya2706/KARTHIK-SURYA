/* KARTHIK SURYA
 * 2 DEC 2016
 * Sorting Strings in a Collection
 */
import java.util.ArrayList;
import java.util.List;

public class ListTestCases {

	List<String> list = new ArrayList<String>();

	public List<String> testCase1(List<String> li) {
		li.add("Varun");
		li.add("Farook");
		li.add("Kamal");
		li.add("Suresh");
		li.add("Meena");
		return li;
	}

	public String expectedOutput1() {
		return "[Farook, Kamal, Meena, Suresh, Varun]";
	}

	public List<String> testCase2(List<String> li) {
		li.add("Ram");
		li.add("James");
		li.add("Sai");
		li.add("Shyam");
		li.add("Guru");
		return li;
	}

	public String expectedOutput2() {
		return "[Guru, James, Ram, Sai, Shyam]";
	}

	public List<String> testCase3(List<String> li) {
		li.add("Kamesh");
		li.add("Nila");
		li.add("Samantha");
		li.add("Agalya");
		li.add("Kavya");
		return li;
	}

	public String expectedOutput3() {
		return "[Agalya, Kamesh, Kavya, Nila, Samantha]";
	}

}
