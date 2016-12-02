
public class ConsX {

	static int countXX(String str) {
		// int len = str.length();
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 1).equals("xx"))
				count++;

		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int result = countXX("abcxx");
		System.out.println(countXX("abcxx"));

	}

}
