package exercises;

import java.io.File;
import java.io.FileReader;

public class HandlingException {

	public static void arithmeticException() {
		try {
			int a = 50;
			int b = 0;
			int c = a / b;
			System.out.println(a + "/" + b + " = " + c);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occured.");
		}
	}

	public static void nullPointerException() {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception occured.");
		}
	}

	public static void numberFormatException() {
		try {
			String s = "abc";
			int i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("Number Format Exceptin Occurs.");
		}
	}

	public static void indexOutOfBound() {
		try {
			int[] i = new int[4];
			i[10] = 50;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bound Exception occurs.");
		}
	}

	public static void fileNotFound() {
		try {
			File file = new File("E://file.txt");
			FileReader fr = new FileReader(file);

		} catch (Exception e) {
			System.out.println("File not found exception occurs.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithmeticException();
		nullPointerException();
		numberFormatException();
		indexOutOfBound();
		fileNotFound();
	}

}
