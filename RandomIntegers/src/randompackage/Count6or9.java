package randompackage;

public class Count6or9 {

	public static String countSixOrNine(int[] res) {
		int count6 = 0;
		int count9 = 0;
		for (int i = 0; i < 10000000; i++) {
			if (res[i] == 6) {
				count6++;
			} else if (res[i] == 9) {
				count9++;
			}
		}
		return "Number of six: " + count6 + ". \nNumber of nine: " + count9;
	}
}
