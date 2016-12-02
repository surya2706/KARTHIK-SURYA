package exercises;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListDifference ld = new ListDifference();
		ld.generateRandomNumbers();
		long time = ld.accessNumber(ld.generateRandomNumbers());
		System.out.println(time);
	}

}
