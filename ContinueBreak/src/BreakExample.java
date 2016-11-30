
public class BreakExample {

	public static void forEx() {

		System.out.println("Break demo in for loop");
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
	}

	public static void whileEx() {
		System.out.println("\nBreak demo in while loop");
		int i = 0;
		while (i < 10) {
			// System.out.println(i);
			if (i == 5) {
				break;
			}
			System.out.println(i);
			i++;
		}
	}

	public static void switchEx(char grade) {
		System.out.println("\nBreak demo in Switch statement");
		//char grade = 'C';
		switch (grade) {
		case 'A':
			System.out.println("A grade");
			break;
		case 'B':
			System.out.println("B grade");
			break;
		case 'C':
			System.out.println("C grade");
			break;
		default:
			System.out.println("No grade");
		}
		// System.out.println("Your grade is " + grade);
	}

	public static void main(String[] args) {
		forEx();
		whileEx();
		switchEx('C');
	}
}
