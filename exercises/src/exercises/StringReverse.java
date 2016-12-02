package exercises;

public class StringReverse {

	public void stringReverseNonRecursive(String s) {
		int l = s.length();
		char[] ch = s.toCharArray();
		char temp;
		int left, right = 0;
		right = l - 1;
		for (left = 0; left < right; left++, right--) {
			temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
		}

		for (char c : ch) {
			System.out.print(c);
		}
	}

	public String stringReverseRecursive(String s) {
		if ((s == null) || (s.length() <= 1))
			return s;
		return stringReverseRecursive(s.substring(1)) + s.charAt(0);
	}

}
