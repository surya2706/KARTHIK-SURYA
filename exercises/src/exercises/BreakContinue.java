package exercises;

public class BreakContinue {

	public static void breakDemo() {
		System.out.println("Break demo started");
		for (int i = 0; i < 7; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Loop terminated since i = 4. \nThus break statement demonstrated");
	}

	public static void continueDemo() {
		System.out.println("Continue demo started");
		for (int i = 0; i < 7; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println(
				"If i is a even number, then continue statement skips to next iteration in the loop. \nThus continue statement demonstrated to print even numbers");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		breakDemo();
		continueDemo();

	}

}
