package randompackage;

public class MainControl {
	public static void main(String[] args) {

		/*
		 * RandomIntegers ri = new RandomIntegers(); Count6or9 csn = new
		 * Count6or9(); CountConsecutive cs = new CountConsecutive();
		 */

		long st = System.currentTimeMillis();
		int[] i = RandomIntegers.generateIntegers(100);

		// int[] i = ri.generateIntegers(100);

		System.out.println(Count6or9.countSixOrNine(i));
		System.out.println(CountConsecutive.countConsecutiveSixOrNine(i));
		System.out.println("Time in milliseconds is: " + (System.currentTimeMillis() - st) + "ms.");
	}

}
