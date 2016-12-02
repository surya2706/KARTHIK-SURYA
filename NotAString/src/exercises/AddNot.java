/*
 * KARTHIK SURYA S
 * 3 Nov 2016
 * Implement Not a String Method
*/
package exercises;

public class AddNot {

	public static String notAString(String str) {
		// your code here
		String not = "not";
		if (str.length() < 3) {
			return "Not " + str;
		}
		String eq = str.substring(0, 3);
		if (eq.equals(not) || eq.equals("Not")) {
			return str;
		}

		else {
			return "Not " + str;
		}

	}

	public static void main(String[] args) {

		System.out.println("going to happen --> " + notAString("going to happen"));
		System.out.println("a --> " + notAString("a"));
		System.out.println("not interested --> " + notAString("not interested"));

	}

}
