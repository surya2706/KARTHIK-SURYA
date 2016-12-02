/*
 * KARTHIK SURYA S
 * 3 Nov 2016
 * Near Hundred or 200
*/
package exercises;

public class NearHundred {

	public static boolean nearHundred(int a) {
		int diff;

		if ((a <= 110) && (a >= 90)) {
			diff = a - 110;
			int abs = Math.abs(diff);
			if (abs <= 20) {

			}
			return true;
		} else if ((a <= 210) && (a >= 190)) {
			diff = a - 210;
			int abs = Math.abs(diff);
			if (abs <= 20) {
			}
			return true;
		} else {
			return false;

		}
	}

	public static void main(String[] args) {

		System.out.println("nearHunded(93) --> " + nearHundred(93));
		System.out.println("nearHunded(90) --> " + nearHundred(90));
		System.out.println("nearHunded(89) --> " + nearHundred(89));
		System.out.println("nearHunded(110) --> " + nearHundred(110));
		System.out.println("nearHunded(209) --> " + nearHundred(209));
		System.out.println("nearHunded(250) --> " + nearHundred(250));
		System.out.println("nearHunded(211) --> " + nearHundred(211));

	}

}
