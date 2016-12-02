package exercises;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverse s1 = new StringReverse();
		long st = System.nanoTime();
		s1.stringReverseNonRecursive("Karthik");
		System.out.println("\nTime taken for Non Recursive: " + (System.nanoTime() - st) + "ns");
		String str = s1.stringReverseRecursive("Surya");
		System.out.println("\n" + str);
		System.out.println("\nTime taken for Recursive: " + (System.nanoTime() - st) + "ns");

	}

}
