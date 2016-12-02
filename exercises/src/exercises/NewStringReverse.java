package exercises;

public class NewStringReverse {
	static double et1;
	static double et2;
	static double et3;

	public static void string() {
		String s = "surya";
		double st = System.currentTimeMillis();
		System.out.println("String concatenation");

		for (int i = 0; i < 10000; i++) {
			String str = s.concat("Karthik");
		}
		et1 = System.currentTimeMillis() - st;
		
		System.out.println("Time taken: " + et1 + " ms");
	}

	public static void stringBuffer() {
		StringBuffer s = new StringBuffer("Surya");
		double st = System.currentTimeMillis();
		System.out.println("\nStringBuffer concatenation");

		for (int i = 0; i < 10000; i++) {
			StringBuffer str = s.append("Karthik");
		}
		et2 = System.currentTimeMillis() - st;
		System.out.println("Time taken: " + et2 + " ms");
	}

	public static void stringBuilder() {
		System.out.println("\nStringBuilder concatenation");
		double st = System.currentTimeMillis();

		StringBuilder sb = new StringBuilder("Surya");
		for (int i = 0; i < 10000; i++) {
			StringBuilder str = sb.append("Karthik");
		}
		et3 = System.currentTimeMillis() - st;
		System.out.println("Time taken: " + et3 + " "	+ "ms");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		string();
		stringBuffer();
		stringBuilder();
		double smallest;
		if((et1 < et2) && (et1 < et3)){
			System.out.println("\nString is fastest.");		
		}else if((et2 < et1) && (et2 < et3)){
			System.out.println("\nStringBuffer is fastest.");
		}else{
			System.out.println("\nStringBuilder is fastest.");
		}
		
		
	}

}
