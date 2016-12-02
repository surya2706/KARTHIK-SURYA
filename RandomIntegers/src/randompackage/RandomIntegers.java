/* KARTHIK SURYA S
 * 11 Nov 2016
 * Count 6's and 9's 
 */
package randompackage;

public class RandomIntegers {

	static int res[] = new int[10000000];

	public static int[] generateIntegers(int max) {

		for (int i = 0; i < 10000000; i++) {
			res[i] = (int) (Math.random() * max);
		}
		return res;
	}

}
