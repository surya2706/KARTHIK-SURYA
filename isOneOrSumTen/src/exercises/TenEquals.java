/*
 * KARTHIK SURYA S
 * 3 Nov 2016
 * Write your own String Class
*/
package exercises;

public class TenEquals {

	public static boolean isOneOrSum10(int a, int b) {
		// your code here
		if (a == 10 || b == 10) {
			return true;
		} else if (a + b == 10) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = isOneOrSum10(9, 10);
		System.out.println("isOneOrSum10(9, 10) -->" + result);
		boolean result1 = isOneOrSum10(9, 9);
		System.out.println("isOneOrSum10(9, 9) -->" + result1);
		boolean result2 = isOneOrSum10(1, 9);
		System.out.println("isOneOrSum10(1, 9) -->" + result2);
	}

}
