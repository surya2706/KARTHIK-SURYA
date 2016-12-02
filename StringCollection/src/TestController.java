/* KARTHIK SURYA
 * 2 DEC 2016
 * Sorting Strings in a Collection
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestController {

	private static Scanner sc;

	public static void main(String[] args) {
		ListTestCases ltc = new ListTestCases();
		StringCollection scl = new StringCollection();
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<String> list3 = new ArrayList<String>();
		sc = new Scanner(System.in);
		System.out.println("Enter the test case to be executed (1 / 2/ 3): ");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			List<String> l1 = ltc.testCase1(list1);
			System.out.println("Input: " + l1);
			List<String> s1 = scl.shuffleList(l1);
			System.out.println("\nOutput after shuffling the original: " + s1);
			System.out.println("\nExpected output after sorting: " + ltc.expectedOutput1());
			System.out.println("\nOutupt after sorting: " + scl.sortList(s1));
			break;
		case 2:
			List<String> l2 = ltc.testCase2(list2);
			System.out.println("Input: " + l2);
			List<String> s2 = scl.shuffleList(l2);
			System.out.println("\nOutput after shuffling the original: " + s2);
			System.out.println("\nExpected output after sorting: " + ltc.expectedOutput2());
			System.out.println("\nOutput after sorting: " + scl.sortList(s2));
			break;
		case 3:
			List<String> l3 = ltc.testCase3(list3);
			System.out.println("Input: " + l3);
			List<String> s3 = scl.shuffleList(l3);
			System.out.println("\nOutput after shuffling the original: " + s3);
			System.out.println("\nExpected output after sorting: " + ltc.expectedOutput3());
			System.out.println("\nOutput after sorting: " + scl.sortList(s3));
			break;
		}

	}

}
