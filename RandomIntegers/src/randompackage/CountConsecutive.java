package randompackage;

public class CountConsecutive {
	public static String countConsecutiveSixOrNine(int[] res) {
		int count66 = 0;
		int count99 = 0;

		for (int i = 0; i < 10000000; i++) {

			if (res[i] == 6 && res[i + 1] == 6) {
				count66++;
			} else if (res[i] == 9 && res[i + 1] == 9) {
				count99++;

			}
		}
		return "Number of consecutive six :" + count66 + ". \nNumber of consecutive nine :" + count99;
	}

}
