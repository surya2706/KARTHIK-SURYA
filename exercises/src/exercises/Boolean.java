package exercises;

import java.util.Scanner;

public class Boolean {

	private static Scanner input;

	public static boolean posNeg(int a, int b, boolean negative) {
		if (((a < 0) && (b > 0)) || ((a > 0) && (b < 0))) {
			negative = true;
		} else if ((negative = true) && ((a < 0) && (b < 0))) {
			return true;
		} else {
			return false;
		}
		return negative;
	}

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int firstno = input.nextInt();
		System.out.println("Enter the second number :");
		int secondno = input.nextInt();
		System.out.println("Enter true or false :");
		boolean value = input.nextBoolean();
		boolean result = posNeg(firstno, secondno, value);
		System.out.println("The value is : " + result);

	}

}
