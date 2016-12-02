package exercises;

public class EqualExample {

	public static void equalex() {
		String i1 = new String("Object1");
		String i2 = new String("Object1");
		if (i1 == i2) {
			System.out.println("i1 == i2 is true");
		} else {
			System.out.println("i1 == i2 is false");
		}
		System.out.println("Since '==' compares the memory space of two objects, it returns false.");
	}

	public static void equalsex() {
		String i1 = new String("Object1");
		String i2 = new String("Object1");
		if (i1.equals(i2)) {
			System.out.println("i1.equals(i2) is true");
		} else {
			System.out.println("i1.equals(i2) is false");
		}
		System.out.println("Since '.equals' compares the objects inside the memory, it returns true.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		equalex();
		equalsex();
	}

}
