/*
 * KARTHIK SURYA S
 * 3 Nov 2016
 * Write your own String Class
*/
package exercises;

public class Multiple {

	public static boolean multipleOf3Or5Only(int n) {
		// your code here
		if (((n % 3 == 0) && (n % 5 != 0)) || ((n % 3 != 0) && (n % 5 == 0))) {
			return true;
		} else
			return false;

	}

	public static void main(String[] args) {

		boolean result = multipleOf3Or5Only(25);
		System.out.println("multipleOf3Or5Only(25) -----> " + result);
		boolean result1 = multipleOf3Or5Only(26);
		System.out.println("multipleOf3Or5Only(26) -----> " + result1);
		boolean result2 = multipleOf3Or5Only(15);
		System.out.println("multipleOf3Or5Only(15) -----> " + result2);
		boolean result3 = multipleOf3Or5Only(6);
		System.out.println("multipleOf3Or5Only(6) -----> " + result3);
		boolean result4 = multipleOf3Or5Only(11);
		System.out.println("multipleOf3Or5Only(11) -----> " + result4);
		boolean result5 = multipleOf3Or5Only(99);
		System.out.println("multipleOf3Or5Only(99) -----> " + result5);
		boolean result6 = multipleOf3Or5Only(55);
		System.out.println("multipleOf3Or5Only(55) -----> " + result6);
		boolean result7 = multipleOf3Or5Only(28);
		System.out.println("multipleOf3Or5Only(28) -----> " + result7);
		boolean result8 = multipleOf3Or5Only(91);
		System.out.println("multipleOf3Or5Only(91) -----> " + result8);
	}

}
