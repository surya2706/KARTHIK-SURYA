package exercises;

public class Diff {
int y;
	public void finallyExample() {
		try {
			y = 300;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally method executed. Garbage collection made.");
		}
	}

	public void finalize() {
		System.out.println("Finalize called");
	}

	public final void finalMethod() {
		final int x = 0;
		try{
			//x = y/x;
		}catch(ArithmeticException e){
			System.out.println("Final variabe cannot be reassigned.");
		}

		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diff dif1 = new Diff();
		dif1.finallyExample();
		System.gc();
		dif1.finalize();
		dif1.finalMethod();

	}

}
