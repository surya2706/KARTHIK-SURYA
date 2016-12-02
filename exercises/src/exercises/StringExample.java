package exercises;

public class StringExample {

	public static void stringEx(String str) {

		System.out.println(str);

	}

	public static void stringbuffer(String str) {
		StringBuffer sb = new StringBuffer(str);
		String rev;
		long tsb = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			rev = new String(sb.reverse());
		}
		System.out.println("Time taken for String Buffer: " + (System.currentTimeMillis() - tsb) + "ms");

	}

	public static void stringbuilder(String str) {
		StringBuilder sb = new StringBuilder(str);
		long tsb = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			String rev = new String(sb.reverse());
		}
		System.out.println("Time taken for String Builder: " + (System.currentTimeMillis() - tsb) + "ms");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringEx("Karthik");
		stringbuffer("Karthik");
		stringbuilder("Karthik");
		System.out.println("Hence String Builder is faster than String Buffer.");
	}

}
